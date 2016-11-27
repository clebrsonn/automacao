package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.FornecedorDAO;
import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.dao.generic.CategoriaDAO;
import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.entidade.Fornecedor;
import com.teccsoluction.sushi.entidade.Produto;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEditor;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import com.teccsoluction.sushi.util.UnidadeMedida;
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
@RequestMapping(value = "produto/")
public class ProdutoController extends AbstractController<Produto> {


    private final ProdutoDAO dao;
    private final FornecedorDAO fornecedorDao;
    private final CategoriaDAO categoriaDao;
    private List<Produto> produtoList;
    private List<Fornecedor> fornecedorList;
    private List<Categoria> categoriaList;


    @Autowired
    public ProdutoController(ProdutoDAO dao, CategoriaDAO categoriaDao, FornecedorDAO fornecedorDao) {
        super("produto");
        this.dao = dao;
        this.categoriaDao = categoriaDao;
        this.fornecedorDao = fornecedorDao;
    }

    @Override
    protected AbstractEntityDao<Produto> getDao() {
        return dao;
    }


    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

        binder.registerCustomEditor(Fornecedor.class, new AbstractEditor<Fornecedor>(this.fornecedorDao) {
        });
        binder.registerCustomEditor(Categoria.class, new AbstractEditor<Categoria>(this.categoriaDao) {
        });


    }

//
//    @RequestMapping(value = "cadastroproduto", method = RequestMethod.GET)
//    public ModelAndView cadastroProduto() {
//
//        ModelAndView cadastroproduto = new ModelAndView("cadastroproduto");
//
//        //carregando enum de unidade de medida
//        UnidadeMedida[] umList = UnidadeMedida.values();
//        //carregando lista com fornecedores do banco de dados
//        fornecedorList = fornecedorDao.getAll();
//
//        //carregando a lista de categorias
//        categoriaList = categoriaDao.getAll();
//
//        //inserindo a lista de enum para o jsp
//        cadastroproduto.addObject("umList", umList);
//        //inserindo a lista de fornecedores para o jsp
//        cadastroproduto.addObject("fornecedorList", fornecedorList);
//        //inserindo categorias para a jsp
//        cadastroproduto.addObject("categoriaList", categoriaList);
//
//
//        return cadastroproduto;
//    }

    @ModelAttribute
    public void addAttributes(Model model) {

        List<Categoria> categoriaList = categoriaDao.getAll();
        List<Fornecedor> fornecedorList = fornecedorDao.getAll();

        UnidadeMedida[] umList = UnidadeMedida.values();

        model.addAttribute("fornecedorList", fornecedorList);
        model.addAttribute("categoriaList", categoriaList);
        model.addAttribute("umList", umList);


    }


}
