package com.teccsoluction.sushi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teccsoluction.sushi.dao.PedidoDAO;
import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.entidade.Pagamento;
import com.teccsoluction.sushi.entidade.Pedido;
import com.teccsoluction.sushi.entidade.Produto;

@Controller
public class PedidoController {
	
	
	@Autowired
	private PedidoDAO pedidoDao;
	@Autowired
	private ProdutoDAO produtodao;
	
	
	private List<Pedido> pedidoList;
	
	private List<Produto> listProduto;
	
	
	@RequestMapping(value = "cadastropedido", method = RequestMethod.GET)
	public ModelAndView cadastroPedido() {
		
		ModelAndView cadastropedido = new ModelAndView("cadastropedido");
		
		return cadastropedido;
	}
	
	@RequestMapping(value = "/AddPedido", method = RequestMethod.POST)
	public ModelAndView AdicionarPedido(@ModelAttribute("Pedido") Pedido pedido) {
		
//		ModelAndView cadastropedido = new ModelAndView("cadastropedido");
		
		pedidoDao.add(pedido);
		
		return new ModelAndView("redirect:/movimentacaopedido");
	}

	
	@RequestMapping(value = "/movimentacaopedido", method = RequestMethod.GET)
	public ModelAndView movimentacaoPedido() {
		
		ModelAndView movimentacaopedido = new ModelAndView("movimentacaopedido");
		
		pedidoList = pedidoDao.getAll();
		
		movimentacaopedido.addObject("pedidoList", pedidoList);
		
		return movimentacaopedido;
	}
	
	
	@RequestMapping(value = "/edicaopedido", method = RequestMethod.GET)
	public ModelAndView editarPedidoForm(HttpServletRequest request) {
		
		Pedido pedido;
		long idf = Long.parseLong(request.getParameter("id"));
		ModelAndView edicaopedido = new ModelAndView("edicaopedido");
		pedido = pedidoDao.PegarPorId(idf);
		edicaopedido.addObject("pedido", pedido);
		
		
		return edicaopedido;
	}
	
	
	@RequestMapping(value = "/movimentacaopedido/edicaopedido", method = RequestMethod.POST)
	public ModelAndView editarPedido(HttpServletRequest request, Pedido pedido) {
		
		
		
		long idf = Long.parseLong(request.getParameter("id"));
		pedidoDao.editar(idf, pedido);
		
		
		return new ModelAndView("redirect:/movimentacaopedido");
	}
	
	
	
	@RequestMapping(value = "/movimentacaopedido/delete", method = RequestMethod.GET)
	public ModelAndView deletePedido(HttpServletRequest request) {
		
		
		long idf = Long.parseLong(request.getParameter("id"));
		pedidoDao.delete(idf);
		
		
		return new ModelAndView("redirect:/movimentacaopedido");
	}
	
	

}
