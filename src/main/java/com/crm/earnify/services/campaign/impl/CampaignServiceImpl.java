package com.crm.earnify.services.campaign.impl;

import com.crm.earnify.daos.IGenericEarnifyDao;
import com.crm.earnify.entities.campaign.CampaignEntity;
import com.crm.earnify.request.campaign.CampaignModel;
import com.crm.earnify.response.campaign.CampaignResponse;
import com.crm.earnify.services.IGenericEarnifyServiceImpl;
import com.crm.earnify.services.campaign.ICampaignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *  @version     1.0, 21/2/16
 *  @author sandeepandey
 */

@Service("campaignServiceImpl")
public class CampaignServiceImpl extends IGenericEarnifyServiceImpl<CampaignEntity,Long> implements ICampaignService {

    private static final Logger ELogger = LoggerFactory.getLogger(CampaignServiceImpl.class);

    public CampaignServiceImpl() {

    }


    public CampaignServiceImpl(IGenericEarnifyDao<CampaignEntity, Long> p_earnify_generic_dao) {
        super(p_earnify_generic_dao);
    }


    @Override
    public CampaignResponse handleCampaignRequest(CampaignModel p_campaign_request) {
        return null;
    }

    @Override
    public CampaignResponse handleCampaignRequest(CampaignEntity p_campaign_entity) {
        return null;
    }

}
