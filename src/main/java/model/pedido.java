/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author j
 */
@Entity
@Table(name = "pedido")
public class pedido implements Serializable {

    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, name = "data_criacao")
    private Date dataCriacao;
    @Column(columnDefinition = "text")
    private String observacao;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false, name = "data_entrega")
    private Date dataEntrega;
    @Column(name = "valor_frete", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorFrete;
    @Column(name = "valor_desconto", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorDesconto;
    @Column(name = "valor_total", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorTotal;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private statusPedido staPedido;
    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pagamento", nullable = false, length = 20)
    private formaPagamento forPagamento;
    @ManyToOne
    @JoinColumn(name = "vendedor_id", nullable = false)
    private usuario vendedor;
     @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private cliente cliente;
    @Embedded
    private enderecoEntrega endeEntrega;
    @OneToMany(mappedBy = "pedido",cascade = CascadeType.ALL , orphanRemoval = true)
    private List<itemPedido> itens = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public statusPedido getStaPedido() {
        return staPedido;
    }

    public void setStaPedido(statusPedido staPedido) {
        this.staPedido = staPedido;
    }

    public formaPagamento getForPagamento() {
        return forPagamento;
    }

    public void setForPagamento(formaPagamento forPagamento) {
        this.forPagamento = forPagamento;
    }

    public usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(usuario vendedor) {
        this.vendedor = vendedor;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public enderecoEntrega getEndeEntrega() {
        return endeEntrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public void setEndeEntrega(enderecoEntrega endeEntrega) {
        this.endeEntrega = endeEntrega;
    }

    public List<itemPedido> getItens() {
        return itens;
    }

    public void setItens(List<itemPedido> itens) {
        this.itens = itens;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final pedido other = (pedido) obj;
        return Objects.equals(this.id, other.id);
    }

}
