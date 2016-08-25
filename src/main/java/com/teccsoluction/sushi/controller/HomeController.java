package com.teccsoluction.sushi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import com.teccsoluction.sushi.dao.generic.EmpresaDAO;
import com.teccsoluction.sushi.entidade.Empresa;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private EmpresaDAO empresaDAO;

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


	@ModelAttribute
	public void addAttributes(Model model) {
		Empresa empresaAtt = empresaDAO.PegarPorId(1);
		model.addAttribute("empresaAtt", empresaAtt);
	}

}
