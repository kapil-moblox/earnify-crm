/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.services.campaign;

import com.crm.earnify.entities.campaign.CampaignEntity;
import com.crm.earnify.request.campaign.CampaignModel;
import com.crm.earnify.response.campaign.CampaignResponse;
import com.crm.earnify.services.IGenericEarnifyService;

/**
 *  @version     1.0, 21/2/16
 *  @author sandeepandey
 */

public interface ICampaignService extends IGenericEarnifyService<CampaignEntity,Long> {

    default CampaignResponse handleCampaignRequest(CampaignModel p_campaign_request) {
        return null;
    }

    public CampaignResponse handleCampaignRequest(CampaignEntity p_campaign_entity);
}
