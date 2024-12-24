/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.controller;

// Importa a entidade Curso, que será usada nos métodos da interface.
import br.com.ifba.entity.Curso;
import java.util.List;

// Define a interface CursoIController que especifica o contrato para os controladores de Curso.
public interface CursoIController {
    
    // Declaração de um método abstrato para buscar todos os cursos.
    public abstract List<Curso> findAll();
    
    // Declaração de um método abstrato para salvar um novo curso.
    public abstract Curso save(Curso curso);
    
    // Declaração de um método abstrato para atualizar um curso existente.
    public abstract Curso update(Curso curso);
    
    // Declaração de um método abstrato para excluir um curso.
    public abstract void delete(Curso curso);
    
    // Declaração de um método abstrato para buscar um curso pelo ID.
    public abstract Curso findById(Long id);
    
    // Declaração de um método abstrato para buscar um curso pelo código do curso.
    public abstract Curso findByCodCurso(String codcurso);
}

