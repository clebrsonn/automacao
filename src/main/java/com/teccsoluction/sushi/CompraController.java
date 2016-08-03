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
//import com.teccsoluction.sushi.dao.CompraDAO;
//import com.teccsoluction.sushi.dao.PedidoDAO;
//import com.teccsoluction.sushi.dao.ProdutoDAO;
//import com.teccsoluction.sushi.dao.VendaDAO;
//import com.teccsoluction.sushi.entidade.Compra;
//import com.teccsoluction.sushi.entidade.Pagamento;
//import com.teccsoluction.sushi.entidade.Pedido;
//import com.teccsoluction.sushi.entidade.Produto;
//import com.teccsoluction.sushi.entidade.Venda;
//
//@Controller
//public class CompraController {
//	
//	
//	@Autowired
//	private CompraDAO compraDao;
//	
//	private List<Compra> compraList;
//
//	
//	
//	@RequestMapping(value = "cadastrocompra", method = RequestMethod.GET)
//	public ModelAndView cadastroCompra() {
//		
//		ModelAndView cadastrocompra = new ModelAndView("cadastrocompra");
//		
//		return cadastrocompra;
//	}
//	
//	@RequestMapping(value = "/AddCompra", method = RequestMethod.POST)
//	public ModelAndView AdicionarCompra(@ModelAttribute("Compra") Compra compra) {
//		
////		ModelAndView cadastropedido = new ModelAndView("cadastropedido");
//		
//		compraDao.add(compra);
//		
//		return new ModelAndView("redirect:/finalizacaocompra");
//	}
//
//	
//	@RequestMapping(value = "/movimentacaocompra", method = RequestMethod.GET)
//	public ModelAndView movimentacaoCompra() {
//		
//		ModelAndView movimentacaocompra = new ModelAndView("movimentacaocompra");
//		
//		compraList = compraDao.getAll();
//		
//		movimentacaocompra.addObject("compraList", compraList);
//		
//		return movimentacaocompra;
//	}
//	
//	
//	@RequestMapping(value = "/edicaocompra", method = RequestMethod.GET)
//	public ModelAndView editarCompraForm(HttpServletRequest request) {
//		
//		Compra compra;
//		long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView edicaocompra = new ModelAndView("edicaocompra");
//		compra = compraDao.PegarPorId(idf);
//		edicaocompra.addObject("compra", compra);
//		
//		
//		return edicaocompra;
//	}
//	
//	
//	@RequestMapping(value = "/movimentacaocompra/edicaocompra", method = RequestMethod.POST)
//	public ModelAndView editarCompra(HttpServletRequest request, Compra compra) {
//		
//		
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		compraDao.editar(idf, compra);
//		
//		
//		return new ModelAndView("redirect:/movimentacaocompra");
//	}
//	
//	
//	
//	@RequestMapping(value = "/movimentacaocompra/delete", method = RequestMethod.GET)
//	public ModelAndView deleteCompra(HttpServletRequest request) {
//		
//		
//		long idf = Long.parseLong(request.getParameter("id"));
//		compraDao.delete(idf);
//		
//		
//		return new ModelAndView("redirect:/movimentacaocompra");
//	}
//	
//
//}
