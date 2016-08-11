package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.generic.DevolucaoCompraDAO;
import com.teccsoluction.sushi.entidade.DevolucaoCompra;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "devolucaocompra/")
public class DevolucaoCompraController extends AbstractController<DevolucaoCompra> {

    private
    final
    DevolucaoCompraDAO dao;

    @Autowired
    public DevolucaoCompraController(DevolucaoCompraDAO dao) {
        super("devolucaocompra");
        this.dao = dao;
    }

    @Override
    protected AbstractEntityDao<DevolucaoCompra> getDao() {
        return dao;
    }
}
