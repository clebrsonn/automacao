package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.DevolucaoDAO;
import com.teccsoluction.sushi.entidade.Devolucao;
import com.teccsoluction.sushi.framework.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "devolucao/")
public class DevolucaoController extends AbstractController<Devolucao> {


    private
    final
    DevolucaoDAO dao;


    public DevolucaoController(DevolucaoDAO dao) {

        super("devolucao");
        this.dao = dao;

    }


    @Override
    protected DevolucaoDAO getDao() {
        // TODO Auto-generated method stub
        return dao;
    }


//  @RequestMapping(value = "devolucaocompra/cadastro", method = RequestMethod.GET)
//  public ModelAndView cadastrarEntity() {
//
//      ModelAndView cadastrocategoria = new ModelAndView("cadastrocategoria");
//
////      List<Categoria> categoriaList = getDao().getAll();
////
////      cadastrocategoria.addObject("categoriaList", categoriaList);
//
//
//      return cadastrocategoria;
//  }

}
