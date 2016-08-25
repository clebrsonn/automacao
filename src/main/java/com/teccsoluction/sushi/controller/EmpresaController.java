package com.teccsoluction.sushi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teccsoluction.sushi.dao.generic.EmpresaDAO;
import com.teccsoluction.sushi.entidade.Empresa;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

@Controller
@RequestMapping(value = "empresa/")
public class EmpresaController extends AbstractController<Empresa> {

    private
    final
    EmpresaDAO dao;

    @Autowired
    public EmpresaController(EmpresaDAO dao) {
        super("empresa");
        this.dao = dao;
    }

    @Override
    protected AbstractEntityDao<Empresa> getDao() {
        return dao;
    }
    
    
}
