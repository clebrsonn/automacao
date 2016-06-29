package com.teccsoluction.sushi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.teccsoluction.sushi.dao.FornecedorDAO;
import com.teccsoluction.sushi.entidade.Cliente;
import com.teccsoluction.sushi.entidade.Fornecedor;


/**
 * Handles requests for the application home page.
 */
@Controller
public class FornecedorController {
	
	@Autowired
	private FornecedorDAO fornecedorDao;
	
	private List<Fornecedor> fornecedorList;
	
	
	
	
	@RequestMapping(value = "cadastrofornecedor", method = RequestMethod.GET)
	public ModelAndView cadastroFornecedor() {
		
		ModelAndView cadastrofornecedor = new ModelAndView("cadastrofornecedor");
		
		return cadastrofornecedor;
	}
	
	@RequestMapping(value = "/AddFornecedor", method = RequestMethod.POST)
	public ModelAndView AdicionarFornecedor(@ModelAttribute("Fornecedor") Fornecedor fornecedor) {
		
		ModelAndView cadastrofornecedor = new ModelAndView("cadastrofornecedor");
		
		fornecedorDao.add(fornecedor);
		
		return cadastrofornecedor;
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
	@RequestMapping(value = "/movimentacaofornecedor", method = RequestMethod.GET)
	public ModelAndView movimentacaoFornecedor() {
		
		ModelAndView movimentacaofornecedor = new ModelAndView("movimentacaofornecedor");
		
		fornecedorList = fornecedorDao.getAll();
		
		movimentacaofornecedor.addObject("fornecedorList", fornecedorList);
		
		return movimentacaofornecedor;
	}
	
	@RequestMapping(value = "/edicaofornecedor", method = RequestMethod.GET)
	public ModelAndView editarFornecedorForm(HttpServletRequest request) {
		
		Fornecedor fornecedor;
		long idf = Long.parseLong(request.getParameter("id"));
		ModelAndView edicaofornecedor = new ModelAndView("edicaofornecedor");
		fornecedor = fornecedorDao.PegarPorId(idf);
		edicaofornecedor.addObject("fornecedor", fornecedor);
		
		
		return edicaofornecedor;
	}
	
	
	@RequestMapping(value = "/movimentacaofornecedor/edicaofornecedor", method = RequestMethod.POST)
	public ModelAndView editarFornecedor(HttpServletRequest request, Fornecedor fornecedor) {
		
		
		
		long idf = Long.parseLong(request.getParameter("id"));
		fornecedorDao.editar(idf, fornecedor);
		
		
		return new ModelAndView("redirect:/movimentacaofornecedor");
	}
	
	
	
	@RequestMapping(value = "/movimentacaofornecedor/delete", method = RequestMethod.GET)
	public ModelAndView deleteFornecedor(HttpServletRequest request) {
		
		
		long idf = Long.parseLong(request.getParameter("id"));
		fornecedorDao.delete(idf);
		
		
		return new ModelAndView("redirect:/movimentacaofornecedor");
	}
	
}
