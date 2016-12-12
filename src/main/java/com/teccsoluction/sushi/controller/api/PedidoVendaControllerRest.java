package com.teccsoluction.sushi.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teccsoluction.sushi.dao.generic.PedidoVendaDAO;
import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.entidade.PedidoVenda;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

@RestController
@RequestMapping(value = "PedidoVenda")
public class PedidoVendaControllerRest {

    private
    final
    PedidoVendaDAO dao;

    @Autowired
    public PedidoVendaControllerRest(PedidoVendaDAO dao) {
        this.dao = dao;
    }


    protected AbstractEntityDao<PedidoVenda> getDao() {
        return dao;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<PedidoVenda> buscarEntity(@PathVariable long id) {
    	PedidoVenda pedidovenda = getDao().PegarPorId(id);
        if (pedidovenda == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(pedidovenda	, HttpStatus.OK);
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResponseEntity AdicionarEntity(PedidoVenda entity) {

        try {
            getDao().add(entity);
            return new ResponseEntity<>(entity, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<PedidoVenda> listarEntity() {
        return getDao().getAll();

    }

}
