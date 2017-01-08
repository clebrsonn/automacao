package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.PromocaoDAO;
import com.teccsoluction.sushi.entidade.Promocao;
import com.teccsoluction.sushi.framework.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "promocao/")
public class PromocaoController extends AbstractController<Promocao> {

    private
    final
    PromocaoDAO dao;

    @Autowired
    public PromocaoController(PromocaoDAO dao) {

        super("promocao");
        this.dao = dao;
    }

    @Override
    protected PromocaoDAO getDao() {
        // TODO Auto-generated method stub
        return dao;
    }
}
