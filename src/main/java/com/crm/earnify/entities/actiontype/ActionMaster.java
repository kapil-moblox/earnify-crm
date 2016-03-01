/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.entities.actiontype;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.crm.earnify.entities.actiontype.param.ActionParamMaster;

import javax.persistence.*;
import java.util.Collection;

/**
 *  @version     1.0, 14/2/16
 *  @author sandeepandey
 */
@Entity
@Table(name = "action_master",catalog = "earnifydb")
public class ActionMaster extends EarnifyPersistableEntity<Long>{


    private Long id;

    private String actionName;

    private String actionClass;

    private Collection<ActionParamMaster> params;
    @Id
    @Column(name = "action_id")
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

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy="attachAction")
    public Collection<ActionParamMaster> getParams() {
        return params;
    }

    public void setParams(Collection<ActionParamMaster> params) {
        this.params = params;
    }

    @Override
    public Long fetchKey() {
        return getId();
    }
}
