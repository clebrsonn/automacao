package com.teccsoluction.sushi.framework;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by clebr on 04/07/2016.
 */
@Component
public abstract class AbstractEntityDao<Entity> {
    protected
    @PersistenceContext
    EntityManager manager;

    private Class<Entity> entityClass;
    private String entityAlias;

    public AbstractEntityDao(Class<Entity> entityClass, String entityAlias) {
        this.entityClass = entityClass;
        this.entityAlias = entityAlias;
    }

    public List<Entity> getAll() {
        List<Entity> result = manager.createQuery("SELECT p FROM " + entityAlias + " p", entityClass).getResultList();
        return result;
    }

    @Transactional
    public void add(Entity entity) {
        manager.persist(entity);
    }

//    public int searchEntityCount() {
//        StringBuilder predicate = new StringBuilder("1 = 1");
//        appendPredicate(predicate, options);
//        String jpql = "select count(" + entityAlias + ") from " + entityClass.getName() + " " + entityAlias + " where " + predicate;
//        TypedQuery<Long> query = manager.createQuery(jpql, Long.class);
//        setParameters(options, query);
//        Long result = query.getSingleResult();
//        return result.intValue();
//    }

    protected abstract void appendPredicate(StringBuilder predicate);

    protected abstract void setParameters(TypedQuery<?> query);

//    public List<Entity> searchEntity(EntitySearchOptions options) {
//        StringBuilder predicate = new StringBuilder("1 = 1");
//        appendPredicate(predicate, options);
//        appendOrder(predicate, options);
//        String jpql = "select " + entityAlias + " from " + entityClass.getName() + " " + entityAlias + " where " + predicate;
//        TypedQuery<Entity> query = manager.createQuery(jpql, entityClass);
//        setParameters(options, query);
//        if (options.getStartPosition() != null) {
//            query.setFirstResult(options.getStartPosition());
//        }
//        if (options.getMaxResults() != null) {
//            query.setMaxResults(options.getMaxResults());
//        }
//        List<Entity> result = query.getResultList();
//        return result;
//    }

    protected abstract void appendOrder(StringBuilder predicate);

    @Transactional
    public void editar(Entity entity) {
        manager.merge(entity);
    }

    @Transactional
    public void delete(long id) {
//        Object id = manager.getEntityManagerFactory().getPersistenceUnitUtil().getIdentifier(entity);
//        Entity managedEntity = manager.find(entityClass, id);
        Entity managedEntity = manager.getReference(entityClass, id);
        manager.remove(managedEntity);
    }

    @Transactional
    public Entity PegarPorId(long entityId) {
        return manager.find(entityClass, entityId);
    }


}