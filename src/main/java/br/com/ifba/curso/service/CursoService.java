/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.service;

// Importa a classe CursoDao para operações de acesso a dados e a entidade Curso.
import br.com.ifba.dao.CursoDao;
import br.com.ifba.entity.Curso;
import java.util.List;

// Define a classe CursoService que implementa a interface CursoIService, fornecendo a lógica de negócios para a entidade Curso.
public class CursoService implements CursoIService {
    
    // Instância de CursoDao, responsável pelas operações de persistência relacionadas ao Curso.
    private final CursoDao cursoDao = new CursoDao();

    // Salva um novo curso. Verifica se o objeto Curso é nulo antes de delegar ao DAO.
    @Override
    public Curso save(Curso curso) {
        if (curso == null) {
            throw new RuntimeException("Dados do Curso não preenchidos");
        } else {
            return cursoDao.save(curso);
        }
    }

    // Retorna uma lista de todos os cursos disponíveis.
    @Override
    public List<Curso> findAll() {
        return cursoDao.findAll();
    }

    // Atualiza as informações de um curso existente. Verifica se o objeto Curso é nulo antes de delegar ao DAO.
    @Override
    public Curso update(Curso curso) {
        if (curso == null) {
            throw new RuntimeException("Dados do Curso não preenchidos");
        } else {
            return cursoDao.update(curso);
        }
    }

    // Remove um curso. Verifica se o objeto Curso é nulo antes de delegar ao DAO.
    @Override
    public void delete(Curso curso) {
        if (curso == null) {
            throw new RuntimeException("Dados do Curso não preenchidos");
        } else {
            cursoDao.delete(curso);
        }
    }

    // Busca um curso pelo seu identificador único (ID). Verifica se o ID é nulo antes de delegar ao DAO.
    @Override
    public Curso findById(Long id) {
        if (id == null) {
            throw new RuntimeException("Primeiramente preencha o ID");
        } else {
            return cursoDao.findById(id);
        }
    }

    // Busca um curso pelo código do curso. Verifica se o código é nulo antes de delegar ao DAO.
    @Override
    public Curso findByCodCurso(String codcurso) {
        if (codcurso == null) {
            throw new RuntimeException("Primeiramente preencha o Código do curso");
        } else {
            return cursoDao.findByCodCurso(codcurso);
        }
    }
}
