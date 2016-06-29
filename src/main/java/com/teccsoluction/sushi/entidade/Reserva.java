package com.teccsoluction.sushi.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESERVA")
public class Reserva implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1943901563720349308L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="data")
	private Date data;
	
	@Column(name="mesa")
	private String mesa;
	
	@Column(name="hora")
	private String hora;
	
	
	public Reserva() {
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


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getMesa() {
		return mesa;
	}


	public void setMesa(String mesa) {
		this.mesa = mesa;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	@Override
	public String toString() {
		return "Reserva :"+data+hora+mesa;
	}
	
	
	
	
	
	
}

