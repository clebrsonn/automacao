package com.teccsoluction.sushi.dao.generic;

import com.teccsoluction.sushi.entidade.Desconto;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;

@Repository
public class DescontoDAO extends AbstractEntityDao<Desconto> {


    public DescontoDAO() {

        super(Desconto.class, "Desconto");

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
