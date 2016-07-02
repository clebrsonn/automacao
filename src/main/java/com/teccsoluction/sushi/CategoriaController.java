package com.teccsoluction.sushi;

import com.teccsoluction.sushi.dao.CategoriaDAO;
import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.util.CategoriaEditor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CategoriaController {


    @Autowired
    private CategoriaDAO categoriaDao;

    private List<Categoria> categoriaList;




    @InitBinder
    protected void initBinder(HttpServletRequest request,  ServletRequestDataBinder binder) {

        binder.registerCustomEditor(Categoria.class, new CategoriaEditor(this.categoriaDao));


    }


    @RequestMapping(value = "/cadastrocategoria", method = RequestMethod.GET)
    public ModelAndView cadastrocategoria() {

        ModelAndView cadastrocategoria = new ModelAndView("cadastrocategoria");

        categoriaList = categoriaDao.getAll();

        cadastrocategoria.addObject("categoriaList", categoriaList);


        return cadastrocategoria;
    }

    @RequestMapping(value = "/AddCategoria", method = RequestMethod.POST)
    public ModelAndView AdicionarCategoria(@ModelAttribute("Categoria") Categoria categoria,HttpServletRequest request) {

	
//    	
//    	long id - Long.parseLong(request.getParameter("ca"));
    		
        ModelAndView cadastrocategoria = new ModelAndView("cadastrocategoria");
        
//        categoria.setCatpai(categoria.getCatpai());
        
        categoriaDao.add(categoria);       
        
        
        categoriaList = categoriaDao.getAll();
        cadastrocategoria.addObject("categoriaList", categoriaList);



        return cadastrocategoria;
    }


    @RequestMapping(value = "/movimentacaocategoria", method = RequestMethod.GET)
    public ModelAndView movimentacaoCategoria() {

        ModelAndView movimentacaocategoria = new ModelAndView("movimentacaocategoria");

        categoriaList = categoriaDao.getAll();
        movimentacaocategoria.addObject("categoriaList", categoriaList);


        return movimentacaocategoria;
    }

    @RequestMapping(value = "edicaocategoria", method = RequestMethod.GET)
    public ModelAndView editarCategoriaForm(HttpServletRequest request) {

        Categoria categoria;
        long idf = Long.parseLong(request.getParameter("id"));
        ModelAndView edicaocategoria = new ModelAndView("edicaocategoria");
        categoria = categoriaDao.PegarPorId(idf);
        categoriaList =categoriaDao.getAll();
        edicaocategoria.addObject("categoria", categoria);
        edicaocategoria.addObject("categoriaList", categoriaList);


        return edicaocategoria;
    }


    @RequestMapping(value = "/movimentacaocategoria/editarCategoria", method = RequestMethod.GET)
    public ModelAndView editarCategoria(HttpServletRequest request, Categoria categoria) {


        long idf = Long.parseLong(request.getParameter("id"));
        

        categoriaDao.editar(idf, categoria);


        return new ModelAndView("redirect:/movimentacaocategoria");
    }


    @RequestMapping(value = "/movimentacaocategoria/delete", method = RequestMethod.GET)
    public ModelAndView deleteCategoria(HttpServletRequest request) {


        long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView movimentacaocategoria = new ModelAndView("movimentacaocategoria");
        categoriaDao.delete(idf);


        return new ModelAndView("redirect:/movimentacaocategoria");
    }
    
    
    

}
