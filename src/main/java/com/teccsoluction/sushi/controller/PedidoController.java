package com.teccsoluction.sushi.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import com.teccsoluction.sushi.dao.generic.GarconDAO;
import com.teccsoluction.sushi.dao.generic.MesaDAO;
import com.teccsoluction.sushi.dao.generic.PedidoDAO;
import com.teccsoluction.sushi.entidade.Garcon;
import com.teccsoluction.sushi.entidade.Mesa;
import com.teccsoluction.sushi.entidade.Pedido;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEditor;
import com.teccsoluction.sushi.framework.AbstractEntityDao;


@Controller
@RequestMapping(value = "pedido/")
public class PedidoController extends AbstractController<Pedido> {

	
	private
	final
	AbstractEntityDao<Pedido> pedidoDao;
	private
	AbstractEntityDao<Mesa> mesaDao;
	private	
	AbstractEntityDao<Garcon> garconDao;
		
		
	public PedidoController(PedidoDAO dao, MesaDAO daomesa, GarconDAO daogarcon){
		
		super("pedido");
		
		this.pedidoDao= dao;
		this.garconDao= daogarcon;
		this.mesaDao = daomesa;
	}


	@Override
	protected AbstractEntityDao<Pedido> getDao() {
		// TODO Auto-generated method stub
		return pedidoDao;
	}
	
	  @InitBinder
    protected void initBinder(HttpServletRequest request,  ServletRequestDataBinder binder) {

        binder.registerCustomEditor(Mesa.class, new AbstractEditor<Mesa>(this.mesaDao){
        });

        binder.registerCustomEditor(Garcon.class, new AbstractEditor<Garcon>(this.garconDao) {
        });


    }
	  
	  

}