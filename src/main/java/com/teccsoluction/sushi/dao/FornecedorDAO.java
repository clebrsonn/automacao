package com.teccsoluction.sushi.dao;

import com.teccsoluction.sushi.entidade.Fornecedor;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;


@Service
public class FornecedorDAO extends AbstractEntityDao<Fornecedor> {


    public FornecedorDAO() {
        super(Fornecedor.class, "Fornecedor");
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
