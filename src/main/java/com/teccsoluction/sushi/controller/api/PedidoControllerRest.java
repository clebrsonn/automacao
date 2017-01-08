package com.teccsoluction.sushi.controller.api;

import com.teccsoluction.sushi.dao.PedidoDAO;
import com.teccsoluction.sushi.entidade.Pedido;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import com.teccsoluction.sushi.framework.AbstractRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pedido")
public class PedidoControllerRest extends AbstractRestController<Pedido> {

    private
    final
    PedidoDAO dao;

    @Autowired
    public PedidoControllerRest(PedidoDAO dao) {
        this.dao = dao;
    }


    protected AbstractEntityDao<Pedido> getDao() {
        return dao;
    }

    @Override
    protected void validateSave(Pedido pedido) {

    }

    @Override
    protected void validateUpdate(Pedido pedido) {

    }

    @Override
    protected void validateDelete(Long id) {

    }


}
