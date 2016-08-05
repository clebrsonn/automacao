package com.teccsoluction.sushi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teccsoluction.sushi.dao.generic.DevolucaoDAO;
import com.teccsoluction.sushi.entidade.Devolucao;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

@Controller
@RequestMapping(value = "devolucao/")
public class DevolucaoController extends AbstractController<Devolucao> {

	
	private
	final
	DevolucaoDAO dao;
	
	
	public DevolucaoController(DevolucaoDAO dao){
	
		super("devolucao");
		this.dao= dao;	
		
	}


	@Override
	protected AbstractEntityDao<Devolucao> getDao() {
		// TODO Auto-generated method stub
		return dao;
	}
	
}
