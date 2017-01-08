package com.teccsoluction.sushi.controller.api;


import com.teccsoluction.sushi.dao.generic.PromocaoDAO;
import com.teccsoluction.sushi.entidade.Promocao;
import com.teccsoluction.sushi.framework.AbstractRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "promocao")
public class PromocaoControllerRest extends AbstractRestController<Promocao>{

    private
    final
    PromocaoDAO dao;

    @Autowired
    public PromocaoControllerRest(PromocaoDAO dao) {
        this.dao = dao;
    }


    protected PromocaoDAO getDao() {
        return dao;
    }

    @Override
    protected void validateSave(Promocao promocao) {

    }

    @Override
    protected void validateUpdate(Promocao promocao) {

    }

    @Override
    protected void validateDelete(Long id) {

    }


//    @RequestMapping(value = "/categoria/{id}" ,method = RequestMethod.GET) 
//    public List<Produto> listarProdutoCategoria(@PathVariable long id) { 
//        return getDao().getAllProdutosCategoria(id); 
// 
//    }
    
    

}
