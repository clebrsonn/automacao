package com.teccsoluction.sushi.controller.api;

import com.teccsoluction.sushi.dao.generic.MesaDAO;
import com.teccsoluction.sushi.entidade.Mesa;
import com.teccsoluction.sushi.framework.AbstractRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "mesa")
public class MesaControllerRest extends AbstractRestController<Mesa>{

    private
    final
    MesaDAO dao;

    @Autowired
    public MesaControllerRest(MesaDAO dao) {
        this.dao = dao;
    }


    protected MesaDAO getDao() {
        return dao;
    }

    @Override
    protected void validateSave(Mesa mesa) {

    }

    @Override
    protected void validateUpdate(Mesa mesa) {

    }

    @Override
    protected void validateDelete(Long id) {

    }

}
