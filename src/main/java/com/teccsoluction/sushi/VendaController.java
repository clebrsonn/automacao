//package com.teccsoluction.sushi;
//
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.teccsoluction.sushi.dao.ItemDAO;
//import com.teccsoluction.sushi.dao.PedidoDAO;
//import com.teccsoluction.sushi.dao.ProdutoDAO;
//import com.teccsoluction.sushi.dao.VendaDAO;
//import com.teccsoluction.sushi.entidade.Item;
//import com.teccsoluction.sushi.entidade.Pagamento;
//import com.teccsoluction.sushi.entidade.Pedido;
//import com.teccsoluction.sushi.entidade.Produto;
//import com.teccsoluction.sushi.entidade.Venda;
//
//@Controller
//public class VendaController {
//	
//	
//	@Autowired
//	private VendaDAO vendaDao;
//	
//	@Autowired
//	private ItemDAO itemDao;
//	
//	@Autowired
//	private ProdutoDAO produtodao;
//	
//	@Autowired
//	private PedidoDAO pedidodao;
//	
//	private List<Venda> vendaList;
//	
//	
//	private List<Item> itemList;
//	
//	
//	private List<Produto> listProduto;
//
//	
//	
//	@RequestMapping(value = "cadastrovenda", method = RequestMethod.GET)
//	public ModelAndView cadastroVenda(HttpServletRequest request) {
//		
//		ModelAndView cadastrovenda = new ModelAndView("cadastrovenda");
//		
//		listProduto = produtodao.getAll();
//		
////		long idf = Long.parseLong(request.getParameter("id"));
////		itemList = itemDao.getAll();
//		
//		
//		cadastrovenda.addObject("listProduto", listProduto);
//		
////		cadastrovenda.addObject("itemList", itemList);
//		return cadastrovenda;
//	}
//	
//	
//	@RequestMapping(value = "cadastrovenda2", method = RequestMethod.GET)
//	public ModelAndView cadastroVenda2(HttpServletRequest request) {
//		
//		ModelAndView cadastrovenda = new ModelAndView("cadastrovenda");
//		
//		listProduto = produtodao.getAll();
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		itemList = itemDao.getAllId(idf);
//		Pedido pedido = pedidodao.PegarPorId(idf);
//		
//		cadastrovenda.addObject("listProduto", listProduto);
//		cadastrovenda.addObject("pedido", pedido);	
//		cadastrovenda.addObject("itemList", itemList);
//		return cadastrovenda;
//	}
//	
//	
//	@RequestMapping(value = "/AddVenda", method = RequestMethod.POST)
//	public ModelAndView AdicionarVenda(@ModelAttribute("Venda") Venda venda) {
//		
////		ModelAndView cadastropedido = new ModelAndView("cadastropedido");
//		
//		vendaDao.add(venda);
//		
//		return new ModelAndView("redirect:/finalizacaovenda");
//	}
//
//	
//	@RequestMapping(value = "/movimentacaovenda", method = RequestMethod.GET)
//	public ModelAndView movimentacaoVenda() {
//		
//		ModelAndView movimentacaovenda = new ModelAndView("movimentacaovenda");
//		
//		vendaList = vendaDao.getAll();
//		
//		movimentacaovenda.addObject("vendaList", vendaList);
//		
//		return movimentacaovenda;
//	}
//	
//	
//	@RequestMapping(value = "/edicaovenda", method = RequestMethod.GET)
//	public ModelAndView editarVendaForm(HttpServletRequest request) {
//		
//		Venda venda;
//		long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView edicaovenda = new ModelAndView("edicaovenda");
//		venda = vendaDao.PegarPorId(idf);
//		edicaovenda.addObject("venda", venda);
//		
//		
//		return edicaovenda;
//	}
//	
//	
//	@RequestMapping(value = "/movimentacaovenda/edicaovenda", method = RequestMethod.POST)
//	public ModelAndView editarVenda(HttpServletRequest request, Venda venda) {
//		
//		
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		vendaDao.editar(idf, venda);
//		
//		
//		return new ModelAndView("redirect:/movimentacaovenda");
//	}
//	
//	
//	@RequestMapping(value = "/movimentacaovenda/delete", method = RequestMethod.GET)
//	public ModelAndView deleteItemVenda(HttpServletRequest request) {
//		
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		Item pedido = itemDao.PegarPorId(idf);
//		itemDao.delete(idf);
//		
//		
//		return new ModelAndView("redirect:/cadastrovenda2?id="+pedido.getPedido());
//	}
//	
//
//	
//	@RequestMapping(value = "/additemvenda", method = RequestMethod.GET)
//	public ModelAndView AdicionarItemVenda(@ModelAttribute("Item") Item item, HttpServletRequest request) {
//		
////		ModelAndView mv = new ModelAndView("additemvenda");
//		
//		
//		long idf = Long.parseLong(request.getParameter("idpedido"));
//		
//		Pedido pedido = pedidodao.PegarPorId(idf);
//////		double precouni = Double.parseDouble(request.getParameter("valoritem"));
//		int qtdf = Integer.parseInt(request.getParameter("quantidade"));
////		double totalf = Double.parseDouble(request.getParameter("valor"));
//		
//		
//		item.setPedido(pedido);
////		item.setPrecoUnitario(precouni);
//		item.setQtd(qtdf);
////		item.setTotalItem(totalf);
//		
//		
//		itemDao.add(item);
//		
//		return new ModelAndView("redirect:/cadastrovenda2?id="+item.getPedido());
//}
//
//
//	
//	@RequestMapping(value = "/finalizacaovenda", method = RequestMethod.GET)
//	public ModelAndView FinalizarVenda(@ModelAttribute("Pagamento") Pagamento pagamento, HttpServletRequest request) {
//		
//////		double precouni = Double.parseDouble(request.getParameter("valoritem"));
////		int qtdf = Integer.parseInt(request.getParameter("quantidade"));
////		double totalf = Double.parseDouble(request.getParameter("valor"));
//		
//		
////		pagamento.setPedido(idf);
////		item.setPrecoUnitario(precouni);
////		item.setQtd(qtdf);
////		item.setTotalItem(totalf);
//		
//		ModelAndView mv = new ModelAndView("finalizacaovenda");
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		
//		
//
//		
//			return mv;
//	}	
//	
//	
//	
//}
