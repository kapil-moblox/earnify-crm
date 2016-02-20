/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.request.task.executable;

import java.io.Serializable;

/**
 *  @version     1.0, 19/2/16
 *  @author sandeepandey
 */

public class ExecutableTaskRequest implements Serializable {

    private Long selfId;
    private Long parentId;
    private Long taskTypeId;
    private Long actionId;


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

    public Long getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(Long taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public Long getActionId() {
        return actionId;
    }

    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    @Override
    public String toString() {
        return "ExecutableTaskRequest{" +
                "selfId=" + selfId +
                ", parentId=" + parentId +
                ", taskTypeId=" + taskTypeId +
                ", actionId=" + actionId +
                '}';
    }
}
