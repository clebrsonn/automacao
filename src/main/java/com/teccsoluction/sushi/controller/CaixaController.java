package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.*;
import com.teccsoluction.sushi.entidade.*;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "caixa/")
public class CaixaController extends AbstractController<Caixa> {

    private
    final
    CaixaDAO dao;


    private
    final
    PedidoVendaDAO pedidoVendaDao;


    private
    final
    ClienteDAO clienteDao;

    private
    final
    ItemDAO itemDao;


    private
    final
    ProdutoDAO produtopedidovendaDao;


    private
    final
    PagamentoDAO pagamentoDao;

//	@Autowired
//    public CaixaController() {
//        super("caixa");
//  
//    }


    @Autowired
    public CaixaController(CaixaDAO dao, ProdutoDAO daoprod, ItemDAO daoitem, ClienteDAO daocli, PedidoVendaDAO daopedido, PagamentoDAO daopag) {
        super("caixa");
        this.dao = dao;
        this.clienteDao = daocli;
        this.itemDao = daoitem;
        this.produtopedidovendaDao = daoprod;
        this.pedidoVendaDao = daopedido;
        this.pagamentoDao = daopag;
    }

    @Override
    protected CaixaDAO getDao() {
        return dao;
    }

    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

        binder.registerCustomEditor(Cliente.class, new AbstractEditor<Cliente>(this.clienteDao) {
        });

        binder.registerCustomEditor(Item.class, new AbstractEditor<Item>(this.itemDao) {
        });

        binder.registerCustomEditor(Produto.class, new AbstractEditor<Produto>(this.produtopedidovendaDao) {
        });

        binder.registerCustomEditor(PedidoVenda.class, new AbstractEditor<PedidoVenda>(this.pedidoVendaDao) {
        });


    }

    @RequestMapping(value = "carregarPedido", method = RequestMethod.GET)
    public ModelAndView carregarPedidoCaixa(HttpServletRequest request) {


        ModelAndView movimentacaocaixa = new ModelAndView("movimentacaocaixa");

        long idf = Long.parseLong(request.getParameter("idpedidovenda"));
//  	    	long idfprod = Long.parseLong(request.getParameter("codigoitem"));
        PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);


        List<Produto> produtoList = produtopedidovendaDao.getAll();
        List<Item> itemList = itemDao.getAllItens(idf);
//	    	Produto produto = produtopedidovendaDao.PegarPorId(idfprod);

        //VARI�VEL QUE RECEBERA O VALOR TOTAL DE CADA ITEM
        double totalpedido = 0;


        //PERCORRE A LISTA DE ITEM PEGANDO O VALOR TOTAL DE CADA ITEM PARA OBTER O VALOR TOTAL
        for (Item itempedido : itemList) {

            totalpedido += itempedido.getTotalItem();

        }

        movimentacaocaixa.addObject("itemList", itemList);
        movimentacaocaixa.addObject("produtoList", produtoList);
        movimentacaocaixa.addObject("pv", pv);
        movimentacaocaixa.addObject("totalpedido", totalpedido);


        return movimentacaocaixa;
    }

    //POST

    @RequestMapping(value = "AddItemVenda", method = RequestMethod.POST)
    public ModelAndView additemvendaPOST(HttpServletRequest request) {


        ModelAndView movimentacaocaixa = new ModelAndView("movimentacaocaixa");

        //conversoes
        long idfprod = Long.parseLong(request.getParameter("codigo"));
        long idf = Long.parseLong(request.getParameter("idpedidovenda"));
        double total = Double.parseDouble(request.getParameter("valor"));
        int qtd = Integer.parseInt(request.getParameter("quantidade"));
        double precounitario = Double.parseDouble(request.getParameter("valor"));


        //carregamento de objetos
//	    	Produto produto = produtopedidovendaDao.PegarPorId(idfprod);

        PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);

        //instancia de itens e set
        Item item = new Item();

//	    	item.setProduto(produto);
        item.setDescricao(request.getParameter("descricao"));
        item.setCodigo(request.getParameter("codigo"));
        item.setPrecoUnitario(precounitario);
        item.setQtd(qtd);
        item.setTotalItem(precounitario * qtd);

        item.setPedido(pv);
        // ajustando o total do pedido pra ser o total + qtd*precovenda do item
        pv.setTotal(pv.getTotal() + (item.getTotalItem()));

        itemDao.add(item);

        //listas para carregar na view
        List<Produto> produtoList = produtopedidovendaDao.getAll();
        List<Item> itemList = itemDao.getAllItens(idf);


        //VARIAVEL QUE RECEBERA O VALOR TOTAL DE CADA ITEM
        double totalpedido = 0;


        //PERCORRE A LISTA DE ITEM PEGANDO O VALOR TOTAL DE CADA ITEM PARA OBTER O VALOR TOTAL
        for (Item itempedido : itemList) {

            totalpedido += itempedido.getTotalItem();

        }

        // add objetos na view
        movimentacaocaixa.addObject("itemList", itemList);
        movimentacaocaixa.addObject("pv", pv);
        movimentacaocaixa.addObject("totalpedido", totalpedido);


        return movimentacaocaixa;
    }

    // carrega a pagina de add forma
    @RequestMapping(value = "addformapagamento", method = RequestMethod.POST)
    public ModelAndView addFormaPagamento(HttpServletRequest request) {


        Long idf = Long.parseLong(request.getParameter("idpedidovenda"));
        ModelAndView addformapagamento = new ModelAndView("addformapagamento");

        PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);


        List<Produto> produtoList = produtopedidovendaDao.getAll();
        List<Item> itemList = itemDao.getAllItens(idf);
        List<Pagamento> pagamentoList = pagamentoDao.getAllPagamento(idf);


        addformapagamento.addObject("itemList", itemList);
        addformapagamento.addObject("produtoList", produtoList);
        addformapagamento.addObject("pagamentoList", pagamentoList);

        addformapagamento.addObject("pv", pv);


        return addformapagamento;
    }

    // salva  forma pagamento
    @RequestMapping(value = "AddPagamentoVenda", method = RequestMethod.POST)
    public ModelAndView SalvarFormaPagamento(HttpServletRequest request) {


        long idf = Long.parseLong(request.getParameter("idpedido"));
        ModelAndView addformapagamento = new ModelAndView("addformapagamento");

        PedidoVenda pv = pedidoVendaDao.PegarPorId(idf);

        Pagamento pg = new Pagamento();

        //convertendo as strings da view

//	    	String nome = Long.parseLong();
        int parcela = Integer.parseInt(request.getParameter("qtdparcela"));
//	    	long nome = Long.parseLong(request.getParameter(""));
//	    	long nome = Long.parseLong(request.getParameter(""));

        pg.setPedido(pv);
        pg.setNome(request.getParameter("nome"));
        pg.setNumero(request.getParameter("numero"));
        pg.setParcelas(parcela);
        pg.setTipo(request.getParameter("tipo"));
        ;


        pagamentoDao.add(pg);


        List<Produto> produtoList = produtopedidovendaDao.getAll();
        List<Item> itemList = itemDao.getAllItens(idf);
        List<Pagamento> pagamentoList = pagamentoDao.getAllPagamento(idf);


        addformapagamento.addObject("itemList", itemList);
        addformapagamento.addObject("produtoList", produtoList);
        addformapagamento.addObject("pagamentoList", pagamentoList);

        addformapagamento.addObject("pv", pv);


        return addformapagamento;
    }

    // salva  forma pagamento
    @RequestMapping(value = "finalizacaovenda", method = RequestMethod.POST)
    public ModelAndView FinalizarVenda(HttpServletRequest request) {


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
