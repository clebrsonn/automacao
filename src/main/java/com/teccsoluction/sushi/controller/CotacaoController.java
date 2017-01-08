package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.FornecedorDAO;
import com.teccsoluction.sushi.dao.CotacaoDAO;
import com.teccsoluction.sushi.entidade.Cotacao;
import com.teccsoluction.sushi.entidade.Fornecedor;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEditor;
import com.teccsoluction.sushi.util.StatusPedido;
import com.teccsoluction.sushi.util.TipoPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping(value = "cotacao/")
public class CotacaoController extends AbstractController<Cotacao> {


    private
    final
    CotacaoDAO cotacaoDao;


    private
    final
    FornecedorDAO fornecedorDao;
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
    public CotacaoController(CotacaoDAO dao, FornecedorDAO daofornecedor) {

        super("cotacao");

        this.cotacaoDao = dao;
        this.fornecedorDao = daofornecedor;

    }


    @Override
    protected CotacaoDAO getDao() {
        // TODO Auto-generated method stub
        return cotacaoDao;
    }


    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

        binder.registerCustomEditor(Fornecedor.class, new AbstractEditor<Fornecedor>(this.fornecedorDao) {
        });

//        binder.registerCustomEditor(Garcon.class, new AbstractEditor<Garcon>(this.garconDao) {
//        });


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


}
