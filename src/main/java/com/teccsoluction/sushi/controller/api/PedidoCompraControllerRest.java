package com.teccsoluction.sushi.controller.api;

import com.teccsoluction.sushi.dao.generic.PedidoCompraDAO;
import com.teccsoluction.sushi.entidade.PedidoCompra;
import com.teccsoluction.sushi.framework.AbstractRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pedidocompra")
public class PedidoCompraControllerRest extends AbstractRestController<PedidoCompra> {

    private
    final
    PedidoCompraDAO dao;

    @Autowired
    public PedidoCompraControllerRest(PedidoCompraDAO dao) {
        this.dao = dao;
    }


    protected PedidoCompraDAO getDao() {
        return dao;
    }

    @Override
    protected void validateSave(PedidoCompra pedidoCompra) {

    }

    @Override
    protected void validateUpdate(PedidoCompra pedidoCompra) {

    }

    @Override
    protected void validateDelete(Long id) {

    }

}
