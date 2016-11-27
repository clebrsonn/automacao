package com.teccsoluction.sushi.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "Garcon")
public class GarconControllerRest extends AbstractController<Garcon> {

    private
    final
    GarconDAO dao;

    @Autowired
    public GarconControllerRest(GarconDAO dao) {
        super("Garcon");
        this.dao = dao;
    }

    @Override
    protected AbstractEntityDao<Garcon> getDao() {
        return dao;
    }
}
