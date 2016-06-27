package com.teccsoluction.sushi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.teccsoluction.sushi.dao.ProdutoDAO;

import com.teccsoluction.sushi.entidade.Produto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoDAO produtoDao;
	
	private List<Produto> produtoList;
	
	
	
	
	@RequestMapping(value = "cadastroproduto", method = RequestMethod.GET)
	public ModelAndView cadastroProduto() {
		
		ModelAndView cadastroproduto = new ModelAndView("cadastroproduto");
		
		return cadastroproduto;
	}
	
	@RequestMapping(value = "/AddProduto", method = RequestMethod.POST)
	public ModelAndView AdicionarProduto(@ModelAttribute("Produto") Produto produto) {
		
		ModelAndView cadastroproduto = new ModelAndView("cadastroproduto");
		
		produtoDao.add(produto);
		
		return cadastroproduto;
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
	@RequestMapping(value = "/movimentacaoproduto", method = RequestMethod.GET)
	public ModelAndView movimentacaoProduto() {
		
		ModelAndView movimentacaoproduto = new ModelAndView("movimentacaoproduto");
		
		produtoList = produtoDao.getAll();
		
		movimentacaoproduto.addObject("produtoList",produtoList);
		
		return movimentacaoproduto;
	}
	@RequestMapping(value = "/edicaoproduto", method = RequestMethod.GET)
	public ModelAndView edicaoProdutoForm(HttpServletRequest request) {
		
		
		
		long id = Long.parseLong(request.getParameter("id"));
		ModelAndView edicaoproduto = new ModelAndView("edicaoproduto");
		
		 Produto produto = produtoDao.PegarPorId(id);
		
		edicaoproduto.addObject("produto",produto);
		
		return edicaoproduto;
	}
	
	@RequestMapping(value = "movimentacaoproduto/edicaoproduto", method = RequestMethod.POST)
	public ModelAndView edicaoProduto(HttpServletRequest request ,Produto produto) {
		
		
		
		long id = Long.parseLong(request.getParameter("id"));
		
		  produtoDao.editar(id, produto);;
		
	
		
			return new ModelAndView("redirect:/movimentacaoproduto");
	}
	
	@RequestMapping(value = "movimentacaoproduto/delete", method = RequestMethod.GET)
	public ModelAndView edicaoProduto(HttpServletRequest request) {
		
		
		
		long id = Long.parseLong(request.getParameter("id"));
		
		  produtoDao.delete(id);;
		
	
		
			return new ModelAndView("redirect:/movimentacaoproduto");
	}
	
}
