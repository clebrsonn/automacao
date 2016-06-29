package com.teccsoluction.sushi.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DESPESA")
public class Despesa implements Serializable {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = -6185354829701934086L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="valor")
	private Double valor;
	
	
	
	public Despesa() {
		// TODO Auto-generated constructor stub
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public long getId() {
		return id;
	}



	public Double getValor() {
		return valor;
	}



	public void setValor(Double valor) {
		this.valor = valor;
	}



	@Override
	public String toString() {
		return nome;
	}
	
	
	
	
	
}