package com.teccsoluction.sushi.entidade;

import com.teccsoluction.sushi.util.TipoPedido;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "DEVOLUCAO")
public class Devolucao implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data;

    private String status;

    //venda ou compra
    @Enumerated(EnumType.STRING)
    private TipoPedido tipo;

    private long fornecedor;


    public Devolucao() {
        // TODO Auto-generated constructor stub
    }

    public TipoPedido getTipo() {
        return tipo;
    }

    public void setTipo(TipoPedido tipo) {
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }


    public long getFornecedor() {
        return fornecedor;
    }


    public void setFornecedor(long fornecedor) {
        this.fornecedor = fornecedor;
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
        return "ID DEVOLUÇÃO:" + id;
    }


}
