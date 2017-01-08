package com.teccsoluction.sushi.dao;

import com.teccsoluction.sushi.entidade.Devolucao;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;

@Repository
public class DevolucaoDAO extends AbstractEntityDao<Devolucao> {


    public DevolucaoDAO() {

        super(Devolucao.class, "Devolucao");
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
