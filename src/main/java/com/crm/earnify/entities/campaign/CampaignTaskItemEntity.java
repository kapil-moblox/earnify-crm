package com.crm.earnify.entities.campaign;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sandeepandey
 * @see com.crm.earnify.entities.campaign.CampaignEntity
 * @see com.crm.earnify.entities.campaign.CampaignTaskEntity
 * @version 1.0
 */
public class CampaignTaskItemEntity  extends EarnifyPersistableEntity<Long>{

    private static final Logger ELogger = LoggerFactory.getLogger(CampaignTaskItemEntity.class);

    private Long id;
    private String campaignTaskItemDescription;
    private String campaignTaskItemName;
    private String campaignTaskItemCode;
    private Double campaignTaskItemValue;
    



    @Override
    public Long getID() {
        return null;
    }
}
