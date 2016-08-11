package com.teccsoluction.sushi.dao.generic;

import com.teccsoluction.sushi.entidade.DevolucaoCompra;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;


@Repository
public class DevolucaoCompraDAO extends AbstractEntityDao<DevolucaoCompra> {


    public DevolucaoCompraDAO() {
        super(DevolucaoCompra.class, "DevolucaoCompra");
    }

    @Override
    protected void appendPredicate(StringBuilder predicate) {

    }

    @Override
    protected void setParameters(TypedQuery<?> query) {

    }

    @Override
    protected void appendOrder(StringBuilder predicate) {

    }
}
