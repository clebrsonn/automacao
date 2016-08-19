package com.teccsoluction.sushi.entidade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="COMPOSICAO")
public class Composicao extends Produto implements Serializable {

	private static final long serialVersionUID = 1L;

//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="ID")
//	private long id;

	@Column(name="numero")
	private String numero;

	@Column(name="nome")
	private String nome;
	
	// itens que formam uma composição
	
	@OneToMany
	private List<Item>listaItensComposicao;
	

	public Composicao() {
		// TODO Auto-generated constructor stub
		listaItensComposicao = new ArrayList<>();
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


//	public long getId() {
//		return id;
//	}


	public List<Item> getListaItensComposicao() {
		return listaItensComposicao;
	}


	public void setListaItensComposicao(List<Item> listaItensComposicao) {
		this.listaItensComposicao = listaItensComposicao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return nome;
	}



}
