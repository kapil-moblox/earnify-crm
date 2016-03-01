/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.daos.campaign.impl;

import com.crm.earnify.daos.GenericEarnifyDaoImpl;
import com.crm.earnify.daos.campaign.ICampaignDAO;
import com.crm.earnify.entities.campaign.CampaignEntity;
import com.crm.earnify.exceptions.campaign.CampaignDeleteOperationFailedException;
import com.crm.earnify.exceptions.campaign.CampaignFetchOperationFailedException;
import com.crm.earnify.exceptions.campaign.CampaignSaveOperationFailedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 *  @version     1.0, 21/2/16
 *  @author sandeepandey
 */
@Repository("campaignDAOImpl")
public class CampaignDAOImpl extends GenericEarnifyDaoImpl<CampaignEntity,Long> implements ICampaignDAO {

    private static final Logger ELogger = LoggerFactory.getLogger(CampaignDAOImpl.class);

    //------------------------------------------------------------------------------------------------------------

    /**
     *
     * @param p_entity_to_save
     * @throws CampaignSaveOperationFailedException
     */
    @Override
    public void saveOrUpdateCampaign(CampaignEntity p_entity_to_save) throws CampaignSaveOperationFailedException {
        saveOrUpdate(p_entity_to_save);
    }


    //-------------------------------------------------------------------------------------------------------

    /**
     *
     * @param p_campaign_id_to_fetch
     * @throws CampaignFetchOperationFailedException
     */
    @Override
    public void fetchCampaignById(Long p_campaign_id_to_fetch) throws CampaignFetchOperationFailedException {
        find(p_campaign_id_to_fetch);
    }

    //--------------------------------------------------------------------------------------------------------

    /**
     *
     * @param p_campaign_id
     * @throws CampaignDeleteOperationFailedException
     */
    @Override
    public void deleteCampaignById(Long p_campaign_id) throws CampaignDeleteOperationFailedException {
        try {
            remove(find(p_campaign_id));
        } catch (Exception ex) {
            ELogger.error("Unable to delete campaign by Id ("+p_campaign_id+") | Reason:",ex);
            throw new CampaignDeleteOperationFailedException("Unable to delete campaign by Id ("+p_campaign_id+") | Reason:",ex);
        }
    }
}
