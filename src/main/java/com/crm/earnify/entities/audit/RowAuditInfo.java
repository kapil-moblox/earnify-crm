package com.crm.earnify.entities.audit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.util.Date;

/**
 *
 */
public class RowAuditInfo {

    private static final Logger ELogger = LoggerFactory.getLogger(RowAuditInfo.class);

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdOn",nullable = false)
    private Date createdOn;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updatedOn",nullable = false)
    private Date updatedOn;


    @PrePersist
    protected void onCreate() {
        createdOn = updatedOn = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedOn = new Date();
    }

}
