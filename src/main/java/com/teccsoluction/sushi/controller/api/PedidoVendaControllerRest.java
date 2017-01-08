package com.teccsoluction.sushi.controller.api;

import com.teccsoluction.sushi.dao.generic.PedidoVendaDAO;
import com.teccsoluction.sushi.entidade.PedidoVenda;
import com.teccsoluction.sushi.framework.AbstractRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pedidovenda")
public class PedidoVendaControllerRest extends AbstractRestController<PedidoVenda> {

    private
    final
    PedidoVendaDAO dao;

    @Autowired
    public PedidoVendaControllerRest(PedidoVendaDAO dao) {
        this.dao = dao;
    }


    protected PedidoVendaDAO getDao() {
        return dao;
    }

    @Override
    protected void validateSave(PedidoVenda pedidoVenda) {

    }

    @Override
    protected void validateUpdate(PedidoVenda pedidoVenda) {

    }

    @Override
    protected void validateDelete(Long id) {

    }
}