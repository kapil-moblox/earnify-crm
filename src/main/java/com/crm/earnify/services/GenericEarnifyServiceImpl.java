/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.services;

import com.crm.earnify.daos.IGenericEarnifyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Collection;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */
@Service("genericEarnifyServiceImpl")
public abstract class GenericEarnifyServiceImpl<E,K extends Serializable> implements GenericEarnifyService<E,K> {

    @Autowired
    private IGenericEarnifyDao<E,K> i_generic_dao;

    //-------------------------------------------------------------------------------------
    public GenericEarnifyServiceImpl(IGenericEarnifyDao<E,K> p_earnify_generic_dao) {
        this.i_generic_dao = p_earnify_generic_dao;
    }


    //-------------------------------------------------------------------------------------
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveOrUpdate(E p_entity_to_save_or_update) {
        this.i_generic_dao.saveOrUpdate(p_entity_to_save_or_update);
    }

    //-------------------------------------------------------------------------------------
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Collection<E> getAll() {
        return this.i_generic_dao.getAll();
    }

    //--------------------------------------------------------------------------------------
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public E getById(K p_key) {
        return this.i_generic_dao.find(p_key);
    }

    //--------------------------------------------------------------------------------------
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void update(E p_entity_to_update) {
        this.i_generic_dao.update(p_entity_to_update);
    }

    //-------------------------------------------------------------------------------------
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(E p_entity_to_save) {
        this.i_generic_dao.add(p_entity_to_save);
    }

    //--------------------------------------------------------------------------------------
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void remove(E p_entity_to_remove) {
        this.i_generic_dao.remove(p_entity_to_remove);
    }
}
