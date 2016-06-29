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
@Table(name="COMPRA")
public class Compra implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
				
	private Date data;
			
	private String status;
	
	private long pagamento;
	
	private long fornecedor;
	

	public Compra() {
		// TODO Auto-generated constructor stub
	}



	public long getFornecedor() {
		return fornecedor;
	}



	public void setFornecedor(long fornecedor) {
		this.fornecedor = fornecedor;
	}


	public long getPagamento() {
		return pagamento;
	}


	public void setPagamento(long pagamento) {
		this.pagamento = pagamento;
	}
	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}



	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}




	public long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "ID COMPRA:"+id;
	}
	
	
		

}
