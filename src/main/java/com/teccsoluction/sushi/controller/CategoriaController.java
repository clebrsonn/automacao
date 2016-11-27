package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.generic.CategoriaDAO;
import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEditor;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
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
@RequestMapping(value = "categoria")
public class CategoriaController extends AbstractController<Categoria> {

    private
    final
    AbstractEntityDao<Categoria> dao;


    @Autowired
    public CategoriaController(CategoriaDAO dao) {
        super("categoria");
        this.dao = dao;
    }

    @Override
    protected AbstractEntityDao<Categoria> getDao() {
        return dao;
    }


    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

        binder.registerCustomEditor(Categoria.class, new AbstractEditor<Categoria>(getDao()) {

        });


    }

    @ModelAttribute
    public void addAttributes(Model model) {

        List<Categoria> categoriaList = getDao().getAll();
        model.addAttribute("categoriaList", categoriaList);
    }


//    @Override
//    @RequestMapping(value = "cadastro", method = RequestMethod.GET)
//    public ModelAndView cadastrarEntity() {
//
//        ModelAndView cadastrocategoria = new ModelAndView("cadastrocategoria");
//
//        List<Categoria> categoriaList = getDao().getAll();
//
//        cadastrocategoria.addObject("categoriaList", categoriaList);
//
//
//        return cadastrocategoria;
//    }
}

