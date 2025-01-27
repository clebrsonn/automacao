package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.generic.DevolucaoCompraDAO;
import com.teccsoluction.sushi.dao.generic.ItemDAO;
import com.teccsoluction.sushi.dao.generic.PedidoCompraDAO;
import com.teccsoluction.sushi.entidade.DevolucaoCompra;
import com.teccsoluction.sushi.entidade.Item;
import com.teccsoluction.sushi.entidade.PedidoCompra;
import com.teccsoluction.sushi.entidade.PedidoVenda;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "devolucaocompra/")
public class DevolucaoCompraController extends AbstractController<DevolucaoCompra> {

    private
    final
    DevolucaoCompraDAO dao;
    
    
    private
	final
	AbstractEntityDao<PedidoCompra> pedidoCompraDao;
	

	
	private
	final
	AbstractEntityDao<Item> itemDao;
    
    
    
    

    @Autowired
    public DevolucaoCompraController(DevolucaoCompraDAO dao,PedidoCompraDAO daocompra, ItemDAO daoitem) {
        super("devolucaocompra");
        this.dao = dao;
        this.itemDao = daoitem;
        this.pedidoCompraDao = daocompra;
    }

    @Override
    protected AbstractEntityDao<DevolucaoCompra> getDao() {
        return dao;
    }
    
    @RequestMapping(value = "CarregarPedidoCompra", method = RequestMethod.GET)
   	public ModelAndView  carregarPedidoVenda(HttpServletRequest request){
       	
       
   	
   		ModelAndView cadastrodevolucaocompra = new ModelAndView("cadastrodevolucaocompra");

       	long idf = Long.parseLong(request.getParameter("idpedidocompra"));
//       	long idfprod = Long.parseLong(request.getParameter("codigoitem"));
       	PedidoCompra pc = pedidoCompraDao.PegarPorId(idf);
       	
       	
//       	List<Produto> produtoList = produtoDao.getAll();
       	List<Item> itemList = itemDao.getAllItens(idf);
//       	Produto produto = produtopedidovendaDao.PegarPorId(idfprod);
       	
       	cadastrodevolucaocompra.addObject("itemList", itemList);
//       	cadastrorecebimento.addObject("produtoList", produtoList);
       	cadastrodevolucaocompra.addObject("pc", pc);
//       	movimentacaocaixa.addObject("produto", produto);


   		
   		return cadastrodevolucaocompra;
   	}

}
