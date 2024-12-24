/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.dao;

// Importa a entidade Curso e a classe base GenericDao, além de uma exceção para tratar resultados nulos em consultas.
import br.com.ifba.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericDao;
import jakarta.persistence.NoResultException;

// Define a classe CursoDao que estende a funcionalidade de GenericDao para a entidade Curso e implementa a interface CursoIDao.
public class CursoDao extends GenericDao<Curso> implements CursoIDao {
    
    // Implementação do método findByCodCurso para buscar um curso com base no código do curso.
    @Override
    public Curso findByCodCurso(String codigoCurso) {
        try {
            // Realiza uma consulta JPQL para buscar o curso pelo código fornecido.
            return entityManager
                    .createQuery("SELECT c FROM Curso c WHERE c.codigoCurso = :codigoCurso", Curso.class)
                    .setParameter("codigoCurso", codigoCurso) // Define o valor do parâmetro na consulta.
                    .getSingleResult(); // Retorna o único resultado encontrado.
        } catch (NoResultException e) {
            // Retorna null se nenhum resultado for encontrado, evitando exceções.
            return null;
        }
    }
}

