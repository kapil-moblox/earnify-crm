/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.response;

import com.crm.earnify.base.json.JSONizable;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Serializable;

/**
 *  @version     1.0, 21/2/16
 *  @author sandeepandey
 */

public class EarnifyBaseResponse<T extends Serializable> implements Serializable,JSONizable {

    private static final Logger ELogger = LoggerFactory.getLogger(EarnifyBaseResponse.class);


    private String response;

    private T responseDetails;

    //-----------------------------------------------------------------------------------
    public String getResponse() {
        return response;
    }

    //-------------------------------------------------------------------------------------
    public void setResponse(String response) {
        this.response = response;
    }

    //--------------------------------------------------------------------------------------
    public T getResponseDetails() {
        return responseDetails;
    }

    //---------------------------------------------------------------------------------------
    public void setResponseDetails(T responseDetails) {
        this.responseDetails = responseDetails;
    }


    //-----------------------------------------------------------------------------------------

    /**
     * Handy method to convert Response object in JSON.
     * @return
     */
    @Override
    public String toJSONString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String();
    }

    //------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return toJSONString();
    }

    //-----------------------------------------------------------------------------------------
}
