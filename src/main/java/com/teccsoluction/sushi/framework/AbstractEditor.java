package com.teccsoluction.sushi.framework;

import java.beans.PropertyEditorSupport;

/**
 * Created by clebr on 17/07/2016.
 */
public abstract class AbstractEditor<Entity> extends PropertyEditorSupport {

    private final AbstractEntityDao<Entity> dao;

    public AbstractEditor(final AbstractEntityDao<Entity> dao) {
        this.dao = dao;
    }

    @Override
    public void setAsText(final String id) {

        final Entity entity = dao.PegarPorId(Long.parseLong(id));

        this.setValue(entity);

    }

}
