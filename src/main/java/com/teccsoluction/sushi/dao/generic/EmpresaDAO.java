package com.teccsoluction.sushi.dao.generic;

import com.teccsoluction.sushi.entidade.Empresa;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;


@Repository
public class EmpresaDAO extends AbstractEntityDao<Empresa> {


    public EmpresaDAO() {
        super(Empresa.class, "Empresa");
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
