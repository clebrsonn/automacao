package com.teccsoluction.sushi.dao.generic;

import com.teccsoluction.sushi.entidade.Cliente;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;


@Service
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
