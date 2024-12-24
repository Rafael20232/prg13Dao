/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.entity;

// Importa classes e interfaces relacionadas à persistência e serialização.
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

// Declara a classe Curso como uma entidade JPA, mapeada para a tabela "curso" no banco de dados.
@Entity
@Table(name = "curso")
public class Curso extends PersistenceEntity implements Serializable {
    
    // Define a coluna "nome" no banco de dados, que não pode ser nula.
    @Column(name = "nome", nullable = false)
    private String nome;
    
    // Define a coluna "codigo_curso" como única e não nula.
    @Column(name = "codigo_curso", nullable = false, unique = true)
    private String codigoCurso;
    
    // Define a coluna "Ativo", que representa o status do curso (ativo/inativo).
    @Column(name = "Ativo")
    private Boolean ativo;

    // Getter para o atributo nome.
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo codigoCurso.
    public String getCodigoCurso() {
        return codigoCurso;
    }

    // Setter para o atributo codigoCurso.
    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    // Getter para o atributo ativo.
    public Boolean getAtivo() {
        return ativo;
    }

    // Setter para o atributo ativo.
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
