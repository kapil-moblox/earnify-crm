/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.api.controller.org;

import com.crm.earnify.transformers.org.OrganizationBasedTransformer;
import com.crm.earnify.entities.org.OrganizationalEntity;
import com.crm.earnify.request.org.OrgModel;
import com.crm.earnify.response.campaign.CampaignResponse;
import com.crm.earnify.services.org.IOrgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */

@Controller
@RequestMapping(value = "/org",method = {RequestMethod.GET, RequestMethod.HEAD})
public class OrganizationController {

    private static final Logger ELogger = LoggerFactory.getLogger(OrganizationController.class);

    @Autowired
    private OrganizationBasedTransformer i_org_transformer;

    @Autowired
    private IOrgService i_org_service;

    //-------------------------------------------------------------------------------------------------
    /**
     *
     * @param p_org_request -
     * @return - campaign request response
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public CampaignResponse saveOrganization(@RequestBody OrgModel p_org_request) {
        ELogger.info("Found request at controller with request -> (" + p_org_request.toJSONString());

        CampaignResponse l_response_to_return = new CampaignResponse();
        try {
            OrganizationalEntity l_org_entity = i_org_transformer.transform(p_org_request);
            i_org_service.saveOrUpdateOrg(l_org_entity);
        } catch (Exception ex) {
            ELogger.error("Unable to handle request due to Transformation:",ex);
            l_response_to_return.setResponse("Unable to handle request due to Transformation:" + ex);
            l_response_to_return.setResponseDetails("Sorry ! Unable to handle request.");
            return l_response_to_return;
        }
        l_response_to_return.setResponse("OK");
        return l_response_to_return;
    }

    //---------------------------------------------------------------------------------------------------

}
