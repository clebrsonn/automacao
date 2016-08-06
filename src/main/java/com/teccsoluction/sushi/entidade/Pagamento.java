package com.teccsoluction.sushi.entidade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="PAGAMENTO")
public class Pagamento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="parcelas")
	private int parcelas;
	
	
	
	public Pagamento() {
		// TODO Auto-generated constructor stub
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	@Override
	public String toString() {
		return nome;
	}


	@ManyToOne(optional = false)
	private Pedido pedido;

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}