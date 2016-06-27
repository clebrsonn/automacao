package com.teccsoluction.sushi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.teccsoluction.sushi.dao.PromocaoDAO;
import com.teccsoluction.sushi.entidade.Promocao;
import com.teccsoluction.sushi.entidade.Reserva;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PromocaoController {
	
	@Autowired
	private PromocaoDAO promocaoDao;
	
	private List<Promocao>promocaoList;
	
	
	
	
	@RequestMapping(value = "cadastropromocao", method = RequestMethod.GET)
	public ModelAndView cadastroPromocao() {
		
		ModelAndView cadastropromocao = new ModelAndView("cadastropromocao");
		
		return cadastropromocao;
	}
	
	@RequestMapping(value = "/AddPromocao", method = RequestMethod.POST)
	public ModelAndView AdicionarPromocao(@ModelAttribute("Promocao") Promocao promocao) {
		
		ModelAndView cadastropromocao = new ModelAndView("cadastropromocao");
		
		promocaoDao.add(promocao);
		
		return cadastropromocao;
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
	@RequestMapping(value = "/movimentacaopromocao", method = RequestMethod.GET)
	public ModelAndView movimentacaoPromocao() {
		
		ModelAndView movimentacaopromocao = new ModelAndView("movimentacaopromocao");
		
		promocaoList = promocaoDao.getAll();
		
		movimentacaopromocao.addObject("promocaoList", promocaoList);
		
		return movimentacaopromocao;
	}
	
	@RequestMapping(value = "/edicaopromocao", method = RequestMethod.GET)
	public ModelAndView editarpromocaoForm(HttpServletRequest request) {
		
		Promocao promocao;
		long idf = Long.parseLong(request.getParameter("id"));
		ModelAndView edicaopromocao = new ModelAndView("edicaopromocao");
		promocao = promocaoDao.PegarPorId(idf);
		edicaopromocao.addObject("promocao", promocao);
		
		
		return edicaopromocao;
	}
	
	
	@RequestMapping(value = "/movimentacaopromocao/edicaopromocao", method = RequestMethod.POST)
	public ModelAndView editarpromocao(HttpServletRequest request, Promocao promocao) {
		
		
		
		Long idf = Long.parseLong(request.getParameter("id"));
		promocaoDao.editar(idf, promocao);
		
		
		return new ModelAndView("redirect:/movimentacaopromocao");
	}
	
	
	
	@RequestMapping(value = "/movimentacaopromocao/delete", method = RequestMethod.GET)
	public ModelAndView deletepromocao(HttpServletRequest request) {
		
		
		long idf = Long.parseLong(request.getParameter("id"));
		promocaoDao.delete(idf);
		
		
		return new ModelAndView("redirect:/movimentacaopromocao");
	}
	
}
