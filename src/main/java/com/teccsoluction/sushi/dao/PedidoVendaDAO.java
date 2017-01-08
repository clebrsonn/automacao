package com.teccsoluction.sushi.dao;

import com.teccsoluction.sushi.entidade.PedidoVenda;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;


@Repository
public class PedidoVendaDAO extends AbstractEntityDao<PedidoVenda> {

    public PedidoVendaDAO() {
        // TODO Auto-generated constructor stub
        super(PedidoVenda.class, "PedidoVenda");
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
