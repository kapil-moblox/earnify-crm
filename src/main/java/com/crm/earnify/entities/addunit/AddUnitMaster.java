/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/
package com.crm.earnify.entities.addunit;

import com.crm.earnify.entities.EarnifyPersistableEntity;

import javax.persistence.*;

/**
 * @author sandeepandey
 * @version 1.0, 14/2/16
 */
@Entity
@Table(name = "ad_unit_master",uniqueConstraints = {@UniqueConstraint(columnNames = "add_unit_code")})
public class AddUnitMaster extends EarnifyPersistableEntity<Long> {

    private Long id;

    private String code;

    private String desc;

    private String name;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_unit_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "add_unit_code",unique = true,nullable = false)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "add_unit_desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Column(name = "add_unit_name")
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
