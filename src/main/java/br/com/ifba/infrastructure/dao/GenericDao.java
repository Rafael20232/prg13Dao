/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.dao;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.lang.reflect.ParameterizedType;
import java.util.List;

@SuppressWarnings("unchecked")
public class GenericDao <Entity extends PersistenceEntity> 
        implements GenericIDao <Entity>{
    
    // Gerenciador de entidades do JPA
    protected static EntityManager entityManager;

    // Bloco estático para inicializar o EntityManagerFactory
    static {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("gerenciamento_curso");
        entityManager = factory.createEntityManager();
    }

    // Salva uma entidade no banco de dados
    @Override
    public Entity save(Entity entity) {
        entityManager.getTransaction().begin();  
        entityManager.persist(entity);          
        entityManager.getTransaction().commit(); 
        return entity;
    }

    // Atualiza uma entidade no banco de dados
    @Override
    public Entity update(Entity entity) {
        entityManager.getTransaction().begin(); 
        entityManager.merge(entity);        
        entityManager.getTransaction().commit();
        return entity;
    }

    // Remove uma entidade do banco de dados
    @Override
    public void delete(Entity entity) {
        entity = findById(entity.getId());
        entityManager.getTransaction().begin(); 
        entityManager.remove(entity);           
        entityManager.getTransaction().commit();
    }

    // Retorna uma lista de todas as entidades do tipo especificado
    @Override
    public List<Entity> findAll() {
        return entityManager.createQuery("from " + getTypeClass().getName())
                            .getResultList();  
    }

    // Busca uma entidade pelo ID
    @Override
    public Entity findById(Long id) {
        return (Entity) entityManager.find(getTypeClass(), id); 
    }

    // Obtém a classe do tipo genérico (Entity)
    protected Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass())        
                .getActualTypeArguments()[0];   
        return clazz;
    }
}
