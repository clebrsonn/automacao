package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.generic.ServicoDAO;
import com.teccsoluction.sushi.entidade.Servico;
import com.teccsoluction.sushi.framework.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "servico/")
public class ServicoController extends AbstractController<Servico> {

    private
    final
    ServicoDAO dao;

    @Autowired
    public ServicoController(ServicoDAO dao) {

        super("servico");
        this.dao = dao;


    }


    @Override
    protected ServicoDAO getDao() {
        // TODO Auto-generated method stub
        return dao;
    }
}
