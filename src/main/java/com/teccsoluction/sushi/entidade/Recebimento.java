package com.teccsoluction.sushi.entidade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "RECEBIMENTO")
public class Recebimento implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    
    @Temporal(TemporalType.DATE)
    @Column(name="DATA")
    private Date data;
    
    @Column(name="STATUS")
    private String status;
    
    @Column(name="id_fornecedor")
    private Fornecedor fornecedor;
    
    @OneToOne(mappedBy="recebimento")
    private PedidoCompra pedidocompra;

//	@OneToMany
//	private List<Compra> compra;


    //private Pagamento pagamento;
    


    public Recebimento() {
        // TODO Auto-generated constructor stub
    }
    
    
    

    public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
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




	public Fornecedor getFornecedor() {
		return fornecedor;
	}




	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}




	public PedidoCompra getPedidocompra() {
		return pedidocompra;
	}




	public void setPedidocompra(PedidoCompra pedidocompra) {
		this.pedidocompra = pedidocompra;
	}




	@Override
    public String toString() {
        return "ID RECEBIMENTO:" + id;
    }

}
