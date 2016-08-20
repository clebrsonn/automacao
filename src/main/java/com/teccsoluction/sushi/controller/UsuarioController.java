package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.UsuarioDAO;
import com.teccsoluction.sushi.entidade.Usuario;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "usuario/")
public class UsuarioController extends AbstractController<Usuario> {


    private
    @Autowired
    UsuarioDAO dao;


    public UsuarioController(UsuarioDAO dao) {
        super("usuario");
        this.dao = dao;
    }

    @Override
    protected AbstractEntityDao<Usuario> getDao() {
        return dao;
    }
}
