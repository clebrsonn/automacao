package com.teccsoluction.sushi.framework;

import java.beans.PropertyEditorSupport;

/**
 * Created by clebr on 17/07/2016.
 */
public abstract class AbstractEditor<Entity> extends PropertyEditorSupport {

//    private final AbstractEntityDao<Entity> entityDao;
//
//    public AbstractEditor(AbstractEntityDao<Entity> entityDao) {
//        this.entityDao = entityDao;
//    }


    protected abstract AbstractEntityDao<Entity> getDao();


//    final CategoriaDAO categoriadao;


//    public CategoriaEditor(AbstractEntityDao<Entity> entityDao, final CategoriaDAO dao) {
//        this.entityDao = entityDao;
//
////        this.categoriadao =dao;
//
//    }

    @Override
    public void setAsText(final String id) {

        final Entity entity = getDao().PegarPorId(Long.parseLong(id));

        this.setValue(entity);

    }

}
