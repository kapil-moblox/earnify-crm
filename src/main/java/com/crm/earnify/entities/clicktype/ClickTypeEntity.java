/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.entities.clicktype;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *  @version     1.0, 14/2/16
 *  @author sandeepandey
 */
 public class ClickTypeEntity extends EarnifyPersistableEntity<Long> {
    private static final Logger ELogger = LoggerFactory.getLogger(ClickTypeEntity.class);

    private Long id;

    private String name;

    private String desc;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public Long getID() {
        return getId();
    }
}
