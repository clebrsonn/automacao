package com.teccsoluction.sushi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teccsoluction.sushi.dao.FornecedorDAO;
import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.dao.generic.ItemDAO;
import com.teccsoluction.sushi.dao.generic.PedidoCompraDAO;
import com.teccsoluction.sushi.dao.generic.RecebimentoDAO;
import com.teccsoluction.sushi.entidade.Cliente;
import com.teccsoluction.sushi.entidade.Fornecedor;
import com.teccsoluction.sushi.entidade.Item;
import com.teccsoluction.sushi.entidade.PedidoCompra;
import com.teccsoluction.sushi.entidade.PedidoVenda;
import com.teccsoluction.sushi.entidade.Produto;
import com.teccsoluction.sushi.entidade.Recebimento;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEditor;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import com.teccsoluction.sushi.util.OrigemPedido;
import com.teccsoluction.sushi.util.StatusPedido;
import com.teccsoluction.sushi.util.TipoPedido;

@Controller
@RequestMapping(value = "recebimento/")
public class RecebimentoController extends AbstractController<Recebimento> {

	private
	final
	AbstractEntityDao<Recebimento> daorecebimento;
	
	private
	final
	AbstractEntityDao<Fornecedor> fornecedorDao;
	
	private
	final
	AbstractEntityDao<PedidoCompra> pedidoCompraDao;
	
	
	private
	final
	AbstractEntityDao<Produto> produtoDao;
	
	private
	final
	AbstractEntityDao<Item> itemDao;
	
	
	@Autowired
	public RecebimentoController(RecebimentoDAO dao,FornecedorDAO daofornecedor,PedidoCompraDAO daocompra,ProdutoDAO daoproduto,ItemDAO daoitem){
		
		super("recebimento");
		this.daorecebimento= dao;
		this.fornecedorDao = daofornecedor;
		this.pedidoCompraDao = daocompra;
		this.produtoDao = daoproduto;
		this.itemDao = daoitem;
	}
	
	
	
	  @InitBinder
	    protected void initBinder(HttpServletRequest request,  ServletRequestDataBinder binder) {

	        binder.registerCustomEditor(Fornecedor.class, new AbstractEditor<Fornecedor>(this.fornecedorDao){
	        });

//	        binder.registerCustomEditor(Cliente.class, new AbstractEditor<Cliente>(this.clienteDao) {
//	        });


	    }


	@Override
	protected AbstractEntityDao<Recebimento> getDao() {
		// TODO Auto-generated method stub
		return daorecebimento;
	}
	
	  @ModelAttribute
	    public void addAttributes(Model model) {

			//lista de fornecedor para carregar no add recebimento
			List <Fornecedor> forneccedorList =fornecedorDao.getAll();
			//carregando o status do ENU
			StatusPedido[]tipoStatusList = StatusPedido.values();

			
			//adiciona o atributo no modelo para view
	        model.addAttribute("forneccedorList", forneccedorList);
	        model.addAttribute("tipoStatusList", tipoStatusList);


	    }
	  
//	  @RequestMapping(value = "additemrecebimento", method = RequestMethod.GET)
//			public ModelAndView  additemrecebimento(HttpServletRequest request){
//		    	
//		    	
//		    	
//		    	
//		    	Long idf = Long.parseLong(request.getParameter("idpedidocompra"));
//		    	ModelAndView additemrecebimento = new ModelAndView("additemrecebimento");
//		    	
//		    	PedidoCompra pc = pedidoCompraDao.PegarPorId(idf);
//		    	
//		    	
//		    	List<Produto> produtoList = produtoDao.getAll();
//		    	List<Item> itemList = itemDao.getAllItens(idf);
//		    	
//		    	additemrecebimento.addObject("itemList", itemList);
//		    	additemrecebimento.addObject("produtoList", produtoList);
//		    	additemrecebimento.addObject("pc", pc);
//
//				
//				return additemrecebimento;
//			}
		    
	  @RequestMapping(value = "CarregarPedidoCompra", method = RequestMethod.GET)
		public ModelAndView  carregarPedidoRecebimento(HttpServletRequest request){
	    	
	    
  	
  		ModelAndView cadastrorecebimento = new ModelAndView("cadastrorecebimento");

	    	long idf = Long.parseLong(request.getParameter("idpedidocompra"));
//	    	long idfprod = Long.parseLong(request.getParameter("codigoitem"));
	    	PedidoCompra pc = pedidoCompraDao.PegarPorId(idf);
	    	
	    	
	    	List<Produto> produtoList = produtoDao.getAll();
	    	List<Item> itemList = itemDao.getAllItens(idf);
//	    	Produto produto = produtopedidovendaDao.PegarPorId(idfprod);
	    	
	    	cadastrorecebimento.addObject("itemList", itemList);
	    	cadastrorecebimento.addObject("produtoList", produtoList);
	    	cadastrorecebimento.addObject("pc", pc);
//	    	movimentacaocaixa.addObject("produto", produto);


			
			return cadastrorecebimento;
  	}
  
	  
	  
}
