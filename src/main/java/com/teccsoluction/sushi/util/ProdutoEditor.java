package com.teccsoluction.sushi.util;

import com.teccsoluction.sushi.dao.CategoriaDAO;
import com.teccsoluction.sushi.dao.ProdutoDAO;
import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.entidade.Produto;

import java.beans.PropertyEditorSupport;



public class ProdutoEditor extends PropertyEditorSupport {

	 final ProdutoDAO produtodao;
	
	
	public ProdutoEditor(final ProdutoDAO dao) {

	this.produtodao =dao;
	
	}
	
	@Override
    public void setAsText(final String id) {
 
        final Produto produto = this.produtodao.PegarPorId(Long.parseLong(id));
 
        this.setValue(produto);

}
}
