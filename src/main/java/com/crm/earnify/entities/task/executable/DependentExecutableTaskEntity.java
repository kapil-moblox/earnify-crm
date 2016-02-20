/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.entities.task.executable;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

/**
 *  @version     1.0, 19/2/16
 *  @author sandeepandey
 */
 public class DependentExecutableTaskEntity extends EarnifyPersistableEntity<Long> {

    private static final Logger ELogger = LoggerFactory.getLogger(DependentExecutableTaskEntity.class);

    private Long id;
    private ExecutableTaskEntity executableTask;
    private ExecutableTaskEntity parentExecutableTask;

    //-------------------------------------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    //-------------------------------------------------------------------------------------------------
    public void setId(Long id) {
        this.id = id;
    }

    //-------------------------------------------------------------------------------------------------
    @OneToOne(fetch = FetchType.LAZY)
    public ExecutableTaskEntity getExecutableTask() {
        return executableTask;
    }


    //------------------------------------------------------------------------------------------------
    @OneToOne(fetch = FetchType.LAZY)
    public ExecutableTaskEntity getParentExecutableTask() {
        return parentExecutableTask;
    }
    //------------------------------------------------------------------------------------------------
    public void setParentExecutableTask(ExecutableTaskEntity parentExecutableTask) {
        this.parentExecutableTask = parentExecutableTask;
    }

    //--------------------------------------------------------------------------------------------------
    public void setExecutableTask(ExecutableTaskEntity executableTask) {
        this.executableTask = executableTask;
    }


    //-------------------------------------------------------------------------------------------------
    @Override
    public Long getID() {
        return null;
    }
}
