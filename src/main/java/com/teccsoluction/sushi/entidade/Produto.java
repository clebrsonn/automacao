package com.teccsoluction.sushi.entidade;

import com.teccsoluction.sushi.util.UnidadeMedida;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUTO")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "CODEBAR")
	private String codebar;

	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "UN_MEDIDA")
	@Enumerated(EnumType.STRING)
	private UnidadeMedida un_medida;

	@Column(name = "PRECO_CUSTO")
	private double precoCusto;

	@Column(name = "PRECO_VENDA")
	private double precoVenda;

	@ManyToOne
	@JoinColumn
	private Fornecedor fornecedor;

	// @OneToMany(mappedBy = "produto")
	// private List<Item> items;

	@ManyToOne
	@JoinColumn
	private Categoria categoria;

	public Produto() {
		// TODO Auto-generated constructor stub
		// items = new ArrayList<Item>();
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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

	public void setUn_medida(UnidadeMedida un_medida) {
		this.un_medida = un_medida;
	}

	public UnidadeMedida getUn_medida() {
		return un_medida;
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

	// public List<Item> getItems() {
	// return items;
	// }
	//
	//
	// public void setItems(List<Item> items) {
	// this.items = items;
	// }

	@Override
	public String toString() {
		return descricao;
	}

}
