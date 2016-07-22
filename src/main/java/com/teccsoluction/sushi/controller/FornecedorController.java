package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.FornecedorDAO;
import com.teccsoluction.sushi.entidade.Fornecedor;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by clebr on 06/07/2016.
 */
@RequestMapping(value = "fornecedor/")
public class FornecedorController extends AbstractController<Fornecedor> {


    private
    @Autowired
    FornecedorDAO dao;


    public FornecedorController() {
        super("Fornecedor");
    }

    @Override
    protected AbstractEntityDao<Fornecedor> getDao() {
        return dao;
    }
}
