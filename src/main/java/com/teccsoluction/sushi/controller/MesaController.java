package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.generic.MesaDAO;
import com.teccsoluction.sushi.entidade.Mesa;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "mesa/")
public class MesaController extends AbstractController<Mesa> {


    private
    final
    MesaDAO dao;

    @Autowired
    public MesaController(MesaDAO dao) {

        super("mesa");
        this.dao = dao;
    }


    @Override
    protected AbstractEntityDao<Mesa> getDao() {
        // TODO Auto-generated method stub
        return dao;
    }
}
