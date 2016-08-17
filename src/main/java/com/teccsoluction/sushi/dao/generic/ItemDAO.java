package com.teccsoluction.sushi.dao.generic;


import com.teccsoluction.sushi.entidade.Item;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;


@Repository
public class ItemDAO extends AbstractEntityDao<Item> {


    public ItemDAO() {
        super(Item.class, "Item");
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
