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

/**
 *
 * @author j
 */
public class pedido implements Serializable {

    private static final long serialVersionUID = 1l; 
    
    private Long id; 
    private Date dataCriacao; 
    private BigDecimal valorFrete;
    private BigDecimal valorDesconto;
    private BigDecimal valorTotal;
    private statusPedido staPedido;
    private formaPagamento forPagamento;
    private usuario vendedor;
    private cliente cliente; 
    private enderecoEntrega endeEntrega;
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
