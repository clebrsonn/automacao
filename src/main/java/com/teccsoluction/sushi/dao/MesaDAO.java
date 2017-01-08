package com.teccsoluction.sushi.dao;

import com.teccsoluction.sushi.entidade.Mesa;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;

@Repository
public class MesaDAO extends AbstractEntityDao<Mesa> {

    public MesaDAO() {
        // TODO Auto-generated constructor stub
        super(Mesa.class, "Mesa");
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
