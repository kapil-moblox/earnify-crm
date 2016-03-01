/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.request.addunit;

import com.crm.earnify.base.json.JSONizable;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 *  @version     1.0, 28/2/16
 *  @author sandeepandey
 */

public class AddUnitModel implements JSONizable {

    private String code;
    private String description;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toJSONString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String();
    }

    @Override
    public String toString() {
        return "AddUnitModel{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
