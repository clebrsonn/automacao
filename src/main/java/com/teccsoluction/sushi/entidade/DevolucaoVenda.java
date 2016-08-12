package com.teccsoluction.sushi.entidade;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "DEVOLUCAO_VENDA")
public class DevolucaoVenda extends Devolucao implements Serializable {
	
	private static final long serialVersionUID = 11L;

	
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
