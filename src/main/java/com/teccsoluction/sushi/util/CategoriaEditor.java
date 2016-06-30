package com.teccsoluction.sushi.util;

import com.teccsoluction.sushi.dao.CategoriaDAO;
import com.teccsoluction.sushi.entidade.Categoria;

import java.beans.PropertyEditorSupport;



public class CategoriaEditor extends PropertyEditorSupport {

	 final CategoriaDAO categoriadao;
	
	
	public CategoriaEditor(final CategoriaDAO dao) {

	this.categoriadao =dao;
	
	}
	
	@Override
    public void setAsText(final String id) {
 
        final Categoria categoria = this.categoriadao.PegarPorId(Long.parseLong(id));
 
        this.setValue(categoria);

}
}
