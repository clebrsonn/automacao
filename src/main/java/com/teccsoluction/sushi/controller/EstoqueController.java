package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.generic.EstoqueDAO;
import com.teccsoluction.sushi.entidade.Estoque;
import com.teccsoluction.sushi.framework.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "estoque/")
public class EstoqueController extends AbstractController<Estoque> {

    private
    final
    EstoqueDAO dao;

    @Autowired
    public EstoqueController(EstoqueDAO dao) {
        super("estoque");
        this.dao = dao;
    }

    @Override
    protected EstoqueDAO getDao() {
        return dao;
    }
}
