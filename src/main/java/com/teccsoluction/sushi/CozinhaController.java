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
//import com.teccsoluction.sushi.dao.ProdutoDAO;
//import com.teccsoluction.sushi.entidade.Pagamento;
//import com.teccsoluction.sushi.entidade.Pedido;
//import com.teccsoluction.sushi.entidade.Produto;
//
//@Controller
//public class CozinhaController {
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
//	@RequestMapping(value = "/movimentacaocozinha", method = RequestMethod.GET)
//	public ModelAndView movimentacaoPedido() {
//		
//		ModelAndView movimentacaocozinha = new ModelAndView("movimentacaocozinha");
//		
//		pedidoList = pedidoDao.getAll();
//		
//		movimentacaocozinha.addObject("pedidoList", pedidoList);
//		
//		return movimentacaocozinha;
//	}
//	
//	
//	@RequestMapping(value = "/edicaocozinha", method = RequestMethod.GET)
//	public ModelAndView editarPedidoCozinhaForm(HttpServletRequest request) {
//		
//		Pedido pedido;
//		long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView edicaocozinha = new ModelAndView("edicaocozinha");
//		pedido = pedidoDao.PegarPorId(idf);
//		edicaocozinha.addObject("pedido", pedido);
//		
//		
//		return edicaocozinha;
//	}
//	
//	
//	@RequestMapping(value = "/movimentacaocozinha/edicaocozinha", method = RequestMethod.POST)
//	public ModelAndView editarPedidoCozinha(HttpServletRequest request, Pedido pedido) {
//		
//		
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		pedidoDao.editar(idf, pedido);
//		
//		
//		return new ModelAndView("redirect:/movimentacaocozinha");
//	}
//	
//
//}
