package com.teccsoluction.sushi.controller.aplicacao;

import com.teccsoluction.sushi.dao.EmpresaDAO;
import com.teccsoluction.sushi.entidade.Empresa;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by clebr on 01/09/2016.
 */
@ControllerAdvice
public class ContextoAplicacao {

    private
    final
    AbstractEntityDao<Empresa> empresaDao;

    @Autowired
    public ContextoAplicacao(EmpresaDAO empresaDao) {

        this.empresaDao = empresaDao;
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        Empresa empresaAtt = empresaDao.PegarPorId(1);
        model.addAttribute("empresaAtt", empresaAtt);
    }

}
