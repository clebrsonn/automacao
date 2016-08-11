package com.teccsoluction.sushi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teccsoluction.sushi.dao.generic.ReservaDAO;
import com.teccsoluction.sushi.entidade.Reserva;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

@Controller
@RequestMapping(value = "reserva/")
public class ReservaController extends AbstractController<Reserva> {

	
	private
	final
	ReservaDAO dao;
	
	
	public ReservaController(ReservaDAO dao){
		
		super("reserva");
		this.dao= dao;
	}


	@Override
	protected AbstractEntityDao<Reserva> getDao() {
		// TODO Auto-generated method stub
		return dao;
	}
	
		
}
