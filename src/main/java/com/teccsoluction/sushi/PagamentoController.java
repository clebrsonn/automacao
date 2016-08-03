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
//import com.teccsoluction.sushi.dao.PagamentoDAO;
//import com.teccsoluction.sushi.dao.PedidoDAO;
//import com.teccsoluction.sushi.entidade.Desconto;
//import com.teccsoluction.sushi.entidade.Pagamento;
//import com.teccsoluction.sushi.entidade.Pedido;
//
///**
// * Handles requests for the application home page.
// */
//@Controller
//public class PagamentoController {
//	
//	@Autowired
//	private PagamentoDAO pagamentoDao;
//	
//	private List<Pagamento> pagamentoList;
//	
//	@Autowired
//	private PedidoDAO pedidodao;
//
//	
//	@RequestMapping(value = "cadastropagamento", method = RequestMethod.GET)
//	public ModelAndView cadastroPagamento() {
//		
//		ModelAndView cadastropagamento = new ModelAndView("cadastropagamento");
//		
//		return cadastropagamento;
//	}
//	
//	@RequestMapping(value = "/AddPagamento", method = RequestMethod.POST)
//	public ModelAndView AdicionarPagamento(@ModelAttribute("Pagamento") Pagamento pagamento) {
//		
//		ModelAndView cadastropagamento = new ModelAndView("cadastropagamento");
//		
//		pagamentoDao.add(pagamento);
//		
//		return cadastropagamento;
//	}
//
//	
//	@RequestMapping(value = "/movimentacaopagamento", method = RequestMethod.GET)
//	public ModelAndView movimentacaoPagamento() {
//		
//		ModelAndView movimentacaopagamento = new ModelAndView("movimentacaopagamento");
//		
//		pagamentoList = pagamentoDao.getAll();
//		
//		movimentacaopagamento.addObject("pagamentoList", pagamentoList);
//		
//		return movimentacaopagamento;
//	}
//	
//	
//	@RequestMapping(value = "/edicaopagamento", method = RequestMethod.GET)
//	public ModelAndView editarPagamentoForm(HttpServletRequest request) {
//		
//		Pagamento pagamento;
//		long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView edicaopagamento = new ModelAndView("edicaopagamento");
//		pagamento = pagamentoDao.PegarPorId(idf);
//		edicaopagamento.addObject("pagamento", pagamento);
//		
//		
//		return edicaopagamento;
//	}
//	
//	
//	@RequestMapping(value = "/movimentacaopagamento/edicaopagamento", method = RequestMethod.POST)
//	public ModelAndView editarPagamento(HttpServletRequest request, Pagamento pagamento) {
//		
//		
//		
//		Long idf = Long.parseLong(request.getParameter("id"));
//		pagamentoDao.editar(idf, pagamento);
//		
//		
//		return new ModelAndView("redirect:/movimentacaopagamento");
//	}
//	
//	
//	
//	@RequestMapping(value = "/movimentacaopagamento/delete", method = RequestMethod.GET)
//	public ModelAndView deletePagamento(HttpServletRequest request) {
//		
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		pagamentoDao.delete(idf);
//		
//		
//		return new ModelAndView("redirect:/movimentacaopagamento");
//	}
//	
//	@RequestMapping(value = "/addformapagamento", method = RequestMethod.GET)
//	public ModelAndView addFormaPagamentoVendaForm(HttpServletRequest request) {
//		
//		
//		long idf = Long.parseLong(request.getParameter("idpedido"));
//		Pedido pedido;
//		pedido = pedidodao.PegarPorId(idf);
//		ModelAndView addformapagamento = new ModelAndView("addformapagamento");
//		
//		pagamentoList = pagamentoDao.getAll();
//		
//		addformapagamento.addObject("pedido", pedido);
//		addformapagamento.addObject("pagamentoList", pagamentoList);
//
//		return addformapagamento;
//	}
//	
//}
