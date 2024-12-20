
package br.com.ifba;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CursoSave {
    
    private final static EntityManagerFactory entityManagerFactory = 
            Persistence.createEntityManagerFactory("gerenciamento_curso");
    
    
    private final static EntityManager entityManager = 
            entityManagerFactory.createEntityManager();
    
    
    public static void main(String[] args) {
        
            Curso curso = new Curso();
            curso.setNome("Análise e Desenvolvimento de Sistemas");
            curso.setCodigoCurso("ADS");
            curso.setAtivo(true);
            
            entityManager.getTransaction().begin();
            entityManager.persist(curso);
            entityManager.getTransaction().commit();
            
            entityManager.close();
            entityManagerFactory.close();
    }
}
