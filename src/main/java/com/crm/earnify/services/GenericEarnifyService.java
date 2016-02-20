/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.services;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */

public interface GenericEarnifyService<E,K extends Serializable> {
    //-------------------------------------------------------------

    /**
     *
     * @param p_entity_to_save_or_update
     */
    public void saveOrUpdate(E p_entity_to_save_or_update);


    //-------------------------------------------------------------
    public Collection<E> getAll();

    //-------------------------------------------------------------

    /**
     *
     * @param p_key
     * @return
     */
    public E getById(K p_key);

    //-------------------------------------------------------------

    /**
     *
     * @param p_entity_to_update
     */
    public void update(E p_entity_to_update);

    //-------------------------------------------------------------

    /**
     *
     * @param p_entity_to_save
     */
    public void save(E p_entity_to_save);

    //-------------------------------------------------------------

    default void multipleSaveOrUpdate(Collection<E> p_entities_to_save_or_update) {
        abstractAction(p_entities_to_save_or_update,i -> saveOrUpdate(i));
    }

    //-----------------------------------------------------------------------------------------------------
    public void remove(E p_entity_to_remove);

    //----------------------------------------------------------------------------------------------------
    default void multipleUpdates(Collection<E> p_entities_to_update) {
        abstractAction(p_entities_to_update,i -> update(i));
    }

    //----------------------------------------------------------------------------------------------------
    default void multipleSave(Collection<E> p_entities_to_save) {
        abstractAction(p_entities_to_save,i -> save(i));
    }

    //---------------------------------------------------------------------------------------------------
    default void abstractAction(Collection<E> p_candidates,Consumer<E> p_action) {
        p_candidates.stream().filter(Objects::nonNull).map(i -> p_action);
    }
    /**
     *
     * @param p_ids
     * @return
     */
    default Collection<E> getByIds(Collection<K> p_ids) {
        return p_ids.stream().filter(Objects::nonNull).map(i -> getById(i)).collect(Collectors.toList());
    }
}
