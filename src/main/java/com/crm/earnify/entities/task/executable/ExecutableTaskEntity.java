/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/
package com.crm.earnify.entities.task.executable;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.crm.earnify.entities.actiontype.ActionMaster;
import com.crm.earnify.entities.task.CampaignTaskEntity;
import com.crm.earnify.entities.task.ExecutableTaskType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

/**
 * @author sandeepandey
 * @version 1.0, 19/2/16
 */

@Entity
@Table(name = "executable_task_master")
public class ExecutableTaskEntity extends EarnifyPersistableEntity<Long> {
    private static final Logger ELogger = LoggerFactory.getLogger(ExecutableTaskEntity.class);

    private Long id;
    private CampaignTaskEntity fromCampaignTask;
    private ExecutableTaskType attachExecutableTaskType;
    private ActionMaster attachAction;
    private ExecutableTaskEntity parent;
    //----------------------------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "executable_task_id")
    public Long getId() {
        return id;
    }

    //-----------------------------------------------------------------------------------------
    public void setId(Long id) {
        this.id = id;
    }
    //-----------------------------------------------------------------------------------------
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "campaign_task_id")
    public CampaignTaskEntity getFromCampaignTask() {
        return fromCampaignTask;
    }

    //------------------------------------------------------------------------------------------
    public void setFromCampaignTask(CampaignTaskEntity fromCampaignTask) {
        this.fromCampaignTask = fromCampaignTask;
    }


    //----------------------------------------------------------------------------------------
    @Override
    public Long fetchKey() {
        return getId();
    }

    //------------------------------------------------------------------------------------------------------------------
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public ExecutableTaskType getAttachExecutableTaskType() {
        return attachExecutableTaskType;
    }

    public void setAttachExecutableTaskType(ExecutableTaskType attachExecutableTaskType) {
        this.attachExecutableTaskType = attachExecutableTaskType;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public ActionMaster getAttachAction() {
        return attachAction;
    }

    public void setAttachAction(ActionMaster attachAction) {
        this.attachAction = attachAction;
    }
    @OneToOne
    public ExecutableTaskEntity getParent() {
        return parent;
    }

    public void setParent(ExecutableTaskEntity parent) {
        this.parent = parent;
    }
}
