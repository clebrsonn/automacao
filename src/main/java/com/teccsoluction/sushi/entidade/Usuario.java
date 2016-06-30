package com.teccsoluction.sushi.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.teccsoluction.sushi.util.TipoUsuario;

@Entity
@Table(name="USUARIO")
public class Usuario implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="senha")
	private String senha;
	
	@Enumerated(EnumType.ORDINAL)
	private TipoUsuario tipo;
	
	@Column(name="email")
	private String email;
	
	
	



	public Usuario() {
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
	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipo() {
		return tipo;
	}


	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return nome;
	}
	
	

	

}
