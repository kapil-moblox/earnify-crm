/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.entities.task.executable.install;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.crm.earnify.entities.task.executable.ExecutableTaskEntity;

import javax.persistence.*;

/**
 *  @version     1.0, 19/2/16
 *  @author sandeepandey
 */
@Entity
@Table(name = "install_executable_tasks")
 public class InstallExecutableTaskEntity extends EarnifyPersistableEntity<Long> {


    private Long id;
    private ExecutableTaskEntity executableTask;
    private String status;

    public InstallExecutableTaskEntity() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY)
    public ExecutableTaskEntity getExecutableTask() {
        return executableTask;
    }

    public void setExecutableTask(ExecutableTaskEntity executableTask) {
        this.executableTask = executableTask;
    }

    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public Long fetchKey() {
        return getId();
    }
}
