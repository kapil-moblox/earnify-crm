/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.base.json;

import org.codehaus.jackson.map.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

/**
 *  @version     1.0, 19/2/16
 *  @author sandeepandey
 */

public interface JSONizable {
    public String toJSONString();

    default Map<String,Object> toJSONMap() {
        return new ObjectMapper().convertValue(toJSONString(),HashMap.class);
    }
}
