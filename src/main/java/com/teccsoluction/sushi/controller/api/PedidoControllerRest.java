package com.teccsoluction.sushi.controller.api;

import com.teccsoluction.sushi.dao.generic.PedidoDAO;
import com.teccsoluction.sushi.entidade.Pedido;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "pedido")
public class PedidoControllerRest {

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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pedido> buscarEntity(@PathVariable long id) {
    	Pedido pedido = getDao().PegarPorId(id);
        if (pedido == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(pedido, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity AdicionarEntity(Pedido entity) {

        try {
            getDao().add(entity);
            return new ResponseEntity<>(entity, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Pedido> listarEntity() {
        return getDao().getAll();

    }

}
