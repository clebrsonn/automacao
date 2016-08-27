package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.dao.generic.CaixaDAO;
import com.teccsoluction.sushi.dao.generic.ClienteDAO;
import com.teccsoluction.sushi.dao.generic.ItemDAO;
import com.teccsoluction.sushi.dao.generic.PagamentoDAO;
import com.teccsoluction.sushi.dao.generic.PedidoVendaDAO;
import com.teccsoluction.sushi.entidade.Cliente;
import com.teccsoluction.sushi.entidade.Item;
import com.teccsoluction.sushi.entidade.Pagamento;
import com.teccsoluction.sushi.entidade.PedidoVenda;
import com.teccsoluction.sushi.entidade.Produto;
import com.teccsoluction.sushi.framework.AbstractEditor;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "relatorio/")
public class RelatorioController {


	

	
	
	public RelatorioController() {
	// TODO Auto-generated constructor stub
	}

    
	  @InitBinder
	    protected void initBinder(HttpServletRequest request,  ServletRequestDataBinder binder) {

//	        binder.registerCustomEditor(Cliente.class, new AbstractEditor<Cliente>(this.clienteDao){
//	        });
//
//	        binder.registerCustomEditor(Item.class, new AbstractEditor<Item>(this.itemDao) {
//	        });
//	        
//	        binder.registerCustomEditor(Produto.class, new AbstractEditor<Produto>(this.produtopedidovendaDao) {
//	        });
//	        
//	        binder.registerCustomEditor(PedidoVenda.class, new AbstractEditor<PedidoVenda>(this.pedidoVendaDao) {
//	        });


	    }
    
	  @RequestMapping(value = "relatorio", method = RequestMethod.GET)
		public ModelAndView  carregarSuporte(HttpServletRequest request){
	    	
	    
  	
  		ModelAndView relatorio = new ModelAndView("relatorio");

//	    	long idf = Long.parseLong(request.getParameter("idpedidovenda"));
//	    	long idfprod = Long.parseLong(request.getParameter("codigoitem"));
//	    	PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);
	    	
	    	
//	    	List<PedidoVenda> pedidovendaList = pedidoVendaDao.getAll();
//	    	List<Item> itemList = itemDao.getAllItens(idf);
//	    	Produto produto = produtopedidovendaDao.PegarPorId(idfprod);
	    	
//	    	movimentacaodelivery.addObject("itemList", itemList);
//  		financeiro.addObject("pedidovendaList", pedidovendaList);
//	    	movimentacafinanceiroodelivery.addObject("pv", pv);
//	    	movimentacaocaixa.addObject("produto", produto);
	    	
	


			
			return relatorio;
  	}
    
    
}
