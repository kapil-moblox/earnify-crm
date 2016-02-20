/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */
@Repository
public abstract class GenericEarnifyDaoImpl<E,K extends Serializable> implements IGenericEarnifyDao<E,K> {


    @Autowired
    private SessionFactory sessionFactory;

    protected Class<? extends E> daoType;

    //------------------------------------------------------------------------------
    /**
     * By defining this class as abstract, we prevent Spring from creating
     * instance of this class If not defined as abstract,
     * getClass().getGenericSuperClass() would return Object. There would be
     * exception because Object class does not have constructor with parameters.
     */
    public GenericEarnifyDaoImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        daoType = (Class) pt.getActualTypeArguments()[0];
    }

    //------------------------------------------------------------------------------
    protected Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    //-------------------------------------------------------------------------------
    @Override
    public void add(E p_entity_to_add) {
        currentSession().save(p_entity_to_add);
    }

    //-------------------------------------------------------------------------------
    @Override
    public void saveOrUpdate(E p_entity_save_or_update) {
        currentSession().saveOrUpdate(p_entity_save_or_update);
    }

    //-------------------------------------------------------------------------------
    @Override
    public void update(E p_entity_to_update) {
        currentSession().saveOrUpdate(p_entity_to_update);
    }

    //-------------------------------------------------------------------------------
    @Override
    public void remove(E p_entity_to_remove) {
        currentSession().delete(p_entity_to_remove);
    }

    //-------------------------------------------------------------------------------
    @Override
    public E find(K key) {
        return (E) currentSession().get(daoType, key);
    }

    //--------------------------------------------------------------------------------
    @Override
    public List<E> getAll() {
        return currentSession().createCriteria(daoType).list();
    }
}
