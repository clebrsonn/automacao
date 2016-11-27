package com.teccsoluction.sushi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "suporte/")
public class SuporteController {


    public SuporteController() {
        // TODO Auto-generated constructor stub
    }


    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

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

    @RequestMapping(value = "suporte", method = RequestMethod.GET)
    public ModelAndView carregarSuporte(HttpServletRequest request) {


        ModelAndView suporte = new ModelAndView("suporte");

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


        return suporte;
    }


}
