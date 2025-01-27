package com.teccsoluction.sushi.framework;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public abstract class AbstractController<Entity> {


    private final String entityAlias;

    protected abstract AbstractEntityDao<Entity> getDao();


    public AbstractController(String entityAlias) {
        this.entityAlias = entityAlias;
    }

    @RequestMapping(value = "cadastro", method = RequestMethod.GET)
    public ModelAndView cadastrarEntity() {
    	
    	ModelAndView cadastro = new ModelAndView("cadastro" + entityAlias);
//        cadastro.addObject("acao", "add");

    	 List<Entity> entityList = getDao().getAll();
//    	 
//    	 cadastro.addObject("entityList", entityList);
    	 
    	 return cadastro;

//        return new ModelAndView("cadastro" + entityAlias);
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String AdicionarEntity(@ModelAttribute Entity entity) {

//        ModelAndView cadastroEntity = new ModelAndView("cadastro" + entityAlias);

        getDao().add(entity);
//        getDao().PegarPorId(entity);
        
//        cadastroEntity.addObject("entity", entity);
        
        System.out.println(entityAlias);
        return "redirect:cadastro";//cadastroEntity;
       
//        return new ModelAndView("redirect:/" + entityAlias + "/cadastro");
    }


    @RequestMapping(value = "movimentacao", method = RequestMethod.GET)
    public ModelAndView movimentacaoEntity() {

        ModelAndView movimentacao = new ModelAndView("movimentacao" + entityAlias);

        List<Entity> entityList = getDao().getAll();

        movimentacao.addObject(entityAlias + "List", entityList);

        return movimentacao;
    }


    @RequestMapping(value = "edicao", method = RequestMethod.GET)
    public ModelAndView editarEntityForm(HttpServletRequest request) {

        Entity entity;
        long idf = Long.parseLong(request.getParameter("id"));
        ModelAndView edicao = new ModelAndView("edicao" + entityAlias);
        entity = getDao().PegarPorId(idf);
        edicao.addObject(entityAlias, entity);
        edicao.addObject("acao", "edicao");



        return edicao;
    }


    @RequestMapping(value = "edicao", method = RequestMethod.POST)
    public ModelAndView editarEntity(HttpServletRequest request, Entity entity) {


        Long idf = Long.parseLong(request.getParameter("id"));
        getDao().editar(entity);

        

        return new ModelAndView("redirect:/" + entityAlias + "/"+"movimentacao");
    }


    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public ModelAndView deletarEntity(HttpServletRequest request) {


        long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView movimentacaocategoria = new ModelAndView("movimentacaocategoria");
        getDao().delete(idf);


        return new ModelAndView("redirect:/" + entityAlias + "/movimentacao");
    }




}
