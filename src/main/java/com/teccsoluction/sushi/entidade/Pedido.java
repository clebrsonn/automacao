package com.teccsoluction.sushi.entidade;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="PEDIDO")
public class Pedido implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
		
//	private List<Item> listaItens;
		
	private Date data;
	
	private String mesa;
	
	private String tipo;
	
	private String status;
	
	private double total;
	
	private String garcon;
	
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}





	public String getTipo() {
		return tipo;
	}





	public void setTipo(String tipo) {
		this.tipo = tipo;
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


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public String getGarcon() {
		return garcon;
	}


	public void setGarcon(String garcon) {
		this.garcon = garcon;
	}


	public long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Pedido [id=" + id + "]";
	}
	
	
		

}
