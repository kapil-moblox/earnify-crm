/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.exceptions.org;

import com.crm.earnify.exceptions.EarnifyBasedException;

/**
 *  @version     1.0, 28/2/16
 *  @author sandeepandey
 */
public class OrgByCodeNotFoundException extends EarnifyBasedException {

    public OrgByCodeNotFoundException(String s, Exception ex) {
        super(s,ex);
    }
}
