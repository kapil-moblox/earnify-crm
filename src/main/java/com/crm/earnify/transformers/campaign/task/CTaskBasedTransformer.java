/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.transformers.campaign.task;

import com.crm.earnify.entities.task.CampaignTaskEntity;
import com.crm.earnify.exceptions.TransformerBasedException;
import com.crm.earnify.request.campaign.task.CampaignTaskModel;
import com.crm.earnify.template.Transformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  @version     1.0, 29/2/16
 *  @author sandeepandey
 */
 public class CTaskBasedTransformer implements Transformer<CampaignTaskModel,CampaignTaskEntity> {

    private static final Logger LOG = LoggerFactory.getLogger(CTaskBasedTransformer.class);

    //---------------------------------------------------------------------

    /**
     *
     * @param p_candidate - Candidate to be transform
     * @return
     * @throws TransformerBasedException
     */
    @Override
    public CampaignTaskEntity transform(CampaignTaskModel p_candidate)
            throws TransformerBasedException {
        CampaignTaskEntity l_result_entity = new CampaignTaskEntity();
        return null;

    }
}
