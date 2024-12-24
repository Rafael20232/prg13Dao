/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.dao;

import br.com.ifba.entity.Curso;

/**
 *
 * @author Erio
 */
public interface CursoIDao {
    
    public abstract Curso findByCodCurso (String codigoCurso);
    
}
