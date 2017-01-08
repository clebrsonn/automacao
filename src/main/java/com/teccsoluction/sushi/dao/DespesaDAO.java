package com.teccsoluction.sushi.dao;

import com.teccsoluction.sushi.entidade.Despesa;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;

@Repository
public class DespesaDAO extends AbstractEntityDao<Despesa> {


    public DespesaDAO() {

        super(Despesa.class, "Despesa");
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
