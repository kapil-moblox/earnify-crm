/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.controller.org;

import com.crm.earnify.request.org.OrgModel;
import com.crm.earnify.services.org.IOrgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */

@Controller
@RequestMapping(name = "/org")
public class OrganizationController {

    private static final Logger ELogger = LoggerFactory.getLogger(OrganizationController.class);

    @Autowired
    private IOrgService i_org_service;

    @RequestMapping(method = RequestMethod.POST,path = "/save",consumes = "application/json")
    public void saveOrganization(@RequestBody OrgModel p_org_request) {
        ELogger.info("Found request at controller with request -> ("+p_org_request.toJSONString());

    }

}
