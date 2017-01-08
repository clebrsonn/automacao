package com.teccsoluction.sushi.dao;

import com.teccsoluction.sushi.entidade.PedidoCompra;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;


@Repository
public class PedidoCompraDAO extends AbstractEntityDao<PedidoCompra> {


    public PedidoCompraDAO() {
        // TODO Auto-generated constructor stub

        super(PedidoCompra.class, "PedidoCompra");

    }

    @Override
    protected void appendPredicate(StringBuilder predicate) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void setParameters(TypedQuery<?> query) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void appendOrder(StringBuilder predicate) {
        // TODO Auto-generated method stub

    }


}
