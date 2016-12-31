package com.teccsoluction.sushi.controller.api;


import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.dao.generic.PromocaoDAO;
import com.teccsoluction.sushi.entidade.Produto;
import com.teccsoluction.sushi.entidade.Promocao;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "promocao")
public class PromocaoControllerRest {

    private
    final
    PromocaoDAO dao;

    @Autowired
    public PromocaoControllerRest(PromocaoDAO dao) {
        this.dao = dao;
    }


    protected AbstractEntityDao<Promocao> getDao() {
        return dao;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Promocao> buscarEntity(@PathVariable long id) {
    	Promocao promocao = getDao().PegarPorId(id);
        if (promocao == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(promocao, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity AdicionarEntity(Promocao entity) {

        try {
            getDao().add(entity);
            return new ResponseEntity<>(entity, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Promocao> listarEntity() {
        return getDao().getAll();

    }   
    
//    @RequestMapping(value = "/categoria/{id}" ,method = RequestMethod.GET) 
//    public List<Produto> listarProdutoCategoria(@PathVariable long id) { 
//        return getDao().getAllProdutosCategoria(id); 
// 
//    }
    
    

}
