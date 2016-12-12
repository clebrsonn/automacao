package com.teccsoluction.sushi.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teccsoluction.sushi.dao.generic.ClienteDAO;
import com.teccsoluction.sushi.dao.generic.GarconDAO;
import com.teccsoluction.sushi.entidade.Cliente;
import com.teccsoluction.sushi.entidade.Garcon;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

@RestController
@RequestMapping(value = "Cliente")
public class ClienteControllerRest {

    private
    final
    ClienteDAO dao;

    @Autowired
    public ClienteControllerRest(ClienteDAO dao) {
        this.dao = dao;
    }


    protected AbstractEntityDao<Cliente> getDao() {
        return dao;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Cliente> buscarEntity(@PathVariable long id) {
    	Cliente cliente = getDao().PegarPorId(id);
        if (cliente == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResponseEntity AdicionarEntity(Cliente entity) {

        try {
            getDao().add(entity);
            return new ResponseEntity<>(entity, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Cliente> listarEntity() {
        return getDao().getAll();

    }

}
