/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.daos.campaign;

import com.crm.earnify.daos.IGenericEarnifyDao;
import com.crm.earnify.entities.campaign.CampaignEntity;
import com.crm.earnify.exceptions.campaign.CampaignDeleteOperationFailedException;
import com.crm.earnify.exceptions.campaign.CampaignFetchOperationFailedException;
import com.crm.earnify.exceptions.campaign.CampaignSaveOperationFailedException;


/**
 *  @version     1.0, 21/2/16
 *  @author sandeepandey
 */

public interface ICampaignDAO extends IGenericEarnifyDao<CampaignEntity,Long> {

    public void saveOrUpdateCampaign(CampaignEntity p_entity_to_save) throws CampaignSaveOperationFailedException;

    public void fetchCampaignById(Long p_campaign_id_to_fetch) throws CampaignFetchOperationFailedException;

    public void deleteCampaignById(Long p_campaign_id) throws CampaignDeleteOperationFailedException;

}
