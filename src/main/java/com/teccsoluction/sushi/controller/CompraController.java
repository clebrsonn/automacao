package com.teccsoluction.sushi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teccsoluction.sushi.dao.generic.CompraDAO;
import com.teccsoluction.sushi.entidade.Compra;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;


@Controller
@RequestMapping(value = "compra/")
public class CompraController extends AbstractController<Compra>{
	


	private
    final
    CompraDAO dao;
	
	
	@Autowired
	public CompraController(CompraDAO dao) {
		super("compra");
		this.dao=dao;
		// TODO Auto-generated constructor stub
	}


	@Override
	protected AbstractEntityDao<Compra> getDao() {
		// TODO Auto-generated method stub
		return dao;
	}

}
