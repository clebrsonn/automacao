package com.teccsoluction.sushi.controller.api;

import com.teccsoluction.sushi.dao.generic.ClienteDAO;
import com.teccsoluction.sushi.entidade.Cliente;
import com.teccsoluction.sushi.framework.AbstractRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "cliente")
public class ClienteControllerRest extends AbstractRestController<Cliente> {

    private
    final
    ClienteDAO dao;

    @Autowired
    public ClienteControllerRest(ClienteDAO dao) {
        this.dao = dao;
    }


    protected ClienteDAO getDao() {
        return dao;
    }

    @Override
    protected void validateSave(Cliente cliente) {

    }

    @Override
    protected void validateUpdate(Cliente cliente) {

    }

    @Override
    protected void validateDelete(Long id) {

    }

}
