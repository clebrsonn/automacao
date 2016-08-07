package com.teccsoluction.sushi.dao.generic;

import com.teccsoluction.sushi.entidade.Cotacao;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;


@Repository
public class CotacaoDAO extends AbstractEntityDao<Cotacao> {


    public CotacaoDAO() {
        super(Cotacao.class, "Cotacao");
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
