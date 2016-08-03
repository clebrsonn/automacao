package com.teccsoluction.sushi;

import com.teccsoluction.sushi.dao.MesaDAO;
import com.teccsoluction.sushi.dao.PedidoDAO;
import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.dao.generic.GarconDAO;
import com.teccsoluction.sushi.entidade.Garcon;
import com.teccsoluction.sushi.entidade.Mesa;
import com.teccsoluction.sushi.entidade.Pedido;
import com.teccsoluction.sushi.entidade.Produto;
import com.teccsoluction.sushi.framework.AbstractEditor;
import com.teccsoluction.sushi.util.MesaEditor;
import com.teccsoluction.sushi.util.StatusPedido;
import com.teccsoluction.sushi.util.TipoPedido;
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

@Controller
public class PedidoController {
	
	
	@Autowired
	private PedidoDAO pedidoDao;
	@Autowired
	private ProdutoDAO produtodao;
	
	
	private List<Pedido> pedidoList;
	
	private List<Produto> listProduto;
	
	@Autowired
	private MesaDAO mesadao;
	
	private List<Mesa> mesaList;
	
	@Autowired
	private GarconDAO garcondao;
	
	private List<Garcon> garconList;
	
	
	
	  @InitBinder
	    protected void initBinder(HttpServletRequest request,  ServletRequestDataBinder binder) {

	        binder.registerCustomEditor(Mesa.class, new MesaEditor(this.mesadao));
	        binder.registerCustomEditor(Garcon.class, new AbstractEditor<Garcon>(this.garcondao) {
			});


	    }
	
	@RequestMapping(value = "cadastropedido", method = RequestMethod.GET)
	public ModelAndView cadastroPedido() {
		
		ModelAndView cadastropedido = new ModelAndView("cadastropedido");
		
		TipoPedido[] tipoList  = TipoPedido.values();
		
		StatusPedido[]tipoStatusList = StatusPedido.values();
		
		mesaList = mesadao.getAll();
		
		cadastropedido.addObject("tipoStatusList", tipoStatusList);
		cadastropedido.addObject("tipoList", tipoList);
		cadastropedido.addObject("mesaList", mesaList);


		
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
