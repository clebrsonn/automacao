package com.teccsoluction.sushi.entidade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="SERVICO")
public class Servico implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	
	@Column(name="numero")
	private String numero;	
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="preco")
	private double preco;
	

	
	public Servico() {
		// TODO Auto-generated constructor stub
	}
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public long getId() {
		return id;
	}



	@Override
	public String toString() {
		return  nome ;
	}
	
	
	
	
	
}
