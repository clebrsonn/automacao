package com.teccsoluction.sushi.dao.generic;

import com.teccsoluction.sushi.entidade.Categoria;
import com.teccsoluction.sushi.framework.AbstractEntityDao;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class CategoriaDAO extends AbstractEntityDao<Categoria> {


    public CategoriaDAO() {
        super(Categoria.class, "Categoria");
    }

    @Override
    protected void appendPredicate(StringBuilder predicate) {

    }

    @Override
    protected void setParameters(TypedQuery<?> query) {

    }

    @Override
    protected void appendOrder(StringBuilder predicate) {

    }

    public List<Categoria> getAllCategoriaPai(long id) {
        List<Categoria> result = manager.createQuery("SELECT p FROM Categoria p where cat_pai="
                + id, Categoria.class).getResultList();
        return result;
    }

}
