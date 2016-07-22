package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.entidade.Produto;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by clebr on 06/07/2016.
 */
@RequestMapping(value = "produto/")
public class ProdutoController extends AbstractController<Produto> {


    private
    @Autowired
    ProdutoDAO dao;


    public ProdutoController() {
        super("Produto");
    }

    @Override
    protected AbstractEntityDao<Produto> getDao() {
        return dao;
    }
}
