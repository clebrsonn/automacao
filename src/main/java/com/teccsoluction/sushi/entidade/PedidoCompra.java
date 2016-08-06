package com.teccsoluction.sushi.entidade;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDO_COMPRA")
public class PedidoCompra extends Pedido {

    @ManyToOne
    private Fornecedor fornecedor;
}
