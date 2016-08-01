package com.teccsoluction.sushi;

import com.teccsoluction.sushi.dao.FornecedorDAO;
import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.dao.generic.CategoriaDAO;
import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.entidade.Fornecedor;
import com.teccsoluction.sushi.entidade.Produto;
import com.teccsoluction.sushi.util.FornecedorEditor;
import com.teccsoluction.sushi.util.UnidadeMedida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoDAO produtoDao;
	private List<Produto> produtoList;
	
	
	@Autowired
	private FornecedorDAO fornecedorDao;
	private List<Fornecedor> fornecedorList;
	
	@Autowired
	private CategoriaDAO categoriaDao;
	private List<Categoria> categoriaList;
	
	
    @InitBinder
    protected void initBinder(HttpServletRequest request,  ServletRequestDataBinder binder) {

        binder.registerCustomEditor(Fornecedor.class, new FornecedorEditor(this.fornecedorDao));
//        binder.registerCustomEditor(Categoria.class, new CategoriaEditor(this.categoriaDao));


    }
    
    
	@RequestMapping(value = "cadastroproduto", method = RequestMethod.GET)
	public ModelAndView cadastroProduto() {
		
		ModelAndView cadastroproduto = new ModelAndView("cadastroproduto");
		
		//carregando enum de unidade de medida
		 UnidadeMedida[] umList = UnidadeMedida.values();
		//carregando lista com fornecedores do banco de dados
		 fornecedorList = fornecedorDao.getAll();
		 
		 //carregando a lista de categorias
		 categoriaList =categoriaDao.getAll();
		 
		 //inserindo a lista de enum para o jsp
		 cadastroproduto.addObject("umList",umList);
		 //inserindo a lista de fornecedores para o jsp
		 cadastroproduto.addObject("fornecedorList",fornecedorList);
		 //inserindo categorias para a jsp
		 cadastroproduto.addObject("categoriaList",categoriaList);

		 
		return cadastroproduto;
	}
	
	@RequestMapping(value = "/AddProduto", method = RequestMethod.POST)
	public ModelAndView AdicionarProduto(@ModelAttribute("Produto") Produto produto) {
		
		ModelAndView cadastroproduto = new ModelAndView("cadastroproduto");
//		produto.setFornecedor(produto.getFornecedor());
		
		produtoDao.add(produto);
		
		return cadastroproduto;
	}
	
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
		 //carregando o enu em um array
		 UnidadeMedida[] umList = UnidadeMedida.values();
		 //carregando A LISTA DE fornecedores  em um list
		 fornecedorList = fornecedorDao.getAll();
		 //carregando a çista de Categorias
		 categoriaList = categoriaDao.getAll();
		 
		 edicaoproduto.addObject("umList",umList);
		 edicaoproduto.addObject("fornecedorList",fornecedorList);
		 edicaoproduto.addObject("categoriaList",categoriaList);

		
		return edicaoproduto;
	}
	
	@RequestMapping(value = "movimentacaoproduto/edicaoproduto", method = RequestMethod.POST)
	public ModelAndView edicaoProduto(HttpServletRequest request ,Produto produto) {
		
		
		
			long id = Long.parseLong(request.getParameter("id"));
			
			produto.setCategoria(produto.getCategoria());
		
//			produtoDao.editar(id, produto);;
		
	
		
				return new ModelAndView("redirect:/movimentacaoproduto");
	}
	
	@RequestMapping(value = "movimentacaoproduto/delete", method = RequestMethod.GET)
	public ModelAndView edicaoProduto(HttpServletRequest request) {
		
		
		
			long id = Long.parseLong(request.getParameter("id"));
		
			produtoDao.delete(id);;
		
	
		
				return new ModelAndView("redirect:/movimentacaoproduto");
	}
	
}
