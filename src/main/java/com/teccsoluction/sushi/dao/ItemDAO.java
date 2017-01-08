package com.teccsoluction.sushi.dao;


import com.teccsoluction.sushi.entidade.Item;
import com.teccsoluction.sushi.entidade.Pagamento;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;


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

    //PEGA OS ITENS POR id do PEDIDO
    public List<Item> getAllItens(long id) {
        List<Item> result = manager.createQuery("SELECT p FROM Item p where pedido_ID=" + id, Item.class).getResultList();
        return result;
    }

}
