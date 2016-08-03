package com.teccsoluction.sushi.dao.generic;

import com.teccsoluction.sushi.entidade.Garcon;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;


@Repository
public class GarconDAO extends AbstractEntityDao<Garcon> {


    public GarconDAO() {
        super(Garcon.class, "Garcon");
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
