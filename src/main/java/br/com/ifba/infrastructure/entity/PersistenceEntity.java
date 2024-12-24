/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.entity;

// Importa anotações da API JPA para gerenciamento de entidades e seus identificadores.
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

// Define uma classe base para entidades persistidas, compartilhando atributos e comportamentos comuns.
@MappedSuperclass
public class PersistenceEntity {

    // Especifica que o atributo 'id' é a chave primária da entidade.
    @Id

    // Define que o valor do 'id' será gerado automaticamente pelo provedor de persistência.
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // Getter para obter o valor do identificador.
    public long getId() {
        return id;
    }

    // Setter para definir o valor do identificador.
    public void setId(long id) {
        this.id = id;
    }
}

