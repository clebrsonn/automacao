package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.CategoriaDAO;
import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by clebr on 21/07/2016.
 */
@Controller
@RequestMapping(value = "categoria")
public class CategoriaController extends AbstractController<Categoria> {


    private
    final
    CategoriaDAO dao;

    @Autowired
    public CategoriaController(CategoriaDAO dao) {
        super("categoria");
        this.dao = dao;
    }
    @Override
    protected AbstractEntityDao<Categoria> getDao() {
        return dao;
    }
}
