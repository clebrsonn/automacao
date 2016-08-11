package com.teccsoluction.sushi.dao.generic;

import com.teccsoluction.sushi.entidade.Estoque;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;


@Repository
public class EstoqueDAO extends AbstractEntityDao<Estoque> {


    public EstoqueDAO() {
        super(Estoque.class, "Estoque");
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
