package com.teccsoluction.sushi.controller;

import com.teccsoluction.sushi.dao.MesaDAO;
import com.teccsoluction.sushi.dao.ReservaDAO;
import com.teccsoluction.sushi.entidade.Mesa;
import com.teccsoluction.sushi.entidade.Reserva;
import com.teccsoluction.sushi.framework.AbstractController;
import com.teccsoluction.sushi.framework.AbstractEditor;
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
@RequestMapping(value = "reserva/")
public class ReservaController extends AbstractController<Reserva> {

    private
    final
    ReservaDAO reservaDao;

    private
    final
    MesaDAO mesaDao;

    @Autowired
    public ReservaController(ReservaDAO dao, MesaDAO daomesa) {

        super("reserva");
        this.reservaDao = dao;
        this.mesaDao = daomesa;
    }


    @Override
    protected ReservaDAO getDao() {
        // TODO Auto-generated method stub
        return reservaDao;
    }


    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {

        binder.registerCustomEditor(Mesa.class, new AbstractEditor<Mesa>(this.mesaDao) {
        });

//      binder.registerCustomEditor(Cliente.class, new AbstractEditor<Cliente>(this.clienteDao) {
//      });


    }

    @ModelAttribute
    public void addAttributes(Model model) {
//
        List<Mesa> mesaList = mesaDao.getAll();

        model.addAttribute("mesaList", mesaList);


    }

}
