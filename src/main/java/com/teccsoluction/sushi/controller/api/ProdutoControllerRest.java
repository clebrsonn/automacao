package com.teccsoluction.sushi.controller.api;


import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.entidade.Produto;
import com.teccsoluction.sushi.framework.AbstractRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "produto")
public class ProdutoControllerRest extends AbstractRestController<Produto>{

    private
    final
    ProdutoDAO dao;

    @Autowired
    public ProdutoControllerRest(ProdutoDAO dao) {
        this.dao = dao;
    }


    protected ProdutoDAO getDao() {
        return dao;
    }

    @Override
    protected void validateSave(Produto produto) {

    }

    @Override
    protected void validateUpdate(Produto produto) {

    }

    @Override
    protected void validateDelete(Long id) {

    }

    @RequestMapping(value = "/categoria/{id}", method = RequestMethod.GET)
    public List<Produto> listarProdutoCategoria(@PathVariable long id) {
        return getDao().getAllProdutosCategoria(id);

    } 
    
//    @RequestMapping(value = "/categoria/{id}" ,method = RequestMethod.GET) 
//    public List<Produto> listarProdutoCategoria(@PathVariable long id) { 
//        return getDao().getAllProdutosCategoria(id); 
// 
//    }
    
//    @RequestMapping(value = "categoria/{id}" ,method = RequestMethod.GET)
//    public List<Produto> listarProdutoCategoria(@PathVariable long id) {
//        return getDao().getAllProdutosCategoria(id);
//
//    }


}
