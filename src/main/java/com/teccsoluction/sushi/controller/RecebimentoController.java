package com.teccsoluction.sushi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teccsoluction.sushi.dao.generic.RecebimentoDAO;
import com.teccsoluction.sushi.entidade.Recebimento;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

@Controller
@RequestMapping(value = "recebimento/")
public class RecebimentoController extends AbstractController<Recebimento> {

	private
	final
	RecebimentoDAO dao;
	
	
	public RecebimentoController(RecebimentoDAO dao){
		
		super("recebimento");
		this.dao= dao;	
	}


	@Override
	protected AbstractEntityDao<Recebimento> getDao() {
		// TODO Auto-generated method stub
		return dao;
	}
	
	
}
