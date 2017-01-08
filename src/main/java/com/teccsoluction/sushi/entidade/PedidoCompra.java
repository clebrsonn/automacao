package com.teccsoluction.sushi.entidade;

import javax.persistence.*;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PEDIDO_COMPRA")
public class PedidoCompra extends Pedido {
	
	 @JsonIgnore
	 @LazyCollection(LazyCollectionOption.TRUE)
    @ManyToOne
    @JoinColumn
    private Fornecedor fornecedor;

    @OneToOne(orphanRemoval = true)
    @JoinColumn
    private Recebimento recebimento;

    @JsonIgnore
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "pedidoCompra")
    private List<DevolucaoCompra> devolucaoCompra;


    public PedidoCompra() {
      //  devolucaoCompra = new ArrayList<>();
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Recebimento getRecebimento() {
        return recebimento;
    }

    public void setRecebimento(Recebimento recebimento) {
        this.recebimento = recebimento;
    }

    public List<DevolucaoCompra> getDevolucaoCompra() {
        return devolucaoCompra;
    }

    public void setDevolucaoCompra(List<DevolucaoCompra> devolucaoCompra) {
        this.devolucaoCompra = devolucaoCompra;
    }
}
