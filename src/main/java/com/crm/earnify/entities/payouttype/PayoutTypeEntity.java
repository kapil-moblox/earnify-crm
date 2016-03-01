/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.entities.payouttype;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

/**
 *  @version     1.0, 14/2/16
 *  @author sandeepandey
 */

@Entity
@Table(name = "payout_type_master",uniqueConstraints = {@UniqueConstraint(columnNames = "payout_type_code")})
public class PayoutTypeEntity extends EarnifyPersistableEntity<Long>{

    public static final Logger ELogger = LoggerFactory.getLogger(PayoutTypeEntity.class);

    private Long id;

    private String name;

    private String code;

    private String desc;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payout_type_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "payout_type_code",nullable = false,unique = true)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    @Column(name = "payout_type_desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Long fetchKey() {
        return getId();
    }
}
