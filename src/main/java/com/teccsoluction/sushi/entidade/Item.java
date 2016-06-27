package com.teccsoluction.sushi.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ITEM")
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	private String codigo;
	
	private String descricao;
	
	private int qtd;
	
	private double precoUnitario;
	
	private double totalItem;
	
	private long pedido;
	
	
	
	public Item() {
	}
	
	
	public Item(Produto produto,long pedido) {
		
		this.codigo=produto.getCodebar();
		this.descricao=produto.getDescricao();
		this.precoUnitario=produto.getPrecoVenda();
		this.pedido=pedido;
	}





	public long getPedido() {
		return pedido;
	}


	public void setPedido(long pedido) {
		this.pedido = pedido;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQtd() {
		return qtd;
	}


	public void setQtd(int qtd) {
		this.qtd = qtd;
	}


	public double getPrecoUnitario() {
		return precoUnitario;
	}


	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}


	public double getTotalItem() {
		return qtd*precoUnitario;
	}


	public void setTotalItem(double totalItem) {
		this.totalItem = totalItem;
	}


	public long getId() {
		return id;
	}



	@Override
	public String toString() {
		return descricao;
	}


	
	
	

}
