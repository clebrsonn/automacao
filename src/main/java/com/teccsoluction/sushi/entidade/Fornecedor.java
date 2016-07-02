package com.teccsoluction.sushi.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

@Entity
@Table(name="FORNECEDOR")
public class Fornecedor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name="nome_fantasia")
	private String nomefantasia;
	
	@Column(name="razao_social")
	private String razaoSocial;
	
	@Column(name="cnpj")
	private String cnpj;
	
	@Column(name="inscricaoestadual")
	private String inscricaoestadual;
	
	@OneToMany
	private List<Produto> produtos;
	
	public Fornecedor() {
		produtos = new ArrayList<>();
	}





	public String getNomefantasia() {
		return nomefantasia;
	}





	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}





	public long getId() {
		return id;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getInscricaoestadual() {
		return inscricaoestadual;
	}


	public void setInscricaoestadual(String inscricaoestadual) {
		this.inscricaoestadual = inscricaoestadual;
	}


	@Override
	public String toString() {
		return  nomefantasia;
	}
	
	
	public Lost<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
	
}
