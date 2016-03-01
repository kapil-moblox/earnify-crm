package com.crm.earnify.entities.audit;

import javax.persistence.*;
import java.util.Date;

/**
 *
 */

public class RowAuditInfo {

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
