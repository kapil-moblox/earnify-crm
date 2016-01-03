package com.crm.earnify.entities;

import java.io.Serializable;

/**
 *
 * @param <K>
 * @author sandeepandey
 */
public interface EarnifyBaseEntity<K extends Serializable> {

    public K getID();

    public void assignID();

    public boolean isNew() ;
}
