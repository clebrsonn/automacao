package com.teccsoluction.sushi.controller.api;

import com.teccsoluction.sushi.dao.generic.CategoriaDAO;
import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.framework.AbstractRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "categoria")
public class CategoriaControllerRest extends AbstractRestController<Categoria> {

    private
    final
    CategoriaDAO dao;

    @Autowired
    public CategoriaControllerRest(CategoriaDAO dao) {
        this.dao = dao;
    }

    protected CategoriaDAO getDao() {
        return dao;
    }

    @Override
    protected void validateSave(Categoria categoria) {

    }

    @Override
    protected void validateUpdate(Categoria categoria) {

    }

    @Override
    protected void validateDelete(Long id) {

    }


//
//    @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity AdicionarEntity(Categoria entity) {
//
//        try {
//            getDao().add(entity);
//            return new ResponseEntity<>(entity, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(e, HttpStatus.SERVICE_UNAVAILABLE);
//        }
//    }

    //Corrigir ao adicionar searchOptions
    @RequestMapping(value = "/pai/{id}", method = RequestMethod.GET)
    public List<Categoria> listarCategoriaPai(@PathVariable long id) {
        return getDao().getAllCategoriaPai(id);

    }

}
