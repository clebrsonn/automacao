package com.teccsoluction.sushi.util;

import com.teccsoluction.sushi.dao.CategoriaDAO;
import com.teccsoluction.sushi.dao.MesaDAO;
import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.entidade.Mesa;

import java.beans.PropertyEditorSupport;



public class MesaEditor extends PropertyEditorSupport {

	 final MesaDAO mesadao;
	
	
	public MesaEditor(final MesaDAO dao) {

	this.mesadao =dao;
	
	}
	
	@Override
    public void setAsText(final String id) {
 
        final Mesa mesa = this.mesadao.PegarPorId(Long.parseLong(id));
 
        this.setValue(mesa);

}
}
