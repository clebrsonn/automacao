package com.teccsoluction.sushi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.teccsoluction.sushi.dao.GarconDAO;
import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.entidade.Garcon;


/**
 * Handles requests for the application home page.
 */
@Controller
public class GarconController {
	
	@Autowired
	private GarconDAO garconDao;
	
	private List<Garcon> garconList;
	
	
	
	
	@RequestMapping(value = "cadastrogarcon", method = RequestMethod.GET)
	public ModelAndView cadastroGarcon() {
		
		ModelAndView cadastrogarcon = new ModelAndView("cadastrogarcon");
		
		return cadastrogarcon;
	}
	
	@RequestMapping(value = "/AddGarcon", method = RequestMethod.POST)
	public ModelAndView AdicionarGarcon(@ModelAttribute("Garcon") Garcon garcon) {
		
		ModelAndView cadastrogarcon = new ModelAndView("cadastrogarcon");
		
		garconDao.add(garcon);
		
		return cadastrogarcon;
	}
//	
//	@RequestMapping(value = "cadastrocategoria", method = RequestMethod.GET)
//	public ModelAndView cadastrocategoria() {
//		
//		ModelAndView cadastrocategoria = new ModelAndView("cadastrocategoria");
//		
//		return cadastrocategoria;
//	}
//	
	@RequestMapping(value = "/movimentacaogarcon", method = RequestMethod.GET)
	public ModelAndView movimentacaoGarcon() {
		
		ModelAndView movimentacaogarcon = new ModelAndView("movimentacaogarcon");
		
		garconList = garconDao.getAll();
		
		movimentacaogarcon.addObject("garconList",garconList);
		
		return movimentacaogarcon;
	}
	
	
	@RequestMapping(value = "edicaogarcon", method = RequestMethod.GET)
	public ModelAndView editarGarconForm(HttpServletRequest request) {
		
		Garcon garcon;
		long idf = Long.parseLong(request.getParameter("id"));
		ModelAndView edicaogarcon = new ModelAndView("edicaogarcon");
		garcon = garconDao.PegarPorId(idf);
		edicaogarcon.addObject("garcon", garcon);
		
		
		return edicaogarcon;
	}
	
	
	@RequestMapping(value = "/movimentacaogarcon/edicaogarcon", method = RequestMethod.POST)
	public ModelAndView editarGarcon(HttpServletRequest request, Garcon garcon) {
		
		
		
		Long idf = Long.parseLong(request.getParameter("id"));
		
		garconDao.editar(idf, garcon);
		
		
		return new ModelAndView("redirect:/movimentacaogarcon");
	}
	
	
	
	@RequestMapping(value = "/movimentacaogarcon/delete", method = RequestMethod.GET)
	public ModelAndView deleteCategoria(HttpServletRequest request) {
		
		
		long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView movimentacaocategoria = new ModelAndView("movimentacaocategoria");
		garconDao.delete(idf);
		
		
		return new ModelAndView("redirect:/movimentacaocategoria");
	}
	
	
}
