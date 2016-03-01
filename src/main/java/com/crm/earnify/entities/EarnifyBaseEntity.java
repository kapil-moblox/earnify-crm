package com.crm.earnify.entities;

import java.io.Serializable;

/**
 *
 * @param <K>
 * @author sandeepandey
 */
public interface EarnifyBaseEntity<K extends Serializable> {

    public K fetchKey();

    public void assignID();

    default boolean testNew() {
       return true;
    }
}
