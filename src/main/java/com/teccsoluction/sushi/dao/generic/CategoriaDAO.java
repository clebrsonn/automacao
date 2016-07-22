package com.teccsoluction.sushi.dao.generic;

import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;


@Service
public class CategoriaDAO extends AbstractEntityDao<Categoria> {


    public CategoriaDAO() {
        super(Categoria.class, "Categoria");
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
