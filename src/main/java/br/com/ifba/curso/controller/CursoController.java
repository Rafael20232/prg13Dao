/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.controller;

// Importa o serviço de curso e a entidade Curso, além de classes utilitárias.
import br.com.ifba.curso.service.CursoService;
import br.com.ifba.entity.Curso;
import java.util.List;

// Define a classe CursoController que implementa a interface CursoIController.
public class CursoController implements CursoIController {
    
    // Instância do serviço CursoService usada para manipular as operações de Curso.
    private final CursoService cursoIService = new CursoService();
    
    // Implementação do método findAll para retornar todos os cursos.
    @Override
    public List<Curso> findAll() throws RuntimeException {
        return cursoIService.findAll();
    }
    
    // Implementação do método save para salvar um novo curso.
    @Override
    public Curso save(Curso curso) throws RuntimeException {
        return cursoIService.save(curso);
    }
    
    // Implementação do método update para atualizar um curso existente.
    @Override
    public Curso update(Curso curso) throws RuntimeException {
        return cursoIService.update(curso);
    }
    
    // Implementação do método delete para remover um curso.
    @Override
    public void delete(Curso curso) throws RuntimeException {
        cursoIService.delete(curso);
    }
    
    // Implementação do método findById para buscar um curso pelo seu ID.
    @Override
    public Curso findById(Long id) throws RuntimeException {
        return cursoIService.findById(id);
    }

    // Implementação do método findByCodCurso para buscar um curso pelo código do curso.
    @Override
    public Curso findByCodCurso(String codcurso) {
        return cursoIService.findByCodCurso(codcurso);
    }
}

