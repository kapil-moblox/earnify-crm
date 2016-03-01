/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/
package com.crm.earnify.entities.clicktype;

import com.crm.earnify.entities.EarnifyPersistableEntity;

import javax.persistence.*;

/**
 * @author sandeepandey
 * @version 1.0, 14/2/16
 */
@Entity
@Table(name = "click_type_master",uniqueConstraints = {@UniqueConstraint(columnNames = "click_type_code")})
public class ClickTypeEntity extends EarnifyPersistableEntity<Long> {

    private Long id;

    private String name;

    private String code;
    private String desc;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "click_type_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "click_type_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "click_type_code",unique = true,nullable = false)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "click_type_desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public Long fetchKey() {
        return getId();
    }
}
