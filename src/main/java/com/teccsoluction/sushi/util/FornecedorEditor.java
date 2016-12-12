package com.teccsoluction.sushi.util;

import com.teccsoluction.sushi.dao.FornecedorDAO;
import com.teccsoluction.sushi.entidade.Fornecedor;

import java.beans.PropertyEditorSupport;


public class FornecedorEditor extends PropertyEditorSupport {

    final FornecedorDAO fornecedordao;


    public FornecedorEditor(final FornecedorDAO dao) {

        this.fornecedordao = dao;

    }

    @Override
    public void setAsText(final String id) {

        final Fornecedor fornecedor = this.fornecedordao.PegarPorId(Long.parseLong(id));

        this.setValue(fornecedor);

    }
}
