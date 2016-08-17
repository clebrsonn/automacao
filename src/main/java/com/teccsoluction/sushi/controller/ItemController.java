package com.teccsoluction.sushi.controller;


import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.dao.generic.ItemDAO;
import com.teccsoluction.sushi.dao.generic.PedidoVendaDAO;
import com.teccsoluction.sushi.entidade.Item;
import com.teccsoluction.sushi.entidade.PedidoVenda;
import com.teccsoluction.sushi.entidade.Produto;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by clebr on 06/07/2016.
 */
@RequestMapping(value = "item/")
public class ItemController extends AbstractController<Item> {


    private @Autowired
    ItemDAO dao;
    
//	private
//	final
//	AbstractEntityDao<PedidoVenda> pedidovendaDao;
//	
//	private
//	final
//	AbstractEntityDao<Produto> produtoDao;


//    public ItemController(ItemDAO itemdao, ProdutoDAO produtodao,PedidoVendaDAO pedidovendaDao) {
//        super("item");
//        this.dao=itemdao;
//        this.pedidovendaDao = pedidovendaDao;
//        this.produtoDao = produtodao;
//    }
    
    public ItemController(ItemDAO itemdao) {
        super("item");
        this.dao=itemdao;
 
    }

    @Override
    protected AbstractEntityDao<Item> getDao() {
        return dao;
    }
    
    
    
//    @RequestMapping(value = "additemvenda/", method = RequestMethod.GET)
//	public ModelAndView  additemvenda(HttpServletRequest request){
//    	
//    	
//    	Long idf = Long.parseLong(request.getParameter("id"));
//    	ModelAndView additemvenda = new ModelAndView("additemvenda");
//    	
//    	PedidoVenda pv = pedidovendaDao.PegarPorId(idf);
//    	
//    	
//    	List<Produto> produtoList = produtoDao.getAll();
//    	List<Item> itemList = dao.getAll();
//    	
//    	additemvenda.addObject("itemList", itemList);
//    	additemvenda.addObject("produtoList", produtoList);
//    	additemvenda.addObject("pv", pv);
//
//		
//		return additemvenda;
//	}
    
    
}
