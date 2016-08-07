package com.teccsoluction.sushi.entidade;

import com.teccsoluction.sushi.util.TipoPedido;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "PEDIDO_VENDA")
public class PedidoVenda extends Pedido {

    //CLIENTE DO PEDIDO DE VENDA
    @ManyToOne
    @JoinColumn
    private Cliente cliente;
    
    //LISTA DE ITENS DO PEDIDO DE VENDA
//    @OneToMany
//    private List<Item> listaItensVenda;
    
    //lista de devoluções de compra
    @OneToMany(mappedBy="pedidoVenda")
    private List<DevolucaoVenda> listaDevolucao;
    
    
    
    

    //CONSTRUTOR PADRÃO
    public PedidoVenda() {
    	
    	listaDevolucao = new ArrayList<>(); 
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
