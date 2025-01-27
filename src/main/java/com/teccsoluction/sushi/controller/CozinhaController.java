package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.generic.ItemDAO;

import com.teccsoluction.sushi.dao.generic.PedidoVendaDAO;

import com.teccsoluction.sushi.entidade.Item;

import com.teccsoluction.sushi.entidade.PedidoVenda;

import com.teccsoluction.sushi.framework.AbstractEditor;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

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
@RequestMapping(value = "cozinha/")
public class CozinhaController {

    
	private
	final
	AbstractEntityDao<PedidoVenda> pedidoVendaDao;
	
	
	private
	final
	AbstractEntityDao<Item> itemDao;
	
	
//	@Autowired
//    public CaixaController() {
//        super("caixa");
//  
//    }
	

    @Autowired
    public CozinhaController(ItemDAO daoitem,PedidoVendaDAO daopedido) {
        super();

        this.itemDao = daoitem;
        this.pedidoVendaDao =daopedido;

    } 

    
	  @InitBinder
	    protected void initBinder(HttpServletRequest request,  ServletRequestDataBinder binder) {

//	        binder.registerCustomEditor(Cliente.class, new AbstractEditor<Cliente>(this.clienteDao){
//	        });

	        binder.registerCustomEditor(Item.class, new AbstractEditor<Item>(this.itemDao) {
	        });
	        
//	        binder.registerCustomEditor(Produto.class, new AbstractEditor<Produto>(this.produtopedidovendaDao) {
//	        });
	        
	        binder.registerCustomEditor(PedidoVenda.class, new AbstractEditor<PedidoVenda>(this.pedidoVendaDao) {
	        });


	    }
    
    @RequestMapping(value = "carregarPedidoEmPreparacao", method = RequestMethod.GET)
  		public ModelAndView  carregarPedidoEmPreparacao(HttpServletRequest request){
  	    	
  	    
    	
    		ModelAndView movimentacaocozinha = new ModelAndView("movimentacaocozinha");

//  	    	long idf = Long.parseLong(request.getParameter("idpedidovenda"));
//  	    	long idfprod = Long.parseLong(request.getParameter("codigoitem"));
//	    	PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);
	    	
	    	
	    	List<PedidoVenda> pedidovendaList = pedidoVendaDao.getAll();
//	    	List<Item> itemList = itemDao.getAllItens();
//	    	Produto produto = produtopedidovendaDao.PegarPorId(idfprod);
	    	
//	    	movimentacaocozinha.addObject("itemList", itemList);
	    	movimentacaocozinha.addObject("pedidovendaList", pedidovendaList);
//	    	movimentacaocozinha.addObject("pv", pv);
//	    	movimentacaocaixa.addObject("produto", produto);


			
			return movimentacaocozinha;
    	}
    
    //POST
//    
//    	@RequestMapping(value = "AddItemVenda", method = RequestMethod.POST)
//		public ModelAndView  additemvendaPOST(HttpServletRequest request){
//
//	
//    		ModelAndView movimentacaocaixa = new ModelAndView("movimentacaocaixa");
//  	    	
//    		//convers�es
//    		long idfprod = Long.parseLong(request.getParameter("codigoitem"));
//	    	long idf = Long.parseLong(request.getParameter("pedidovendaid"));
//	    	double total = Double.parseDouble(request.getParameter("valortotal"));
//	    	int qtd = Integer.parseInt(request.getParameter("quantidadeitem"));
//	    	double precounitario = Double.parseDouble(request.getParameter("valoritem"));
//	    	
//	    	
//	    	//carregamento de objetos
////	    	Produto produto = produtopedidovendaDao.PegarPorId(idfprod);
//
//	    	PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);
//	    	
//	    	//instancia de itens e set
//	    	Item item = new Item();
//	    	
////	    	item.setProduto(produto);
//	    	item.setDescricao(request.getParameter("descricaoitem"));
//	    	item.setCodigo(request.getParameter("codigoitem"));
//	    	item.setPrecoUnitario(precounitario);
//	    	item.setQtd(qtd);
//	    	item.setTotalItem(precounitario*qtd);
//
//	    	item.setPedido(pv);
//	    	// ajustando o total do pedido pra ser o total + qtd*precovenda do item
//	    	pv.setTotal(pv.getTotal()+(precounitario*qtd));
//	    	
//	    	itemDao.add(item);
//	    	
//	    	//listas para carregar na view
//	    	List<Produto> produtoList = produtopedidovendaDao.getAll();
//	    	List<Item> itemList = itemDao.getAllItens(idf);
//	    	
//	    	// add objetos na view
//	    	movimentacaocaixa.addObject("itemList", itemList);
//	    	movimentacaocaixa.addObject("pv", pv);
////	    	movimentacaocaixa.addObject("produto", produto);
//
//		
//	    		return movimentacaocaixa;
//	}
//    	
//    	 // carrega a pagina de add forma
//	    @RequestMapping(value = "addformapagamento", method = RequestMethod.POST)
//		public ModelAndView  addFormaPagamento(HttpServletRequest request){
//	    	
//	    	
//	    	Long idf = Long.parseLong(request.getParameter("pedidovendaid"));
//	    	ModelAndView addformapagamento = new ModelAndView("addformapagamento");
//	    	
//	    	PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);
//	    	
//	    	
//	    	List<Produto> produtoList = produtopedidovendaDao.getAll();
//	    	List<Item> itemList = itemDao.getAllItens(idf);
//	    	List<Pagamento>pagamentoList =pagamentoDao.getAllPagamento(idf);
//
//	    	
//	    	addformapagamento.addObject("itemList", itemList);
//	    	addformapagamento.addObject("produtoList", produtoList);
//	    	addformapagamento.addObject("pagamentoList", pagamentoList);
//
//	    	addformapagamento.addObject("pv", pv);
//
//			
//			return addformapagamento;
//		}
//	    
//	    // salva  forma pagamento
//	    @RequestMapping(value = "AddPagamentoVenda", method = RequestMethod.POST)
//		public ModelAndView  SalvarFormaPagamento(HttpServletRequest request){
//	    	
//	    	
//	    	long idf = Long.parseLong(request.getParameter("idpedido"));
//	    	ModelAndView addformapagamento = new ModelAndView("addformapagamento");
//	    	
//	    	PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);
//	    	
//	    	Pagamento pg = new Pagamento();
//	    	
//	    	//convertendo as strings da view
//	    	
////	    	String nome = Long.parseLong();
//	    	int parcela = Integer.parseInt(request.getParameter("qtdparcela"));
////	    	long nome = Long.parseLong(request.getParameter(""));
////	    	long nome = Long.parseLong(request.getParameter(""));
//
//	    	pg.setPedido(pv);
//	    	pg.setNome(request.getParameter("nome"));
//	    	pg.setNumero(request.getParameter("numero"));
//	    	pg.setParcelas(parcela);
//	    	pg.setTipo(request.getParameter("tipo"));;
//	    	
//	    	
//	    	pagamentoDao.add(pg);
//	    	
//	    	
//	    	List<Produto> produtoList = produtopedidovendaDao.getAll();
//	    	List<Item> itemList = itemDao.getAllItens(idf);
//	    	List<Pagamento>pagamentoList = pagamentoDao.getAllPagamento(idf);
//
//	    	
//	    	addformapagamento.addObject("itemList", itemList);
//	    	addformapagamento.addObject("produtoList", produtoList);
//	    	addformapagamento.addObject("pagamentoList", pagamentoList);
//
//	    	addformapagamento.addObject("pv", pv);
//
//			
//			return addformapagamento;
//		}
    
    
}
