package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.ClienteDAO2;
import com.teccsoluction.sushi.entidade.Cliente;
import com.teccsoluction.sushi.framework.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "cliente")
@Controller
public class ClienteController extends AbstractController<Cliente> {

    private
    final
    ClienteDAO2 dao;

    @Autowired
    public ClienteController(ClienteDAO2 dao) {
        super("cliente");
        this.dao = dao;
    }


    @Override
    protected ClienteDAO2 getDao() {
        return dao;
    }


}
