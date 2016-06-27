package com.teccsoluction.sushi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.teccsoluction.sushi.dao.DescontoDAO;
import com.teccsoluction.sushi.entidade.Desconto;
import com.teccsoluction.sushi.entidade.Fornecedor;


/**
 * Handles requests for the application home page.
 */
@Controller
public class DescontoController {
	
	@Autowired
	private DescontoDAO descontoDao;
	
	private List<Desconto>descontoList;
	
	
	
	
	@RequestMapping(value = "cadastrodesconto", method = RequestMethod.GET)
	public ModelAndView cadastroDesconto() {
		
		ModelAndView cadastrodesconto = new ModelAndView("cadastrodesconto");
		
		return cadastrodesconto;
	}
	
	@RequestMapping(value = "/ADDDesconto", method = RequestMethod.POST)
	public ModelAndView AdicionarDesconto(@ModelAttribute("Desconto") Desconto desconto) {
		
		ModelAndView cadastrodesconto = new ModelAndView("cadastrodesconto");
		
		descontoDao.add(desconto);
		
		return cadastrodesconto;
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
	@RequestMapping(value = "/movimentacaodesconto", method = RequestMethod.GET)
	public ModelAndView movimentacaoDesconto() {
		
		ModelAndView movimentacaodesconto = new ModelAndView("movimentacaodesconto");
		
		descontoList = descontoDao.getAll();
		movimentacaodesconto.addObject("descontoList", descontoList);
		
		return movimentacaodesconto;
	}
	
	
	@RequestMapping(value = "/edicaodesconto", method = RequestMethod.GET)
	public ModelAndView editarDescontoForm(HttpServletRequest request) {
		
		Desconto desconto;
		long idf = Long.parseLong(request.getParameter("id"));
		ModelAndView edicaodesconto = new ModelAndView("edicaodesconto");
		desconto = descontoDao.PegarPorId(idf);
		edicaodesconto.addObject("desconto", desconto);
		
		
		return edicaodesconto;
	}
	
	
	@RequestMapping(value = "/movimentacaodesconto/edicaodesconto", method = RequestMethod.POST)
	public ModelAndView editarDesconto(HttpServletRequest request, Desconto desconto) {
		
		
		
		Long idf = Long.parseLong(request.getParameter("id"));
		descontoDao.editar(idf, desconto);
		
		
		return new ModelAndView("redirect:/movimentacaodesconto");
	}
	
	
	
	@RequestMapping(value = "/movimentacaodesconto/delete", method = RequestMethod.GET)
	public ModelAndView deleteDesconto(HttpServletRequest request) {
		
		
		long idf = Long.parseLong(request.getParameter("id"));
		descontoDao.delete(idf);
		
		
		return new ModelAndView("redirect:/movimentacaodesconto");
	}
	
}
