/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.entities.actiontype;

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

public class ActionMasterEntity extends EarnifyPersistableEntity<Long>{
    private static final Logger LOG = LoggerFactory.getLogger(ActionMasterEntity.class);


    private Long id;

    private String actionName;

    private String actionClass;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "action_name")
    public String getActionName() {
        return actionName;
    }


    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    @Column(name = "action_class")
    public String getActionClass() {
        return actionClass;
    }

    public void setActionClass(String actionClass) {
        this.actionClass = actionClass;
    }

    @Override
    public Long getID() {
        return getId();
    }
}
