package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.dao.generic.CaixaDAO;
import com.teccsoluction.sushi.dao.generic.ClienteDAO;
import com.teccsoluction.sushi.dao.generic.GarconDAO;
import com.teccsoluction.sushi.dao.generic.ItemDAO;
import com.teccsoluction.sushi.dao.generic.PedidoVendaDAO;
import com.teccsoluction.sushi.entidade.Caixa;
import com.teccsoluction.sushi.entidade.Cliente;
import com.teccsoluction.sushi.entidade.Fornecedor;
import com.teccsoluction.sushi.entidade.Garcon;
import com.teccsoluction.sushi.entidade.Item;
import com.teccsoluction.sushi.entidade.PedidoCompra;
import com.teccsoluction.sushi.entidade.PedidoVenda;
import com.teccsoluction.sushi.entidade.Produto;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEditor;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

import java.util.Date;
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
	AbstractEntityDao<Cliente> clienteDao;
	
	private
	final
	AbstractEntityDao<Item> itemDao;
	
	
	private
	final
	AbstractEntityDao<Produto> produtopedidovendaDao;
    
//	@Autowired
//    public CaixaController() {
//        super("caixa");
//  
//    }
	

    @Autowired
    public CaixaController(CaixaDAO dao,ProdutoDAO daoprod,ItemDAO daoitem,ClienteDAO daocli,PedidoVendaDAO daopedido) {
        super("caixa");
        this.dao = dao;
        
        this.clienteDao =daocli;
        this.itemDao = daoitem;
        this.produtopedidovendaDao = daoprod;
        this.pedidoVendaDao =daopedido;
    } 

    @Override
    protected AbstractEntityDao<Caixa> getDao() {
        return dao;
    }
    
	  @InitBinder
	    protected void initBinder(HttpServletRequest request,  ServletRequestDataBinder binder) {

	        binder.registerCustomEditor(Cliente.class, new AbstractEditor<Cliente>(this.clienteDao){
	        });

	        binder.registerCustomEditor(Item.class, new AbstractEditor<Item>(this.itemDao) {
	        });
	        
	        binder.registerCustomEditor(Produto.class, new AbstractEditor<Produto>(this.produtopedidovendaDao) {
	        });
	        
	        binder.registerCustomEditor(PedidoVenda.class, new AbstractEditor<PedidoVenda>(this.pedidoVendaDao) {
	        });


	    }
    
    @RequestMapping(value = "carregarPedido", method = RequestMethod.POST)
  		public ModelAndView  carregarPedidoCaixa(HttpServletRequest request){
  	    	
  	    
    	
    		ModelAndView movimentacaocaixa = new ModelAndView("movimentacaocaixa");

  	    	long idf = Long.parseLong(request.getParameter("idpedidovenda"));
//  	    	long idfprod = Long.parseLong(request.getParameter("codigoitem"));
	    	PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);
	    	
	    	
	    	List<Produto> produtoList = produtopedidovendaDao.getAll();
	    	List<Item> itemList = itemDao.getAllItens(idf);
//	    	Produto produto = produtopedidovendaDao.PegarPorId(idfprod);
	    	
	    	movimentacaocaixa.addObject("itemList", itemList);
	    	movimentacaocaixa.addObject("produtoList", produtoList);
	    	movimentacaocaixa.addObject("pv", pv);
//	    	movimentacaocaixa.addObject("produto", produto);


			
			return movimentacaocaixa;
    	}
    
    //POST
    
    	@RequestMapping(value = "AddItemVenda", method = RequestMethod.GET)
		public ModelAndView  additemvendaPOST(HttpServletRequest request){

	
    		ModelAndView movimentacaocaixa = new ModelAndView("movimentacaocaixa");
  	    	
    		//convers�es
    		long idfprod = Long.parseLong(request.getParameter("codigoitem"));
	    	long idf = Long.parseLong(request.getParameter("pedidovendaid"));
	    	double total = Double.parseDouble(request.getParameter("valortotal"));
	    	int qtd = Integer.parseInt(request.getParameter("quantidadeitem"));
	    	double precounitario = Double.parseDouble(request.getParameter("valoritem"));
	    	
	    	
	    	//carregamento de objetos
//	    	Produto produto = produtopedidovendaDao.PegarPorId(idfprod);

	    	PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);
	    	
	    	//instancia de itens e set
	    	Item item = new Item();
	    	
//	    	item.setProduto(produto);
	    	item.setDescricao(request.getParameter("descricaoitem"));
//	    	item.setCodigo(produto.getCodebar());
	    	item.setPrecoUnitario(precounitario);
	    	item.setQtd(qtd);
	    	item.setTotalItem(precounitario*qtd);

	    	item.setPedido(pv);
	    	// ajustando o total do pedido pra ser o total + qtd*precovenda do item
	    	pv.setTotal(pv.getTotal()+(precounitario*qtd));
	    	
	    	itemDao.add(item);
	    	
	    	//listas para carregar na view
	    	List<Produto> produtoList = produtopedidovendaDao.getAll();
	    	List<Item> itemList = itemDao.getAllItens(idf);
	    	
	    	// add objetos na view
	    	movimentacaocaixa.addObject("itemList", itemList);
	    	movimentacaocaixa.addObject("pv", pv);
//	    	movimentacaocaixa.addObject("produto", produto);

		
	    		return movimentacaocaixa;
	}
    
    
}
