package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.dao.generic.CaixaDAO;
import com.teccsoluction.sushi.dao.generic.GarconDAO;
import com.teccsoluction.sushi.dao.generic.ItemDAO;
import com.teccsoluction.sushi.dao.generic.PedidoVendaDAO;
import com.teccsoluction.sushi.entidade.Caixa;
import com.teccsoluction.sushi.entidade.Garcon;
import com.teccsoluction.sushi.entidade.Item;
import com.teccsoluction.sushi.entidade.PedidoVenda;
import com.teccsoluction.sushi.entidade.Produto;
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
@RequestMapping(value = "caixa/")
public class CaixaController extends AbstractController<Caixa> {

    private
    final
    CaixaDAO dao;
    
    private
	final
	AbstractEntityDao<PedidoVenda> pedidoVendaDao;
    
    private
	final
	AbstractEntityDao<Produto> produtopedidovendaDao;
    
    private
	final
	AbstractEntityDao<Item> itempedidovendaDao;
	

    @Autowired
    public CaixaController(CaixaDAO dao,PedidoVendaDAO daovenda,ProdutoDAO daoproduto,ItemDAO daoitem) {
        super("caixa");
        this.dao = dao;
        this.pedidoVendaDao = daovenda;
        this.produtopedidovendaDao = daoproduto;
        this.itempedidovendaDao =daoitem;
    }

    @Override
    protected AbstractEntityDao<Caixa> getDao() {
        return dao;
    }
    
    
    @RequestMapping(value = "additemvenda", method = RequestMethod.POST)
	public ModelAndView  additemvenda(HttpServletRequest request){
    	
    	
    	Long idf = Long.parseLong(request.getParameter("idpedidovenda"));
    	ModelAndView movimentacaocaixa = new ModelAndView("movimentacaocaixa");
    	
    	PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);
    	
    	
    	List<Produto> listProduto = produtopedidovendaDao.getAll();
    	List<Item> itemList = itempedidovendaDao.getAllItens(idf);
    	
    	movimentacaocaixa.addObject("itemList", itemList);
    	movimentacaocaixa.addObject("listProduto", listProduto);
    	movimentacaocaixa.addObject("pv", pv);

		
		return movimentacaocaixa;
	}
    
    
}
