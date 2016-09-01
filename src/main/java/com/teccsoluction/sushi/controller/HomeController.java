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

	
	
	public HomeController() {
		super();
	}
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {

		ModelAndView home = new ModelAndView("home");
//		Empresa empresaAtt = new Empresa();
//		empresaAtt.setCnpj("123456");
//		empresaAtt.setInscricaoestadual("123456789");
//		empresaAtt.setNome("New");
//		empresaAtt.setNomefantasia("Newsss");
//		empresaAtt.setRazaosocial("rosangelaME");
//		empresaAtt.setLogo("logo3.png");
//
//		empresaDao.add(empresaAtt);
//
//		home.addObject("empresaAtt", empresaAtt);

		return home;
	}

	@RequestMapping(value = "/marketing", method = RequestMethod.GET)
	public ModelAndView marketing() {

		ModelAndView marketing = new ModelAndView("marketing");

		return marketing;
	}

	@RequestMapping(value = "/financeiro", method = RequestMethod.GET)
	public ModelAndView financeiro() {

		ModelAndView financeiro = new ModelAndView("financeiro");

		return financeiro;
	}
	
	
	@RequestMapping(value = "/relatorio", method = RequestMethod.GET)
	public ModelAndView relatorio() {

		ModelAndView relatorio = new ModelAndView("relatorio");

		return relatorio;
	}

	@RequestMapping(value = "/suporte", method = RequestMethod.GET)
	public ModelAndView suporte() {

		ModelAndView suporte = new ModelAndView("suporte");

		return suporte;
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
