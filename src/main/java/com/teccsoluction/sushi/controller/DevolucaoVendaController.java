package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.generic.DevolucaoCompraDAO;
import com.teccsoluction.sushi.dao.generic.DevolucaoVendaDAO;
import com.teccsoluction.sushi.entidade.DevolucaoCompra;
import com.teccsoluction.sushi.entidade.DevolucaoVenda;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "devolucaovenda/")
public class DevolucaoVendaController extends AbstractController<DevolucaoVenda> {

    private
    final
    DevolucaoVendaDAO dao;

    @Autowired
    public DevolucaoVendaController(DevolucaoVendaDAO dao) {
        super("devolucaovenda");
        this.dao = dao;
    }

    @Override
    protected AbstractEntityDao<DevolucaoVenda> getDao() {
        return dao;
    }
}
