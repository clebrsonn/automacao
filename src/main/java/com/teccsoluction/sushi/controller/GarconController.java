package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.generic.GarconDAO;
import com.teccsoluction.sushi.entidade.Garcon;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "Garcon")
public class GarconController extends AbstractController<Garcon> {

    private
    final
    GarconDAO dao;

    @Autowired
    public GarconController(GarconDAO dao) {
        super("garcon");
        this.dao = dao;
    }

    @Override
    protected AbstractEntityDao<Garcon> getDao() {
        return dao;
    }
}
