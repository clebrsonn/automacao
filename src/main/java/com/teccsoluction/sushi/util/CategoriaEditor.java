package com.teccsoluction.sushi.util;


import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.framework.AbstractEntityDao;

import java.beans.PropertyEditorSupport;


public class CategoriaEditor extends PropertyEditorSupport {

    final AbstractEntityDao<Categoria> categoriadao;


    public CategoriaEditor(final AbstractEntityDao<Categoria> dao) {

        this.categoriadao = dao;

    }

    @Override
    public void setAsText(final String id) {

        final Categoria categoria = this.categoriadao.PegarPorId(Long.parseLong(id));

        this.setValue(categoria);

    }
}
