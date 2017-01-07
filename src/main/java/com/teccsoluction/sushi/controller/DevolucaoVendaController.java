package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.generic.DevolucaoVendaDAO;
import com.teccsoluction.sushi.dao.generic.ItemDAO;
import com.teccsoluction.sushi.dao.generic.PedidoVendaDAO;
import com.teccsoluction.sushi.entidade.DevolucaoVenda;
import com.teccsoluction.sushi.entidade.Item;
import com.teccsoluction.sushi.entidade.PedidoVenda;
import com.teccsoluction.sushi.framework.AbstractController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "devolucaovenda/")
public class DevolucaoVendaController extends AbstractController<DevolucaoVenda> {

    private
    final
    DevolucaoVendaDAO devolucaodao;


    private
    final
    PedidoVendaDAO pedidoVendaDao;


    private
    final
    ItemDAO itemDao;


    @Autowired
    public DevolucaoVendaController(DevolucaoVendaDAO dao, PedidoVendaDAO daovenda, ItemDAO daoitem) {
        super("devolucaovenda");
        this.devolucaodao = dao;
        this.itemDao = daoitem;
        this.pedidoVendaDao = daovenda;
    }

    @Override
    protected DevolucaoVendaDAO getDao() {
        return devolucaodao;
    }


    @RequestMapping(value = "CarregarPedidoVenda", method = RequestMethod.GET)
    public ModelAndView carregarPedidoVenda(HttpServletRequest request) {


        ModelAndView cadastrodevolucaovenda = new ModelAndView("cadastrodevolucaovenda");

        long idf = Long.parseLong(request.getParameter("idpedidovenda"));
//    	long idfprod = Long.parseLong(request.getParameter("codigoitem"));
        PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);


//    	List<Produto> produtoList = produtoDao.getAll();
        List<Item> itemList = itemDao.getAllItens(idf);
//    	Produto produto = produtopedidovendaDao.PegarPorId(idfprod);

        cadastrodevolucaovenda.addObject("itemList", itemList);
//    	cadastrorecebimento.addObject("produtoList", produtoList);
        cadastrodevolucaovenda.addObject("pv", pv);
//    	movimentacaocaixa.addObject("produto", produto);


        return cadastrodevolucaovenda;
    }

}
