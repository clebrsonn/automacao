package com.teccsoluction.sushi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teccsoluction.sushi.dao.generic.VendaDAO;
import com.teccsoluction.sushi.entidade.Venda;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

@Controller
@RequestMapping(value = "venda/")
public class VendaController extends AbstractController<Venda> {

	
	private
	final
	VendaDAO dao;
	
	
	public VendaController(VendaDAO dao){
					
		super("venda");
		this.dao= dao;
		
	}


	@Override
	protected AbstractEntityDao<Venda> getDao() {
		// TODO Auto-generated method stub
		return dao;
	}
}
