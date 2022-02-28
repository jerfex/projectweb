/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 *
 * @author j
 */
@Embeddable
public class enderecoEntrega  implements Serializable {

    private static final long serialVersionUID = 1l;
    
    @Embedded
    @Column(name = "entrega_logradouro",nullable = false, length = 150)
    private String logradouro;
    @Column(name = "entrega_numeoro",nullable = false, length = 20)
    private String numero;
    @Column(name = "entrega_complemento", length = 150)
    private String complemento;
    @Column(name = "entrega_cidade",nullable = false, length = 60)
    private String cidade;
    @Column(name = "entrega_uf",nullable = false, length = 60)
    private String uf;
    @Column(name = "entrega_cep",nullable = false, length = 150)
    private String cep; 

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
}
