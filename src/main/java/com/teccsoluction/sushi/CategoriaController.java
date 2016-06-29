package com.teccsoluction.sushi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teccsoluction.sushi.dao.CategoriaDAO;
import com.teccsoluction.sushi.entidade.Categoria;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CategoriaController {
	

	@Autowired
	private CategoriaDAO categoriaDao;
	
	private List<Categoria> categoriaList;
	
	
	
	
	@RequestMapping(value = "/cadastrocategoria", method = RequestMethod.GET)
	public ModelAndView cadastrocategoria() {
		
		ModelAndView cadastrocategoria = new ModelAndView("cadastrocategoria");
		
		return cadastrocategoria;
	}
	
	@RequestMapping(value = "/AddCategoria", method = RequestMethod.POST)
	public ModelAndView AdicionarCategoria(@ModelAttribute("Categoria") Categoria categoria) {
		
		ModelAndView cadastro_categoria = new ModelAndView("cadastrocategoria");
		
		categoriaDao.add(categoria);
		
		return cadastro_categoria;
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
	@RequestMapping(value = "/movimentacaocategoria", method = RequestMethod.GET)
	public ModelAndView movimentacaoCategoria() {
		
		ModelAndView movimentacaocategoria = new ModelAndView("movimentacaocategoria");
		
		categoriaList = categoriaDao.getAll();
		movimentacaocategoria.addObject("categoriaList", categoriaList);
		
		
		return movimentacaocategoria;
	}
	
	@RequestMapping(value = "edicaocategoria", method = RequestMethod.GET)
	public ModelAndView editarCategoriaForm(HttpServletRequest request) {
		
		Categoria categoria;
		long idf = Long.parseLong(request.getParameter("id"));
		ModelAndView edicaocategoria = new ModelAndView("edicaocategoria");
		categoria = categoriaDao.PegarPorId(idf);
		edicaocategoria.addObject("categoria", categoria);
		
		
		return edicaocategoria;
	}
	
	
	@RequestMapping(value = "/movimentacaocategoria/editarCategoria", method = RequestMethod.GET)
	public ModelAndView editarCategoria(HttpServletRequest request, Categoria categoria) {
		
		
		
		Long idf = Long.parseLong(request.getParameter("id"));
		
		categoriaDao.editar(idf, categoria);
		
		
		
		return new ModelAndView("redirect:/movimentacaocategoria");
	}
	
	
	
	@RequestMapping(value = "/movimentacaocategoria/delete", method = RequestMethod.GET)
	public ModelAndView deleteCategoria(HttpServletRequest request) {
		
		
		long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView movimentacaocategoria = new ModelAndView("movimentacaocategoria");
		categoriaDao.delete(idf);
		
		
		return new ModelAndView("redirect:/movimentacaocategoria");
	}
	
}
