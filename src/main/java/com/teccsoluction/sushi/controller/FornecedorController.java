package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.FornecedorDAO;
import com.teccsoluction.sushi.entidade.Fornecedor;
import com.teccsoluction.sushi.framework.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by clebr on 06/07/2016.
 */
@Controller
@RequestMapping(value = "fornecedor/")
public class FornecedorController extends AbstractController<Fornecedor> {

    private final FornecedorDAO dao;

    @Autowired
    public FornecedorController(FornecedorDAO dao) {
        super("fornecedor");
        this.dao = dao;
    }

    @Override
    protected FornecedorDAO getDao() {
        return dao;
    }
}
