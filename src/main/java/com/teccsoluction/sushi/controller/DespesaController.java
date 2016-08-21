package com.teccsoluction.sushi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teccsoluction.sushi.dao.generic.DespesaDAO;
import com.teccsoluction.sushi.entidade.Despesa;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;


@Controller
@RequestMapping(value = "despesa/")
public class DespesaController extends AbstractController<Despesa> {
	
	
	private
	final 
	DespesaDAO dao;
	
	@Autowired
	public DespesaController(DespesaDAO dao){
		
		super("despesa");
		this.dao= dao;
	}


	@Override
	protected AbstractEntityDao<Despesa> getDao() {
		// TODO Auto-generated method stub
		return dao;
	}
}
