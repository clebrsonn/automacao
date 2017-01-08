package com.teccsoluction.sushi.entidade;

import javax.persistence.*;


@Entity
@Table(name = "DEVOLUCAO_VENDA")
public class DevolucaoVenda extends Devolucao {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@ManyToOne
	@JoinColumn
	private PedidoVenda pedidoVenda;
	
    @OneToOne
    @JoinColumn
    private Estoque estoque;


    public DevolucaoVenda() {
        // TODO Auto-generated constructor stub
    }


    public PedidoVenda getPedidoVenda() {
        return pedidoVenda;
    }


    public void setPedidoVenda(PedidoVenda pedidoVenda) {
        this.pedidoVenda = pedidoVenda;
    }


    public Estoque getEstoque() {
        return estoque;
    }


    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }


}
