package com.teccsoluction.sushi.util;

import com.teccsoluction.sushi.dao.SubCategoriaDAO;

import com.teccsoluction.sushi.entidade.SubCategoria;

import java.beans.PropertyEditorSupport;


public class SubCategoriaEditor extends PropertyEditorSupport {

	 final SubCategoriaDAO subcategoriadao;


	public SubCategoriaEditor(final SubCategoriaDAO dao) {

	this.subcategoriadao =dao;
	
	}
	
	@Override
    public void setAsText(final String id) {
 
        final SubCategoria subcategoria = this.subcategoriadao.PegarPorId(Long.parseLong(id));
 
        this.setValue(subcategoria);

}
}
