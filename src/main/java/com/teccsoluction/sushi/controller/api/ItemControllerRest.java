package com.teccsoluction.sushi.controller.api;

import com.teccsoluction.sushi.dao.generic.ItemDAO;
import com.teccsoluction.sushi.entidade.Item;
import com.teccsoluction.sushi.framework.AbstractRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "item")
public class ItemControllerRest extends AbstractRestController<Item> {

    private
    final
    ItemDAO dao;

    @Autowired
    public ItemControllerRest(ItemDAO dao) {
        this.dao = dao;
    }


    protected ItemDAO getDao() {
        return dao;
    }

    @Override
    protected void validateSave(Item item) {

    }

    @Override
    protected void validateUpdate(Item item) {

    }

    @Override
    protected void validateDelete(Long id) {

    }


}
