package com.crm.earnify.entities.task;


import com.crm.earnify.entities.EarnifyPersistableEntity;

import javax.persistence.*;

/**
 * @author sandeepandey
 * @version 1.0
 * @see com.crm.earnify.entities.EarnifyBaseEntity
 * @see com.crm.earnify.entities.EarnifyPersistableEntity
 *
 */
@Entity
@Table(name = "executable_task_type_master",catalog = "earnifydb",uniqueConstraints = {@UniqueConstraint(
        columnNames = "executable_task_type_code")})
public class ExecutableTaskType extends EarnifyPersistableEntity<Long>{

    private Long id;
    private String taskTypeName;
    private String taskTypeCode;
    private String mappedTableName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "executable_task_type_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "executable_task_type_name")
    public String getTaskTypeName() {
        return taskTypeName;
    }

    public void setTaskTypeName(String taskTypeName) {
        this.taskTypeName = taskTypeName;
    }

    @Column(name = "executable_task_type_code",unique = true,nullable = false)
    public String getTaskTypeCode() {
        return taskTypeCode;
    }

    public void setTaskTypeCode(String taskTypeCode) {
        this.taskTypeCode = taskTypeCode;
    }

    @Column(name = "executable_task_type_mapped_table")
    public String getMappedTableName() {
        return mappedTableName;
    }

    public void setMappedTableName(String mappedTableName) {
        this.mappedTableName = mappedTableName;
    }

    @Override
    public Long fetchKey() {
        return getId();
    }
}
