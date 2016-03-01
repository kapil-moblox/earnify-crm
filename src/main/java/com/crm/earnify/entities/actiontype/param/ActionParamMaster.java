/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.entities.actiontype.param;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.crm.earnify.entities.actiontype.ActionMaster;

import javax.persistence.*;

/**
 *  @version     1.0, 28/2/16
 *  @author sandeepandey
 */
@Entity
@Table(name = "action_param_master")
public class ActionParamMaster extends EarnifyPersistableEntity<Long> {

    private Long id;
    private String paramKey;
    private String paramValue;

    private ActionMaster attachAction;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "action_param_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "action_param_key",nullable = false)
    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    @Column(name = "action_param_value",nullable = false)
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    @Override
    public Long fetchKey() {
        return getId();
    }

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "action_id")
    public ActionMaster getAttachAction() {
        return attachAction;
    }

    public void setAttachAction(ActionMaster attachAction) {
        this.attachAction = attachAction;
    }
}
