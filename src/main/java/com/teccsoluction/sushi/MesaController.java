package com.teccsoluction.sushi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.teccsoluction.sushi.dao.MesaDAO;
import com.teccsoluction.sushi.entidade.Mesa;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MesaController {
	
	@Autowired
	private MesaDAO mesaDao;
	
	private List<Mesa> mesaList;
	
	
	
	
	@RequestMapping(value = "cadastromesa", method = RequestMethod.GET)
	public ModelAndView cadastromesa() {
		
		ModelAndView cadastromesa = new ModelAndView("cadastromesa");
		
		
		return cadastromesa;
	}
	
	@RequestMapping(value = "/AddMesa", method = RequestMethod.POST)
	public ModelAndView AdicionarMesa(@ModelAttribute("Mesa") Mesa mesa) {
		
		ModelAndView cadastro_mesa = new ModelAndView("cadastromesa");
		
		mesaDao.add(mesa);
		
		return cadastro_mesa;
	}

	@RequestMapping(value = "/movimentacaomesas", method = RequestMethod.GET)
	public ModelAndView movimentacaoMesas() {
		
		ModelAndView movimentacaomesas = new ModelAndView("movimentacaomesas");
		
		
		mesaList = mesaDao.getAll();
		
		movimentacaomesas.addObject("mesaList", mesaList);
		
		
		return movimentacaomesas;
	}
	
	@RequestMapping(value = "/edicaomesa", method = RequestMethod.GET)
	public ModelAndView edicaoMesasForm(HttpServletRequest request) {
		
		ModelAndView edicaomesa = new ModelAndView("edicaomesa");
		
		long idf = Long.parseLong(request.getParameter("id"));

		Mesa mesa = new Mesa();
		mesa = mesaDao.PegarPorId(idf); 
				
		edicaomesa.addObject("mesa", mesa);
		
		
		return edicaomesa;
	}
	
	@RequestMapping(value = "movimentacaomesa/edicaomesa", method = RequestMethod.GET)
	public ModelAndView edicaoMesas(HttpServletRequest request) {
		
		ModelAndView edicaomesa = new ModelAndView("edicaomesa");
		
//		long idf = Long.parseLong(request.getParameter("id"));
//
//		Mesa mesa = new Mesa();
//		mesa = mesaDao.PegarPorId(idf); 
//				
//		edicaomesa.addObject("mesa", mesa);
		
		
		return edicaomesa;
	}
	
	
}
