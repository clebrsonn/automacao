package com.teccsoluction.sushi.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUTO")
public class Produto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name="codebar")
	private String codebar;
	
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="UM")
	private String um;
	
	
	@Column(name="preco_custo")
	private double precoCusto;
	
	@Column(name="preco_venda")
	private double precoVenda;
	
	@ManyToOne
	private Fornecedor fornecedor
	
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}


	public String getNumero() {
		return codebar;
	}


	public void setCodebar(String codebar) {
		this.codebar = codebar;
	}


	public long getId() {
		return id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getUm() {
		return um;
	}


	public void setUm(String um) {
		this.um = um;
	}


	public double getPrecoCusto() {
		return precoCusto;
	}


	public void setPrecoCusto(double preco) {
		this.precoCusto = preco;
	}


	public double getPrecoVenda() {
		return precoVenda;
	}


	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}


	public String getCodebar() {
		return codebar;
	}
	
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}


	@Override
	public String toString() {
		return  descricao;
	}
	
	
	
	
	
	
	
}
