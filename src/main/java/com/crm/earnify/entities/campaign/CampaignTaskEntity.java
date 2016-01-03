package com.crm.earnify.entities.campaign;


import com.crm.earnify.entities.EarnifyPersistableEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author sandeepandey
 * @version 1.0
 * @see com.crm.earnify.entities.EarnifyBaseEntity
 * @see com.crm.earnify.entities.EarnifyPersistableEntity
 * @see com.crm.earnify.entities.campaign.CampaignEntity
 */
public class CampaignTaskEntity extends EarnifyPersistableEntity<Long> {

    private static final Logger ELogger = LoggerFactory.getLogger(CampaignTaskEntity.class);


    private Long id;
    private String description;
    List<CampaignTaskItemEntity> taskItems;

    @Override
    public Long getID() {
        return null;
    }
}
