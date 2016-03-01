package com.crm.earnify.api.controller;

import com.crm.earnify.request.campaign.CampaignModel;
import com.crm.earnify.response.campaign.CampaignResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author sandeepandey
 */
@Controller
@RequestMapping(value = "/campaign",method = {RequestMethod.GET, RequestMethod.HEAD})
public class CampaignController extends EarnifyController {
    private static final Logger ELogger = LoggerFactory.getLogger(CampaignController.class);



    @RequestMapping("/save")
    public CampaignResponse saveOrUpdateCampaign(@RequestBody CampaignModel p_campaign_request) {
        ELogger.info("Found Request for campaign save | update with code ("+p_campaign_request.getCampaignCode());
        return null;
    }



}
