/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.dao;

// Importa classes para gerenciar entidades, persistência e reflexões genéricas.
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.lang.reflect.ParameterizedType;
import java.util.List;

// Suprime avisos do compilador relacionados ao uso genérico sem verificação explícita.
@SuppressWarnings("unchecked")

// Define a classe genérica GenericDao para operações de persistência em entidades que estendem PersistenceEntity.
public class GenericDao<Entity extends PersistenceEntity> 
        implements GenericIDao<Entity> {
    
    // Gerenciador de entidades usado para operações no banco de dados.
    protected static EntityManager entityManager;

    // Bloco estático para inicializar o EntityManagerFactory e o EntityManager.
    static {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("gerenciamento_curso");
        entityManager = factory.createEntityManager();
    }

    // Salva uma entidade no banco de dados.
    @Override
    public Entity save(Entity entity) {
        entityManager.getTransaction().begin();  // Inicia uma transação.
        entityManager.persist(entity);           // Persiste a entidade no banco.
        entityManager.getTransaction().commit(); // Confirma a transação.
        return entity;
    }

    // Atualiza uma entidade no banco de dados.
    @Override
    public Entity update(Entity entity) {
        entityManager.getTransaction().begin(); // Inicia uma transação.
        entityManager.merge(entity);            // Atualiza a entidade existente.
        entityManager.getTransaction().commit();// Confirma a transação.
        return entity;
    }

    // Remove uma entidade do banco de dados.
    @Override
    public void delete(Entity entity) {
        entity = findById(entity.getId());      // Recupera a entidade do banco.
        entityManager.getTransaction().begin();// Inicia uma transação.
        entityManager.remove(entity);          // Remove a entidade.
        entityManager.getTransaction().commit();// Confirma a transação.
    }

    // Retorna uma lista de todas as entidades do tipo especificado.
    @Override
    public List<Entity> findAll() {
        return entityManager.createQuery("from " + getTypeClass().getName())
                            .getResultList();  // Executa a consulta JPQL.
    }

    // Busca uma entidade pelo ID.
    @Override
    public Entity findById(Long id) {
        return (Entity) entityManager.find(getTypeClass(), id); // Localiza a entidade pelo ID.
    }

    // Obtém a classe do tipo genérico (Entity) usando reflexão.
    protected Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass())        // Obtém o tipo genérico da superclasse.
                .getActualTypeArguments()[0];   // Recupera o primeiro argumento do tipo genérico.
        return clazz;
    }
}

