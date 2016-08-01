package com.teccsoluction.sushi.dao.generic;

import com.teccsoluction.sushi.entidade.Cliente;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;


@Repository
public class ClienteDAO extends AbstractEntityDao<Cliente> {


    public ClienteDAO() {
        super(Cliente.class, "Cliente");
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
