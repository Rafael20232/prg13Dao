/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.dao;

import br.com.ifba.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericDao;
import jakarta.persistence.NoResultException;

public class CursoDao extends GenericDao <Curso> implements CursoIDao {
    
    @Override
    public Curso findByCodCurso (String codigoCurso) {
        try {
        return entityManager
                .createQuery("SELECT c FROM Curso c WHERE c.codigoCurso = :codigoCurso", Curso.class)
                .setParameter("codigoCurso", codigoCurso)
                .getSingleResult();
        } catch (NoResultException e) {
            return null; 
        }
    }
}
