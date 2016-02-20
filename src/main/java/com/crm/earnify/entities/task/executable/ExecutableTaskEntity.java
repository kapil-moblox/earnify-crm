/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.entities.task.executable;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.crm.earnify.entities.actiontype.ActionMasterEntity;
import com.crm.earnify.entities.task.CampaignTaskEntity;
import com.crm.earnify.entities.task.CampaignTaskType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.util.List;

/**
 *  @version     1.0, 19/2/16
 *  @author sandeepandey
 */

public class ExecutableTaskEntity extends EarnifyPersistableEntity<Long> {
    private static final Logger ELogger = LoggerFactory.getLogger(ExecutableTaskEntity.class);

    private Long                   id;
    private CampaignTaskEntity     parentTask;
    private List<CampaignTaskType> taskType;
    private List<ActionMasterEntity>      associatedAction;
    private DependentExecutableTaskEntity dependentExecutableTaskEntity;
    //----------------------------------------------------------------------------------------

    /**
     *
     * @return
     */
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id") public Long getId() {
        return id;
    }

    //-----------------------------------------------------------------------------------------
    public void setId(Long id) {
        this.id = id;
    }

    //-----------------------------------------------------------------------------------------
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY) public CampaignTaskEntity getParentTask() {
        return parentTask;
    }

    //------------------------------------------------------------------------------------------
    public void setParentTask(CampaignTaskEntity parentTask) {
        this.parentTask = parentTask;
    }

    //------------------------------------------------------------------------------------------
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    public List<CampaignTaskType> getTaskTypes() {
        return taskType;
    }

    //-----------------------------------------------------------------------------------------
    public void setTaskType(List<CampaignTaskType> taskTypes) {
        this.taskType = taskType;
    }

    //------------------------------------------------------------------------------------------
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public List<ActionMasterEntity> getAssociatedActions() {
        return associatedAction;
    }

    //-------------------------------------------------------------------------------------------
    public void setAssociatedAction(List<ActionMasterEntity> associatedActions) {
        this.associatedAction = associatedAction;
    }

    //----------------------------------------------------------------------------------------
    @Override
    public Long getID() {
        return null;
    }

    //--------------------------------------------------------------------------------------------
    @OneToOne(mappedBy = "executableTask",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    public DependentExecutableTaskEntity getDependentExecutableTaskEntity() {
        return dependentExecutableTaskEntity;
    }

    //---------------------------------------------------------------------------------------------------------
    public void setDependentExecutableTaskEntity(DependentExecutableTaskEntity dependentExecutableTaskEntity) {
        this.dependentExecutableTaskEntity = dependentExecutableTaskEntity;
    }
}
