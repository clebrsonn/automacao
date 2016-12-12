package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.generic.PagamentoDAO;
import com.teccsoluction.sushi.entidade.Pagamento;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "pagamento/")
public class PagamentoController extends AbstractController<Pagamento> {


    private
    final
    PagamentoDAO dao;

    @Autowired
    public PagamentoController(PagamentoDAO dao) {

        super("pagamento");
        this.dao = dao;
    }


    @Override
    protected AbstractEntityDao<Pagamento> getDao() {
        // TODO Auto-generated method stub
        return dao;
    }
}
