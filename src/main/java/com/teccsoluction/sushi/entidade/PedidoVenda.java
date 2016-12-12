package com.teccsoluction.sushi.entidade;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.teccsoluction.sushi.util.OrigemPedido;
import com.teccsoluction.sushi.util.TipoPedido;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "PEDIDO_VENDA")
public class PedidoVenda extends Pedido {

    //CLIENTE DO PEDIDO DE VENDA
    @ManyToOne
    @JoinColumn
    private Cliente cliente;


    // VENDA OOU COMPRA
    @Enumerated(EnumType.ORDINAL)
    private TipoPedido tipo;


    // VENDA OOU COMPRA
    @Enumerated(EnumType.STRING)
    private OrigemPedido origempedido;


    //LISTA DE ITENS DO PEDIDO DE VENDA
//    @OneToMany
//    private List<Item> listaItensVenda;





	//lista de devolucoes de compra
    @JsonIgnore
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy="pedidoVenda")
    private List<DevolucaoVenda> listaDevolucao;


    //CONSTRUTOR PADRÃO
    public PedidoVenda() {

        listaDevolucao = new ArrayList<>();
        tipo.VENDA.values();
    }


    public TipoPedido getTipo() {
//    	TipoPedido tipovenda = tipo.VENDA;
        return tipo;
    }

    public void setTipo(TipoPedido tipo) {
        this.tipo = tipo;
    }


    public OrigemPedido getOrigemPedido() {

        return origempedido;
    }


    public void setOrigemPedido(OrigemPedido origem) {
        this.origempedido = origem;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


//
//	public List<Item> getListaItensVenda() {
//		return listaItensVenda;
//	}
//
//
//
//	public void setListaItensVenda(List<Item> listaItensVenda) {
//		this.listaItensVenda = listaItensVenda;
//	}


    public List<DevolucaoVenda> getListaDevolucao() {
        return listaDevolucao;
    }


    public void setListaDevolucao(List<DevolucaoVenda> listaDevolucao) {
        this.listaDevolucao = listaDevolucao;
    }


}
