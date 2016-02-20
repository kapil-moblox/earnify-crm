/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.daos;

import java.io.Serializable;
import java.util.List;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */

public interface IGenericEarnifyDao<E ,K extends Serializable> {
    //------------------------------------------------------
    public void add(E p_entity_to_add) ;

    //------------------------------------------------------
    public void saveOrUpdate(E p_entity_save_or_update) ;

    //-------------------------------------------------------
    public void update(E p_entity_to_update);

    //-------------------------------------------------------
    public void remove(E p_entity_to_remove);

    //-------------------------------------------------------
    public E find(K p_key);

    //--------------------------------------------------------
    public List<E> getAll() ;
}
