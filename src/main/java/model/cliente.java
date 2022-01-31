/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author j
 */

@Entity
public class cliente implements Serializable {

    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String documentoReceitaFederal;
    private tipoPessoa tipo;
    @Transient
    private List<endereco> enderecos = new ArrayList<>();
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumentoReceitaFederal() {
        return documentoReceitaFederal;
    }

    public void setDocumentoReceitaFederal(String documentoReceitaFederal) {
        this.documentoReceitaFederal = documentoReceitaFederal;
    }

    public List<endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public tipoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(tipoPessoa tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final cliente other = (cliente) obj;
        return Objects.equals(this.id, other.id);
    }

}
