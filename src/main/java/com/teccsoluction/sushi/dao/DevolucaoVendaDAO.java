package com.teccsoluction.sushi.dao;

import com.teccsoluction.sushi.entidade.DevolucaoVenda;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;


@Repository
public class DevolucaoVendaDAO extends AbstractEntityDao<DevolucaoVenda> {


    public DevolucaoVendaDAO() {
        super(DevolucaoVenda.class, "DevolucaoVenda");
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
