package com.teccsoluction.sushi.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teccsoluction.sushi.dao.generic.PedidoCompraDAO;
import com.teccsoluction.sushi.entidade.PedidoCompra;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

@RestController
@RequestMapping(value = "PedidoCompra")
public class PedidoCompraControllerRest {

    private
    final
    PedidoCompraDAO dao;

    @Autowired
    public PedidoCompraControllerRest(PedidoCompraDAO dao) {
        this.dao = dao;
    }


    protected AbstractEntityDao<PedidoCompra> getDao() {
        return dao;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<PedidoCompra> buscarEntity(@PathVariable long id) {
    	PedidoCompra pedidovenda = getDao().PegarPorId(id);
        if (pedidovenda == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(pedidovenda	, HttpStatus.OK);
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResponseEntity AdicionarEntity(PedidoCompra entity) {

        try {
            getDao().add(entity);
            return new ResponseEntity<>(entity, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<PedidoCompra> listarEntity() {
        return getDao().getAll();

    }

}
