package com.teccsoluction.sushi.dao.generic;

import com.teccsoluction.sushi.entidade.Caixa;
import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;


@Repository
public class CaixaDAO extends AbstractEntityDao<Caixa> {


    public CaixaDAO() {
        super(Caixa.class, "Caixa");
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
