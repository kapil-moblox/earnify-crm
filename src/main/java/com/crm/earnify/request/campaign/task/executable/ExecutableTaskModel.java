/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.request.campaign.task.executable;

import com.crm.earnify.base.json.JSONizable;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 *  @version     1.0, 29/2/16
 *  @author sandeepandey
 */
public class ExecutableTaskModel implements JSONizable {


    private Long actionId;
    private String executableTaskCode;
    private Long selfId;
    private Long parentId;

    public Long getActionId() {
        return actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    public String getExecutableTaskCode() {
        return executableTaskCode;
    }

    public void setExecutableTaskCode(String executableTaskCode) {
        this.executableTaskCode = executableTaskCode;
    }

    public Long getSelfId() {
        return selfId;
    }

    public void setSelfId(Long selfId) {
        this.selfId = selfId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toJSONString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String();
    }
}
