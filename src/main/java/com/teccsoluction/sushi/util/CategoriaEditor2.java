package com.teccsoluction.sushi.util;

import com.teccsoluction.sushi.dao.CategoriaDAO;
import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.framework.AbstractEditor;
import com.teccsoluction.sushi.framework.AbstractEntityDao;


public class CategoriaEditor2 extends AbstractEditor<Categoria> {

//
//    public CategoriaEditor2() {
//        super(AbstractEntityDao<Categoria>);
//    }

//	 final CategoriaDAO categoriadao;



	public CategoriaEditor2(final CategoriaDAO dao) {

	this.categoriadao =dao;

	}

    private CategoriaDAO categoriadao;

    @Override
    protected AbstractEntityDao<Categoria> getDao() {
        return categoriadao;
    }
//
//    @Override
//    public void setAsText(final String id) {
//
//        final Categoria categoria = this.categoriadao.PegarPorId(Long.parseLong(id));
//
//        this.setValue(categoria);
//
//}
}
