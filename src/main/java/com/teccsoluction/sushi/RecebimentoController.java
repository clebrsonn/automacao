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
//import com.teccsoluction.sushi.dao.RecebimentoDAO;
//import com.teccsoluction.sushi.entidade.Item;
//import com.teccsoluction.sushi.entidade.Pagamento;
//import com.teccsoluction.sushi.entidade.Pedido;
//import com.teccsoluction.sushi.entidade.Produto;
//import com.teccsoluction.sushi.entidade.Recebimento;
//
//
//@Controller
//public class RecebimentoController {
//	
//	
//	@Autowired
//	private RecebimentoDAO recebimentoDao;
//	private List<Recebimento> recebimentoList;
//	
//	@Autowired
//	private ItemDAO itemDao;
//	private List<Item> itemList;
//	
//	@Autowired
//	private ProdutoDAO produtodao;
//	private List<Produto> listProduto;
//	
//	@Autowired
//	private PedidoDAO pedidodao;
//	private List<Pedido> listPedido;
//	
//	@RequestMapping(value = "cadastrorecebimento", method = RequestMethod.GET)
//	public ModelAndView cadastroRecebimento() {
//		
//		ModelAndView cadastrorecebimento = new ModelAndView("cadastrorecebimento");
//		
//		listProduto = produtodao.getAll();
//
//		cadastrorecebimento.addObject("listProduto", listProduto);
//		
//		
//		return cadastrorecebimento;
//	}
//	
//	
//	@RequestMapping(value = "cadastrorecebimento2", method = RequestMethod.GET)
//	public ModelAndView cadastroRecebimento2(HttpServletRequest request) {
//		
//		ModelAndView cadastrorecebimento = new ModelAndView("cadastrorecebimento");
//		
//		listProduto = produtodao.getAll();
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		itemList = itemDao.getAllId(idf);
//		
//		
//		cadastrorecebimento.addObject("listProduto", listProduto);
//		
//		cadastrorecebimento.addObject("itemList", itemList);
//		
//		return cadastrorecebimento;
//	}
//	
//	@RequestMapping(value = "/AddRecebimento", method = RequestMethod.POST)
//	public ModelAndView AdicionarRecebimento(@ModelAttribute("Recebimento") Recebimento recebimento) {
//		
////		ModelAndView cadastropedido = new ModelAndView("cadastropedido");
//		
//		recebimentoDao.add(recebimento);
//		
//		return new ModelAndView("redirect:/finalizacaorecebimento");
//	}
//
//	
//	@RequestMapping(value = "/movimentacaorecebimento", method = RequestMethod.GET)
//	public ModelAndView movimentacaoRecebimento() {
//		
//		ModelAndView movimentacaorecebimento = new ModelAndView("movimentacaorecebimento");
//		
//		recebimentoList = recebimentoDao.getAll();
//		
//		movimentacaorecebimento.addObject("recebimentoList", recebimentoList);
//		
//		return movimentacaorecebimento;
//	}
//	
//	
//	@RequestMapping(value = "/edicaorecebimento", method = RequestMethod.GET)
//	public ModelAndView editarRecebimentoForm(HttpServletRequest request) {
//		
//		Recebimento recebimento;
//		long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView edicaorecebimento = new ModelAndView("edicaorecebimento");
//		recebimento = recebimentoDao.PegarPorId(idf);
//		edicaorecebimento.addObject("recebimento", recebimento);
//		
//		
//		return edicaorecebimento;
//	}
//	
//	
//	@RequestMapping(value = "/movimentacaorecebimento/edicaorecebimento", method = RequestMethod.POST)
//	public ModelAndView editarRecebimento(HttpServletRequest request, Recebimento recebimento) {
//		
//		
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		recebimentoDao.editar(idf, recebimento);
//		
//		
//		return new ModelAndView("redirect:/movimentacaorecebimento");
//	}
//	
//	
//	
//	@RequestMapping(value = "/movimentacaorecebimento/delete", method = RequestMethod.GET)
//	public ModelAndView deleteRecebimento(HttpServletRequest request) {
//		
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		Item pedido = itemDao.PegarPorId(idf);
//
//		itemDao.delete(idf);
//		
//		
//		return new ModelAndView("redirect:/cadastrorecebimento2?id="+pedido.getPedido());
//	}
//	
//	@RequestMapping(value = "/additemrecebimento", method = RequestMethod.GET)
//	public ModelAndView AdicionarItemRecebimento(@ModelAttribute("Item") Item item, HttpServletRequest request) {
//		
////		ModelAndView mv = new ModelAndView("additemvenda");
//		
//		
//		long idf = Long.parseLong(request.getParameter("idpedidocompra"));
//		Pedido pedido = pedidodao.PegarPorId(idf);
//
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
//		return new ModelAndView("redirect:/cadastrorecebimento2?id="+item.getPedido());
//}
//
//	@RequestMapping(value = "/finalizacaorecebimento", method = RequestMethod.GET)
//	public ModelAndView FinalizarVenda(@ModelAttribute("Recebimento") Recebimento recebimento, HttpServletRequest request) {
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
//		ModelAndView mv = new ModelAndView("finalizacaorecebimento");
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		
//		
//
//		
//			return mv;
//	}	
//}
