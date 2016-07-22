package com.teccsoluction.sushi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	
	
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		
		ModelAndView home = new ModelAndView("home");
		
		return home;
	}

	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
	public ModelAndView cadastro() {
		
		ModelAndView cadastro = new ModelAndView("cadastro");
		
		return cadastro;
	}
	

	
	@RequestMapping(value = "/movimentacao", method = RequestMethod.GET)
	public ModelAndView movimentacao() {
		
		ModelAndView movimentacao = new ModelAndView("movimentacao");
		
		return movimentacao;
	}
	
}
