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
//import com.teccsoluction.sushi.dao.PedidoDAO;
//import com.teccsoluction.sushi.dao.ProdutoDAO;
//import com.teccsoluction.sushi.entidade.Pagamento;
//import com.teccsoluction.sushi.entidade.Pedido;
//import com.teccsoluction.sushi.entidade.Produto;
//
//@Controller
//public class DeliveryController {
//	
//	
//	@Autowired
//	private PedidoDAO pedidoDao;
//	
//	private List<Pedido> pedidoList;
//	
//
//	
//
//	
//	@RequestMapping(value = "/movimentacaodelivery", method = RequestMethod.GET)
//	public ModelAndView movimentacaoDelivery() {
//		
//		ModelAndView movimentacaodelivery = new ModelAndView("movimentacaodelivery");
//		
//		pedidoList = pedidoDao.getAll();
//		
//		movimentacaodelivery.addObject("pedidoList", pedidoList);
//		
//		return movimentacaodelivery;
//	}
//	
//	
//	@RequestMapping(value = "/edicaodelivery", method = RequestMethod.GET)
//	public ModelAndView editarPedidoDeliveryForm(HttpServletRequest request) {
//		
//		Pedido pedido;
//		long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView edicaodelivery = new ModelAndView("edicaodelivery");
//		pedido = pedidoDao.PegarPorId(idf);
//		edicaodelivery.addObject("pedido", pedido);
//		
//		
//		return edicaodelivery;
//	}
//	
//	
//	@RequestMapping(value = "/movimentacaodelivery/edicaodelivery", method = RequestMethod.POST)
//	public ModelAndView editarPedidoDelivery(HttpServletRequest request, Pedido pedido) {
//		
//		
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		pedidoDao.editar(idf, pedido);
//		
//		
//		return new ModelAndView("redirect:/movimentacaodelivery");
//	}
//	
//
//}
