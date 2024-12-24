/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.service;

// Importa a entidade Curso, que será utilizada nos métodos da interface.
import br.com.ifba.entity.Curso;
import java.util.List;

// Define a interface CursoIService, que especifica o contrato para os serviços relacionados à entidade Curso.
public interface CursoIService {
    
    // Declaração de um método abstrato para buscar todos os cursos disponíveis.
    public abstract List<Curso> findAll();
    
    // Declaração de um método abstrato para salvar um novo curso.
    public abstract Curso save(Curso curso);
    
    // Declaração de um método abstrato para atualizar um curso existente.
    public abstract Curso update(Curso curso);
    
    // Declaração de um método abstrato para excluir um curso.
    public abstract void delete(Curso curso);
    
    // Declaração de um método abstrato para buscar um curso pelo seu ID.
    public abstract Curso findById(Long id);
    
    // Declaração de um método abstrato para buscar um curso pelo código do curso.
    public abstract Curso findByCodCurso(String codcurso);
}
