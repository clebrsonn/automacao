package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.FornecedorDAO;
import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.dao.ItemDAO;
import com.teccsoluction.sushi.dao.PedidoCompraDAO;
import com.teccsoluction.sushi.dao.RecebimentoDAO;
import com.teccsoluction.sushi.entidade.*;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEditor;
import com.teccsoluction.sushi.util.StatusPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "recebimento/")
public class RecebimentoController extends AbstractController<Recebimento> {

    private
    final
    RecebimentoDAO daorecebimento;

    private
    final
    FornecedorDAO fornecedorDao;

    private
    final
    PedidoCompraDAO pedidoCompraDao;


    private
    final
    ProdutoDAO produtoDao;

    private
    final
    ItemDAO itemDao;


    @Autowired
    public RecebimentoController(RecebimentoDAO dao, FornecedorDAO daofornecedor, PedidoCompraDAO daocompra, ProdutoDAO daoproduto, ItemDAO daoitem) {

        super("recebimento");
        this.daorecebimento = dao;
        this.fornecedorDao = daofornecedor;
        this.pedidoCompraDao = daocompra;
        this.produtoDao = daoproduto;
        this.itemDao = daoitem;
    }


    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

        binder.registerCustomEditor(Fornecedor.class, new AbstractEditor<Fornecedor>(this.fornecedorDao) {
        });

//	        binder.registerCustomEditor(Cliente.class, new AbstractEditor<Cliente>(this.clienteDao) {
//	        });


    }


    @Override
    protected RecebimentoDAO getDao() {
        // TODO Auto-generated method stub
        return daorecebimento;
    }

    @ModelAttribute
    public void addAttributes(Model model) {

        //lista de fornecedor para carregar no add recebimento
        List<Fornecedor> forneccedorList = fornecedorDao.getAll();
        //carregando o status do ENU
        StatusPedido[] tipoStatusList = StatusPedido.values();


        //adiciona o atributo no modelo para view
        model.addAttribute("forneccedorList", forneccedorList);
        model.addAttribute("tipoStatusList", tipoStatusList);


    }

//	  @RequestMapping(value = "additemrecebimento", method = RequestMethod.GET)
//			public ModelAndView  additemrecebimento(HttpServletRequest request){
//		    	
//		    	
//		    	
//		    	
//		    	Long idf = Long.parseLong(request.getParameter("idpedidocompra"));
//		    	ModelAndView additemrecebimento = new ModelAndView("additemrecebimento");
//		    	
//		    	PedidoCompra pc = pedidoCompraDao.PegarPorId(idf);
//		    	
//		    	
//		    	List<Produto> produtoList = produtoDao.getAll();
//		    	List<Item> itemList = itemDao.getAllItens(idf);
//		    	
//		    	additemrecebimento.addObject("itemList", itemList);
//		    	additemrecebimento.addObject("produtoList", produtoList);
//		    	additemrecebimento.addObject("pc", pc);
//
//				
//				return additemrecebimento;
//			}

    @RequestMapping(value = "CarregarPedidoCompra", method = RequestMethod.GET)
    public ModelAndView carregarPedidoRecebimento(HttpServletRequest request) {


        ModelAndView cadastrorecebimento = new ModelAndView("cadastrorecebimento");

        long idf = Long.parseLong(request.getParameter("idpedidocompra"));
//	    	long idfprod = Long.parseLong(request.getParameter("codigoitem"));
        PedidoCompra pc = pedidoCompraDao.PegarPorId(idf);


        List<Produto> produtoList = produtoDao.getAll();
        List<Item> itemList = itemDao.getAllItens(idf);
//	    	Produto produto = produtopedidovendaDao.PegarPorId(idfprod);

        cadastrorecebimento.addObject("itemList", itemList);
        cadastrorecebimento.addObject("produtoList", produtoList);
        cadastrorecebimento.addObject("pc", pc);
//	    	movimentacaocaixa.addObject("produto", produto);


        return cadastrorecebimento;
    }


}
