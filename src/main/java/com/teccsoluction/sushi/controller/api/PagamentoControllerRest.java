package com.teccsoluction.sushi.controller.api;

import com.teccsoluction.sushi.dao.PagamentoDAO;
import com.teccsoluction.sushi.entidade.Pagamento;
import com.teccsoluction.sushi.framework.AbstractRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "pagamento")
public class PagamentoControllerRest extends AbstractRestController<Pagamento> {

    private
    final
    PagamentoDAO dao;

    @Autowired
    public PagamentoControllerRest(PagamentoDAO dao) {
        this.dao = dao;
    }


    protected PagamentoDAO getDao() {
        return dao;
    }

    @Override
    protected void validateSave(Pagamento pagamento) {

    }

    @Override
    protected void validateUpdate(Pagamento pagamento) {

    }

    @Override
    protected void validateDelete(Long id) {

    }

}
