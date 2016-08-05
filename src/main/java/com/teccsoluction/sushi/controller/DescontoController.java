package com.teccsoluction.sushi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teccsoluction.sushi.dao.generic.DescontoDAO;
import com.teccsoluction.sushi.entidade.Desconto;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

@Controller
@RequestMapping(value = "desconto/")
public class DescontoController extends AbstractController<Desconto> {

	
	private
	final 
	DescontoDAO dao;
	
	
	public DescontoController(DescontoDAO dao){
		
		super("desconto");
		this.dao= dao;
	}


	@Override
	protected AbstractEntityDao<Desconto> getDao() {
		// TODO Auto-generated method stub
		return dao;
	}
}
