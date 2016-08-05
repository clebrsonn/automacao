package com.teccsoluction.sushi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teccsoluction.sushi.dao.generic.ServicoDAO;
import com.teccsoluction.sushi.entidade.Servico;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;


@Controller
@RequestMapping(value = "servico/")
public class ServicoController extends AbstractController<Servico> {

	private
	final
	ServicoDAO dao;
	
	
	public ServicoController(ServicoDAO dao){
		
		super("servico");
		this.dao= dao;	
		
		
	}


	@Override
	protected AbstractEntityDao<Servico> getDao() {
		// TODO Auto-generated method stub
		return dao;
	}
}
