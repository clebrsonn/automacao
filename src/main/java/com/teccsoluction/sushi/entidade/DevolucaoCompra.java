package com.teccsoluction.sushi.entidade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DEVOLUCAO_COMPRA")
public class DevolucaoCompra extends Devolucao implements Serializable {

    private static final long serialVersionUID = 12L;

    @ManyToOne
    @JoinColumn
    private PedidoCompra pedidoCompra;

    @OneToOne
    @JoinColumn
    private Estoque estoque;

    public PedidoCompra getPedidoCompra() {
        return pedidoCompra;
    }

    public void setPedidoCompra(PedidoCompra pedidoCompra) {
        this.pedidoCompra = pedidoCompra;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
}
