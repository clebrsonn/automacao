package com.teccsoluction.sushi.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MESA")
public class Mesa implements Serializable {
	
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
	
	private String status;
	
	@OneToMany
	private List<Pedido> pedidos;
	
	public Mesa() {
		// TODO Auto-generated constructor stub
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}
	
	public List<Pedido> getPedidos(){
		return pedidos;
	}
	
	public void setPedidos(List<Pedido> pedidos){
		this.pedidos = pedidos;
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
		return numero;
	}
	
	
	

}
