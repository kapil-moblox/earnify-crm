/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.request.payout;

import com.crm.earnify.base.json.JSONizable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *  @version     1.0, 29/2/16
 *  @author sandeepandey
 */

public class PayoutModel implements JSONizable {

    private String name;

    private String code;

    private String desc;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toJSONString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new String();
    }

    @Override
    public String toString() {
        return "PayoutModel{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
