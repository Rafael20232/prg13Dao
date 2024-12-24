/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.infrastructure.dao;

// Importa a classe PersistenceEntity, que é a classe base para todas as entidades persistidas.
import br.com.ifba.infrastructure.entity.PersistenceEntity;

// Importa a classe List para trabalhar com listas de entidades.
import java.util.List;

// Define uma interface genérica para operações de persistência em entidades.
public interface GenericIDao<Entity extends PersistenceEntity> {

    /**
     * Salva um objeto do tipo genérico (Entity) no banco de dados.
     * @param obj O objeto a ser salvo.
     * @return O objeto salvo.
     */
    public abstract Entity save(Entity obj);

    /**
     * Atualiza um objeto existente no banco de dados.
     * @param obj O objeto a ser atualizado.
     * @return O objeto atualizado.
     */
    public abstract Entity update(Entity obj);

    /**
     * Remove um objeto do banco de dados.
     * @param obj O objeto a ser removido.
     */
    public abstract void delete(Entity obj);

    /**
     * Retorna uma lista de todos os objetos do tipo genérico (Entity) no banco de dados.
     * @return Uma lista contendo todos os objetos do tipo Entity.
     */
    public abstract List<Entity> findAll();

    /**
     * Busca um objeto pelo ID no banco de dados.
     * @param id O identificador único do objeto.
     * @return O objeto encontrado ou null se não for encontrado.
     */
    public abstract Entity findById(Long id);
}

