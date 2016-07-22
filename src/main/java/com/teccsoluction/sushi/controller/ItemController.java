package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.ItemDAO;
import com.teccsoluction.sushi.entidade.Item;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by clebr on 06/07/2016.
 */
@RequestMapping(value = "item/")
public class ItemController extends AbstractController<Item> {


    private @Autowired
    ItemDAO dao;


    public ItemController() {
        super("Item");
    }

    @Override
    protected AbstractEntityDao<Item> getDao() {
        return dao;
    }
}
