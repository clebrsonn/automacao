package com.teccsoluction.sushi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teccsoluction.sushi.dao.ItemDAO;
import com.teccsoluction.sushi.dao.PedidoDAO;
import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.entidade.Item;
import com.teccsoluction.sushi.entidade.Pedido;
import com.teccsoluction.sushi.entidade.Produto;

@Controller
public class ItemController {
	
	@Autowired
	private ItemDAO itemDao;	
	@Autowired
	private PedidoDAO pedidoDao;
	@Autowired
	private ProdutoDAO produtodao;
	
	private List<Item> itemList;
	
	private List<Pedido> pedidoList;
	
	private List<Produto> listProduto;
	
	
	@RequestMapping(value = "movimentacao/additem", method = RequestMethod.GET)
	public ModelAndView AdicionarItem(@ModelAttribute("Item") Item item, HttpServletRequest request) {
		
		
		long idf = Long.parseLong(request.getParameter("idpedido"));
		Pedido pedido = pedidoDao.PegarPorId(idf);
//		double precouni = Double.parseDouble(request.getParameter("valoritem"));
		int qtdf = Integer.parseInt(request.getParameter("quantidade"));
//		double totalf = Double.parseDouble(request.getParameter("valor"));
		
		
		item.setPedido(pedido);
//		item.setPrecoUnitario(precouni);
		item.setQtd(qtdf);
//		item.setTotalItem(totalf);
		
		
		itemDao.add(item);
		
		return new ModelAndView("redirect:/additem?"+item.getPedido());
		
//		return additem;
	}
	
	
	@RequestMapping(value = "/additem", method = RequestMethod.GET)
	public ModelAndView addItemForm(HttpServletRequest request) {
		
		Pedido pedido;
		Item item;
		long idf = Long.parseLong(request.getParameter("id"));
		ModelAndView addItem = new ModelAndView("additem");
		listProduto = produtodao.getAll();
		itemList =itemDao.getAllId(idf); 
		pedido = pedidoDao.PegarPorId(idf);
		addItem.addObject("pedido", pedido);
		addItem.addObject("listProduto", listProduto);
		addItem.addObject("itemList", itemList);


		
		
		return addItem;
	}
	
	
	@RequestMapping(value = "/edicaoitem", method = RequestMethod.GET)
	public ModelAndView edicaoItemForm(HttpServletRequest request) {
		
		
		long idf = Long.parseLong(request.getParameter("id"));
		
		Item item;
		
		Pedido pedido;
		
		ModelAndView edicaoitem = new ModelAndView("edicaoitem");
		
		item = itemDao.PegarPorId(idf);
		
		pedido=pedidoDao.PegarPorId(idf);
		
		listProduto = produtodao.getAll();
		
		edicaoitem.addObject("item",item);
		edicaoitem.addObject("pedido",pedido);
		edicaoitem.addObject("listProduto",listProduto);

		

		
		return edicaoitem;
	}
	
	
	@RequestMapping(value = "/movimentacaoitem/edicaoitem", method = RequestMethod.GET)
	public ModelAndView edicaoItem(HttpServletRequest request, Item item) {
		
		
		long idf = Long.parseLong(request.getParameter("id"));
		
		long idpedido = Long.parseLong(request.getParameter("idpedido"));
		Pedido pedido = pedidoDao.PegarPorId(idf);

		item.setPedido(pedido);

		 itemDao.editar(idf, item);
		
		
			return new ModelAndView("redirect:/additem?id="+item.getPedido());
	}
	
	
	
	@RequestMapping(value = "movimentacaoitem/delete", method = RequestMethod.GET)
	public ModelAndView deleteItem(HttpServletRequest request) {
		
		//id item a ser excluido
		long idf = Long.parseLong(request.getParameter("id"));
		//recuperar id do pedido para recarregar a pagina.
		Item item = itemDao.PegarPorId(idf);
		itemDao.delete(idf);
		
		
		return new ModelAndView("redirect:/additem?id="+item.getPedido());
	}
	
	
	
	
	// teste
	
//	@RequestMapping(value = "/additemvenda", method = RequestMethod.GET)
//	public ModelAndView AdicionarItemVenda(@ModelAttribute("Item") Item item, HttpServletRequest request) {
//		
//		ModelAndView mv = new ModelAndView("additemvenda");
//		
//		
//		long idf = Long.parseLong(request.getParameter("idpedido"));
//		double precouni = Double.parseDouble(request.getParameter("valoritem"));
//		int qtdf = Integer.parseInt(request.getParameter("quantidade"));
//		double totalf = Double.parseDouble(request.getParameter("valor"));
//		
//		
//		item.setPedido(idf);
//		item.setPrecoUnitario(precouni);
//		item.setQtd(qtdf);
//		item.setTotalItem(totalf);
//		
//		
//		itemDao.add(item);
//		
//		return mv;
		
//		return new ModelAndView("redirect:/additemvenda?id="+item.getPedido());
//}

	}
	
	
//	@RequestMapping(value = "/additemvenda", method = RequestMethod.GET)
//	public ModelAndView addItemVendaForm(HttpServletRequest request) {
//		
//		Pedido pedido;
//		Item item;
//		long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView addItem = new ModelAndView("additemvenda");
//		listProduto = produtodao.getAll();
//		itemList =itemDao.getAllId(idf); 
//		pedido = pedidoDao.PegarPorId(idf);
//		addItem.addObject("pedido", pedido);
//		addItem.addObject("listProduto", listProduto);
//		addItem.addObject("itemList", itemList);
//
//
//		
//		
//		return addItem;
//	}
			
			
			
			

