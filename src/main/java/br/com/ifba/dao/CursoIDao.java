/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.dao;

// Importa a entidade Curso, que será utilizada no método declarado na interface.
import br.com.ifba.entity.Curso;

// Define a interface CursoIDao, que especifica o contrato para operações de acesso a dados relacionadas à entidade Curso.
public interface CursoIDao {
    
    // Declaração de um método abstrato para buscar um curso pelo código do curso.
    public abstract Curso findByCodCurso(String codigoCurso);
}

