/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.entities.task.executable.install;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.crm.earnify.entities.task.executable.ExecutableTaskEntity;
import com.crm.earnify.enums.ExecutableTaskStatusEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

/**
 *  @version     1.0, 19/2/16
 *  @author sandeepandey
 */
@Entity
@Table(name = "someValue")
 public class InstallExecutableTaskEntity extends EarnifyPersistableEntity<Long> {

    private static final Logger LOG = LoggerFactory.getLogger(InstallExecutableTaskEntity.class);


    private Long id;
    private ExecutableTaskEntity executableTask;
    private ExecutableTaskStatusEnum status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public ExecutableTaskEntity getExecutableTask() {
        return executableTask;
    }

    public void setExecutableTask(ExecutableTaskEntity executableTask) {
        this.executableTask = executableTask;
    }

    public ExecutableTaskStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ExecutableTaskStatusEnum status) {
        this.status = status;
    }

    @Override
    public Long getID() {
        return null;
    }
}
