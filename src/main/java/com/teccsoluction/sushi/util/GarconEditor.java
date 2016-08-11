//package com.teccsoluction.sushi.util;
//
//import com.teccsoluction.sushi.dao.GarconDAO;
//import com.teccsoluction.sushi.entidade.Garcon;
//
//import java.beans.PropertyEditorSupport;
//
//
//public class GarconEditor extends PropertyEditorSupport {
//
//    final GarconDAO garcondao;
//
//
//    public GarconEditor(final GarconDAO dao) {
//
//        this.garcondao = dao;
//
//    }
//
//    @Override
//    public void setAsText(final String id) {
//
//        final Garcon garcon = this.garcondao.PegarPorId(Long.parseLong(id));
//
//        this.setValue(garcon);
//
//    }
//}
