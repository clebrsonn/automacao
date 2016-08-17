package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.generic.CaixaDAO;
import com.teccsoluction.sushi.dao.generic.GarconDAO;
import com.teccsoluction.sushi.entidade.Caixa;
import com.teccsoluction.sushi.entidade.Garcon;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "caixa/")
public class CaixaController extends AbstractController<Caixa> {

    private
    final
    CaixaDAO dao;

    @Autowired
    public CaixaController(CaixaDAO dao) {
        super("caixa");
        this.dao = dao;
    }

    @Override
    protected AbstractEntityDao<Caixa> getDao() {
        return dao;
    }
}
