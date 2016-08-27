package com.teccsoluction.sushi.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.dao.generic.ClienteDAO;
import com.teccsoluction.sushi.dao.generic.GarconDAO;
import com.teccsoluction.sushi.dao.generic.ItemDAO;
import com.teccsoluction.sushi.dao.generic.MesaDAO;
import com.teccsoluction.sushi.dao.generic.PagamentoDAO;
import com.teccsoluction.sushi.dao.generic.PedidoDAO;
import com.teccsoluction.sushi.dao.generic.PedidoVendaDAO;
import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.entidade.Cliente;
import com.teccsoluction.sushi.entidade.Fornecedor;
import com.teccsoluction.sushi.entidade.Garcon;
import com.teccsoluction.sushi.entidade.Item;
import com.teccsoluction.sushi.entidade.Mesa;
import com.teccsoluction.sushi.entidade.Pagamento;
import com.teccsoluction.sushi.entidade.Pedido;
import com.teccsoluction.sushi.entidade.PedidoVenda;
import com.teccsoluction.sushi.entidade.Produto;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEditor;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import com.teccsoluction.sushi.util.OrigemPedido;
import com.teccsoluction.sushi.util.StatusPedido;
import com.teccsoluction.sushi.util.TipoPedido;


@Controller
@RequestMapping(value = "pedidovenda/")
public class PedidoVendaController extends AbstractController<PedidoVenda> {

	
	private
	final
	AbstractEntityDao<PedidoVenda> pedidoVendaDao;
	
	
	private
	final
	AbstractEntityDao<Item> itempedidovendaDao;
	
	private
	final
	AbstractEntityDao<Produto> produtopedidovendaDao;
	
	private
	final
	AbstractEntityDao<Pagamento> pagamentopedidovendaDao;
//	private
//	AbstractEntityDao<Mesa> mesaDao;
	
	private	
	final
	AbstractEntityDao<Cliente> clienteDao;
		
		
//	public PedidoVendaController(PedidoVendaDAO dao, MesaDAO daomesa, GarconDAO daogarcon){
//		
//		super("pedidovenda");
//		
//		this.pedidoDao= dao;
//		this.garconDao= daogarcon;
//		this.mesaDao = daomesa;
//	}
	
	 @Autowired
	public PedidoVendaController(PedidoVendaDAO dao,ItemDAO daoitem,ProdutoDAO produtodao,PagamentoDAO pagamentodao, ClienteDAO daocliente){
	
	super("pedidovenda");
	this.pedidoVendaDao = dao;
	this.itempedidovendaDao= daoitem;
	this.produtopedidovendaDao = produtodao;
	this.pagamentopedidovendaDao = pagamentodao;
	this.clienteDao = daocliente;

}


	
	  @InitBinder
    protected void initBinder(HttpServletRequest request,  ServletRequestDataBinder binder) {

        binder.registerCustomEditor(Item.class, new AbstractEditor<Item>(this.itempedidovendaDao){
        });

        binder.registerCustomEditor(Cliente.class, new AbstractEditor<Cliente>(this.clienteDao) {
        });


    }
	  

@Override
protected AbstractEntityDao<PedidoVenda> getDao() {
	// TODO Auto-generated method stub
	return pedidoVendaDao;
}

	
	
	    @ModelAttribute
	    public void addAttributes(Model model) {
//
	        List<PedidoVenda> pedidoVendaList = pedidoVendaDao.getAll();
//	        List<Mesa> mesaList =mesaDao.getAll();
//	       
	        TipoPedido[] tipoList  = TipoPedido.values();	
			StatusPedido[]tipoStatusList = StatusPedido.values();
			
			OrigemPedido[] origemPedidoList = OrigemPedido.values();
			
			List <Cliente> clienteList =clienteDao.getAll();
//			
	        model.addAttribute("pedidoVendaList", pedidoVendaList);
	        model.addAttribute("origemPedidoList", origemPedidoList);
	        model.addAttribute("tipoList", tipoList);
	        model.addAttribute("tipoStatusList", tipoStatusList);
	        model.addAttribute("clienteList", clienteList);

	    }

	    
	    @RequestMapping(value = "additemvenda", method = RequestMethod.GET)
		public ModelAndView  additemvenda(HttpServletRequest request){
	    	
	    	
	    	
	    	
	    	Long idf = Long.parseLong(request.getParameter("idpedidovenda"));
	    	ModelAndView additemvenda = new ModelAndView("additemvenda");
	    	
	    	PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);
	    	
	    	
	    	List<Produto> produtoList = produtopedidovendaDao.getAll();
	    	List<Item> itemList = itempedidovendaDao.getAllItens(idf);
	    	
	    	additemvenda.addObject("itemList", itemList);
	    	additemvenda.addObject("produtoList", produtoList);
	    	additemvenda.addObject("pv", pv);

			
			return additemvenda;
		}
	    
	    
	    @RequestMapping(value = "AddItemVenda", method = RequestMethod.POST)
		public ModelAndView  additemvendaa(HttpServletRequest request){
	    	
	    	
//	    	long idf = Long.parseLong(request.getParameter("idpedidovenda"));
	    	ModelAndView additemvenda = new ModelAndView("additemvenda");
	    	
	    	
	    	//conversoes
    		long idfprod = Long.parseLong(request.getParameter("codigo"));
	    	long idf = Long.parseLong(request.getParameter("idpedidovenda"));
	    	double total = Double.parseDouble(request.getParameter("valor"));
	    	int qtd = Integer.parseInt(request.getParameter("quantidade"));
	    	double precounitario = Double.parseDouble(request.getParameter("valor"));
	    	
	    	PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);

	    	Item item = new Item();
	    	
	    	//setando os valores dos itens
	    	item.setDescricao(request.getParameter("descricao"));
	    	item.setCodigo(request.getParameter("codigo"));
	    	item.setPrecoUnitario(precounitario);
	    	item.setQtd(qtd);
	    	item.setTotalItem(precounitario*qtd);
	    	pv.setTotal(pv.getTotal()+(precounitario*qtd));

	    	
	    	item.setPedido(pv);
	    	
	    	itempedidovendaDao.add(item);
	    	
	    	List<Produto> produtoList = produtopedidovendaDao.getAll();
	    	List<Item> itemList = itempedidovendaDao.getAllItens(idf);
	    	
	    	additemvenda.addObject("itemList", itemList);
	    	additemvenda.addObject("produtoList", produtoList);
	    	additemvenda.addObject("pv", pv);

			
			return additemvenda;
		}
	    
	    // carrega a pagina de add forma
	    @RequestMapping(value = "addformapagamento", method = RequestMethod.GET)
		public ModelAndView  addFormaPagamento(HttpServletRequest request){
	    	
	    	
	    	Long idf = Long.parseLong(request.getParameter("id"));
	    	ModelAndView addformapagamento = new ModelAndView("addformapagamento");
	    	
	    	PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);
	    	
	    	
	    	List<Produto> produtoList = produtopedidovendaDao.getAll();
	    	List<Item> itemList = itempedidovendaDao.getAllItens(idf);
	    	List<Pagamento>pagamentoList = pagamentopedidovendaDao.getAllPagamento(idf);

	    	
	    	addformapagamento.addObject("itemList", itemList);
	    	addformapagamento.addObject("produtoList", produtoList);
	    	addformapagamento.addObject("pagamentoList", pagamentoList);

	    	addformapagamento.addObject("pv", pv);

			
			return addformapagamento;
		}
	    
	    // salva  forma pagamento
	    @RequestMapping(value = "AddPagamentoVenda", method = RequestMethod.POST)
		public ModelAndView  SalvarFormaPagamento(HttpServletRequest request){
	    	
	    	
	    	long idf = Long.parseLong(request.getParameter("idpedido"));
	    	ModelAndView addformapagamento = new ModelAndView("addformapagamento");
	    	
	    	PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);
	    	
	    	Pagamento pg = new Pagamento();
	    	pg.setPedido(pv);
	    	
	    	
	    	pagamentopedidovendaDao.add(pg);
	    	
	    	
	    	List<Produto> produtoList = produtopedidovendaDao.getAll();
	    	List<Item> itemList = itempedidovendaDao.getAllItens(idf);
	    	List<Pagamento>pagamentoList = pagamentopedidovendaDao.getAllPagamento(idf);

	    	
	    	addformapagamento.addObject("itemList", itemList);
	    	addformapagamento.addObject("produtoList", produtoList);
	    	addformapagamento.addObject("pagamentoList", pagamentoList);

	    	addformapagamento.addObject("pv", pv);

			
			return addformapagamento;
		}
	    
	    
	    // salva  forma pagamento
	    @RequestMapping(value = "finalizacaovenda", method = RequestMethod.POST)
		public ModelAndView  FinalizarVenda(HttpServletRequest request){
	    	
	    	
	    	long idf = Long.parseLong(request.getParameter("idpedido"));
	    	ModelAndView finalizacaovenda = new ModelAndView("finalizacaovenda");
	    	
//	    	PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);
//	    	
//	    	Pagamento pg = new Pagamento();
//	    	pg.setPedido(pv);
	    	
	    	
//	    	pagamentopedidovendaDao.add(pg);
//	    	
//	    	
//	    	List<Produto> produtoList = produtopedidovendaDao.getAll();
//	    	List<Item> itemList = itempedidovendaDao.getAllItens(idf);
//	    	List<Pagamento>pagamentoList = pagamentopedidovendaDao.getAllPagamento(idf);
//
//	    	
//	    	finalizacaovenda.addObject("itemList", itemList);
//	    	finalizacaovenda.addObject("produtoList", produtoList);
//	    	finalizacaovenda.addObject("pagamentoList", pagamentoList);

//	    	finalizacaovenda.addObject("pv", pv);

			
			return finalizacaovenda;
		}

}
