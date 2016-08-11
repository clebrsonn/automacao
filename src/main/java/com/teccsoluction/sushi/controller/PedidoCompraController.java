package com.teccsoluction.sushi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teccsoluction.sushi.dao.generic.PedidoCompraDAO;

import com.teccsoluction.sushi.entidade.PedidoCompra;
import com.teccsoluction.sushi.framework.AbstractController;

import com.teccsoluction.sushi.framework.AbstractEntityDao;



@Controller
@RequestMapping(value = "pedidocompra/")
public class PedidoCompraController extends AbstractController<PedidoCompra> {

	
	private
	final
	AbstractEntityDao<PedidoCompra> pedidoCompraDao;
//	private
//	AbstractEntityDao<Mesa> mesaDao;
//	private	
//	AbstractEntityDao<Garcon> garconDao;
		
		
//	public PedidoCompraController(PedidoDAO dao, MesaDAO daomesa, GarconDAO daogarcon){
//		
//		super("pedido");
//		
//		this.pedidoDao= dao;
//		this.garconDao= daogarcon;
//		this.mesaDao = daomesa;
//	}
	
	@Autowired
	public PedidoCompraController(PedidoCompraDAO dao){
		
		super("pedidocompra");
		
		this.pedidoCompraDao= dao;

	}



	@Override
	protected AbstractEntityDao<PedidoCompra> getDao() {
		// TODO Auto-generated method stub
		return pedidoCompraDao;
	}  

	
//	  @InitBinder
//    protected void initBinder(HttpServletRequest request,  ServletRequestDataBinder binder) {
//
//        binder.registerCustomEditor(Mesa.class, new AbstractEditor<Mesa>(this.mesaDao){
//        });
//
//        binder.registerCustomEditor(Garcon.class, new AbstractEditor<Garcon>(this.garconDao) {
//        });
//
//
//    }
	  
	    @ModelAttribute
	    public void addAttributes(Model model) {

//	        List<Garcon> garconList =garconDao.getAll();
//	        List<Mesa> mesaList =mesaDao.getAll();
//	       
//	        TipoPedido[] tipoList  = TipoPedido.values();	
//			StatusPedido[]tipoStatusList = StatusPedido.values();
//			
//	        model.addAttribute("garconList", garconList);
//	        model.addAttribute("mesaList", mesaList);
//	        model.addAttribute("tipoList", tipoList);
//	        model.addAttribute("tipoStatusList", tipoStatusList);
	    }




}
