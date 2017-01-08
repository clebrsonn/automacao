package com.teccsoluction.sushi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teccsoluction.sushi.dao.ComposicaoDAO;
import com.teccsoluction.sushi.entidade.Composicao;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;



@Controller
@RequestMapping(value = "composicao/")
public class ComposicaoController extends AbstractController<Composicao> {
	
	private
    final
    ComposicaoDAO dao;

    @Autowired
    public ComposicaoController(ComposicaoDAO dao) {
        super("composicao");
        this.dao = dao;
    }

	@Override
	protected AbstractEntityDao<Composicao> getDao() {
		// TODO Auto-generated method stub
		return dao;
	}



}
