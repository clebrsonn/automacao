package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.FornecedorDAO;
import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.dao.generic.ItemDAO;
import com.teccsoluction.sushi.dao.generic.PedidoCompraDAO;
import com.teccsoluction.sushi.entidade.Fornecedor;
import com.teccsoluction.sushi.entidade.Item;
import com.teccsoluction.sushi.entidade.PedidoCompra;
import com.teccsoluction.sushi.entidade.Produto;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEditor;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import com.teccsoluction.sushi.util.StatusPedido;
import com.teccsoluction.sushi.util.TipoPedido;
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
@RequestMapping(value = "pedidocompra/")
public class PedidoCompraController extends AbstractController<PedidoCompra> {


    private
    final
    AbstractEntityDao<PedidoCompra> pedidoCompraDao;


    private
    final
    AbstractEntityDao<Fornecedor> fornecedorDao;

    private
    final
    AbstractEntityDao<Item> itemDao;


    private
    final
    AbstractEntityDao<Produto> produtopedidovendaDao;
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
    public PedidoCompraController(PedidoCompraDAO dao, FornecedorDAO daofornecedor, ItemDAO daoitem, ProdutoDAO produtoDao) {

        super("pedidocompra");

        this.pedidoCompraDao = dao;
        this.fornecedorDao = daofornecedor;
        this.itemDao = daoitem;
        this.produtopedidovendaDao = produtoDao;

    }


    @Override
    protected AbstractEntityDao<PedidoCompra> getDao() {
        // TODO Auto-generated method stub
        return pedidoCompraDao;
    }


    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

        binder.registerCustomEditor(Fornecedor.class, new AbstractEditor<Fornecedor>(this.fornecedorDao) {
        });

        binder.registerCustomEditor(Item.class, new AbstractEditor<Item>(this.itemDao) {
        });


    }

    @ModelAttribute
    public void addAttributes(Model model) {

        List<Fornecedor> fornecedorList = fornecedorDao.getAll();
//	        List<Mesa> mesaList =mesaDao.getAll();

        TipoPedido[] tipoList = TipoPedido.values();
        StatusPedido[] tipoStatusList = StatusPedido.values();

        model.addAttribute("fornecedorList", fornecedorList);
//	        model.addAttribute("mesaList", mesaList);
        model.addAttribute("tipoList", tipoList);
        model.addAttribute("tipoStatusList", tipoStatusList);
    }


    @RequestMapping(value = "additemcompra", method = RequestMethod.GET)
    public ModelAndView additemcompra(HttpServletRequest request) {


        long idf = Long.parseLong(request.getParameter("idpedidocompra"));

        // VERIFICAR SE O ID DO PEDIDO � NNULO OU BRANCO
//	    	if((request.getParameter("idpedidocompra")== null) || (request.getParameter("idpedidocompra")== "")){
//	    	
//	    		
//	    		
//	    	}

        ModelAndView additemcompra = new ModelAndView("additemcompra");
        List<Item> itemList = itemDao.getAllItens(idf);

        PedidoCompra pc = pedidoCompraDao.PegarPorId(idf);

        additemcompra.addObject("itemList", itemList);

        additemcompra.addObject("pc", pc);


        return additemcompra;
    }


    @RequestMapping(value = "/movimentacaopedidocompralista", method = RequestMethod.GET)
    public ModelAndView pedidocompralist() {


        ModelAndView movimentacaopedidocompralista = new ModelAndView("movimentacaopedidocompralista");
        List<PedidoCompra> pedidoCompraList = pedidoCompraDao.getAll();

        movimentacaopedidocompralista.addObject("pedidoCompraList", pedidoCompraList);


        return movimentacaopedidocompralista;
    }

    @RequestMapping(value = "AddItemCompra", method = RequestMethod.POST)
    public ModelAndView additemcompraa(HttpServletRequest request) {


        long idf = Long.parseLong(request.getParameter("idpedidocompra"));
        ModelAndView movimentacaopedidocompra = new ModelAndView("movimentacaopedidocompra");

        //conversoes
//    		long idfprod = Long.parseLong(request.getParameter("codigoitem"));
//	    	long idf = Long.parseLong(request.getParameter("idpedidovenda"));
        double total = Double.parseDouble(request.getParameter("valor"));
        int qtd = Integer.parseInt(request.getParameter("quantidade"));
        double precounitario = Double.parseDouble(request.getParameter("valor"));


        PedidoCompra pc = pedidoCompraDao.PegarPorId(idf);

        Item item = new Item();

        item.setDescricao(request.getParameter("descricao"));
        item.setCodigo(request.getParameter("codigo"));
        item.setPrecoUnitario(precounitario);
        item.setQtd(qtd);
        item.setTotalItem(total);
        pc.setTotal(pc.getTotal() + total);


        item.setPedido(pc);

//	    	listaitens.add(item);
//	    	pc.setItems(listaitens);

        itemDao.add(item);

        List<Produto> produtoList = produtopedidovendaDao.getAll();
        List<Item> itemList = itemDao.getAllItens(idf);

        movimentacaopedidocompra.addObject("itemList", itemList);
        movimentacaopedidocompra.addObject("produtoList", produtoList);
        movimentacaopedidocompra.addObject("pc", pc);


        return movimentacaopedidocompra;
    }

//	    @RequestMapping(value = "AddItemCompra", method = RequestMethod.GET)
//		public ModelAndView  additemcompraGET(HttpServletRequest request){
//	    	
//   	
//	    	
//	    	Long idf = Long.parseLong(request.getParameter("idpedidocompra"));
//	    	ModelAndView movimentacaopedidocompra = new ModelAndView("movimentacaopedidocompra");
//	    	
//	    	PedidoCompra pc = pedidoCompraDao.PegarPorId(idf);
//	    		    
//	    	
//	    	List<Produto> produtoList = produtopedidovendaDao.getAll();
//	    	List<Item> itemList = itemDao.getAllItens(idf);
//	    	
//	    	movimentacaopedidocompra.addObject("itemList", itemList);
//	    	movimentacaopedidocompra.addObject("produtoList", produtoList);
//	    	movimentacaopedidocompra.addObject("pc", pc);
//
//			
//			return movimentacaopedidocompra;
//		}

    @RequestMapping(value = "carregarPedidoCompra", method = RequestMethod.GET)
    public ModelAndView carregarPedidoCompra(HttpServletRequest request) {


        ModelAndView movimentacaopedidocompra = new ModelAndView("movimentacaopedidocompra");

        long idf = Long.parseLong(request.getParameter("idpedidocompra"));
//  	    	long idfprod = Long.parseLong(request.getParameter("codigoitem"));
        PedidoCompra pc = pedidoCompraDao.PegarPorId(idf);


        List<Produto> produtoList = produtopedidovendaDao.getAll();
        List<Item> itemList = itemDao.getAllItens(idf);
//	    	Produto produto = produtopedidovendaDao.PegarPorId(idfprod);

        movimentacaopedidocompra.addObject("itemList", itemList);
        movimentacaopedidocompra.addObject("produtoList", produtoList);
        movimentacaopedidocompra.addObject("pc", pc);
//	    	movimentacaocaixa.addObject("produto", produto);


        return movimentacaopedidocompra;
    }

}
