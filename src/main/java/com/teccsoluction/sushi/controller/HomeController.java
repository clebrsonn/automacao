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
import com.teccsoluction.sushi.entidade.PedidoVenda;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private
	final
	AbstractEntityDao<Empresa> empresaDao;
	
	
	
	public HomeController(EmpresaDAO daoempresa) {
		super();
		this.empresaDao = daoempresa;
		// TODO Auto-generated constructor stub
	}
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {

		ModelAndView home = new ModelAndView("home");
		Empresa empresaAtt = new Empresa();
		empresaAtt.setCnpj("123456");
		empresaAtt.setInscricaoestadual("123456789");
		empresaAtt.setNome("New");
		empresaAtt.setNomefantasia("Newsss");
		empresaAtt.setRazaosocial("rosangelaME");
		empresaAtt.setLogo("logo3.png");
		
		empresaDao.add(empresaAtt);
		
		home.addObject("empresaAtt", empresaAtt);

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
		Empresa empresaAtt = empresaDao.PegarPorId(1);
		model.addAttribute("empresaAtt", empresaAtt);
	}

}
