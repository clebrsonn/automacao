package com.teccsoluction.sushi.framework;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


public abstract class AbstractController<Entity> {


    //    private final Class<Entity> entityClass;
    private final String entityAlias;

    private List<Entity> entityList;

    protected abstract AbstractEntityDao<Entity> getDao();


    public AbstractController(String entityAlias) {
//        this.entityClass = entityClass;
        this.entityAlias = entityAlias;
    }

    @RequestMapping(value = "cadastrocliente", method = RequestMethod.GET)
    public ModelAndView cadastroControler() {

        ModelAndView cadastro = new ModelAndView("cadastro" + entityAlias);

        return cadastro;
    }

    @RequestMapping(value = "/AddCliente", method = RequestMethod.POST)
    public ModelAndView AdicionarCliente(@ModelAttribute("Cliente") Entity entity) {

        ModelAndView cadastro_cliente = new ModelAndView("cadastro" + entityAlias);

        getDao().add(entity);
        System.out.println(entityAlias);
        return cadastro_cliente;
    }


    @RequestMapping(value = "/movimentacaocliente", method = RequestMethod.GET)
    public ModelAndView movimentacaoCliente() {

        ModelAndView movimentacao = new ModelAndView("movimentacao" + entityAlias);

        entityList = getDao().getAll();

        movimentacao.addObject(entityAlias + "List", entityList);

        return movimentacao;
    }


    @RequestMapping(value = "/edicaocliente", method = RequestMethod.GET)
    public ModelAndView editarClienteForm(HttpServletRequest request) {

        Entity entity;
        long idf = Long.parseLong(request.getParameter("id"));
        ModelAndView edicao = new ModelAndView("edicao" + entityAlias);
        entity = getDao().PegarPorId(idf);
        edicao.addObject(entityAlias, entity);


        return edicao;
    }


    @RequestMapping(value = "/movimentacaocliente/edicaocliente", method = RequestMethod.POST)
    public ModelAndView editarCliente(HttpServletRequest request, Entity entity) {


        Long idf = Long.parseLong(request.getParameter("id"));
        getDao().editar(entity);


        return new ModelAndView("redirect:/movimentacao" + entityAlias);
    }


    @RequestMapping(value = "/movimentacaocliente/delete", method = RequestMethod.GET)
    public ModelAndView delete(HttpServletRequest request) {


        long idf = Long.parseLong(request.getParameter("id"));
//		ModelAndView movimentacaocategoria = new ModelAndView("movimentacaocategoria");
        getDao().delete(idf);


        return new ModelAndView("redirect:/movimentacao" + entityAlias);
    }


}
