package com.teccsoluction.sushi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teccsoluction.sushi.dao.generic.PromocaoDAO;
import com.teccsoluction.sushi.entidade.Promocao;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;


@Controller
@RequestMapping(value = "promocao/")
public class PromocaoController extends AbstractController<Promocao> {

	private
	final
	PromocaoDAO dao;
	
	public PromocaoController(PromocaoDAO dao){
		
		super("promocao");
		this.dao= dao;
	}

	@Override
	protected AbstractEntityDao<Promocao> getDao() {
		// TODO Auto-generated method stub
		return dao;
	}	
}
