package com.crm.earnify.entities.task;


import com.crm.earnify.entities.EarnifyPersistableEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sandeepandey
 * @version 1.0
 * @see com.crm.earnify.entities.EarnifyBaseEntity
 * @see com.crm.earnify.entities.EarnifyPersistableEntity
 * @see com.crm.earnify.entities.user.UserTypeEntity
 */
public class CampaignTaskType extends EarnifyPersistableEntity<Long>{

    private static final Logger ELogger = LoggerFactory.getLogger(CampaignTaskType.class);



    @Override
    public Long getID() {
        return null;
    }
}
