/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/
package com.crm.earnify.entities.addunit;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.sun.istack.internal.logging.Logger;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author sandeepandey
 * @version 1.0, 14/2/16
 */
public class AddUnitMaster extends EarnifyPersistableEntity<Long> {
    private static final Logger ELogger = Logger.getLogger(AddUnitMaster.class);

    private Long id;

    private String addUnitType;

    private String desc;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "add_unit_type") public String getAddUnitType() {
        return addUnitType;
    }

    public void setAddUnitType(String addUnitType) {
        this.addUnitType = addUnitType;
    }

    @Column(name = "description") public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override public Long getID() {
        return getId();
    }

    @Override public void assignID() {

    }

    @Override public boolean isNew() {
        return true;
    }
}
