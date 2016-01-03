package com.crm.earnify.entities.campaign;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

/**
 * @author sandeepandey
 * @version 1.0
 * @see com.crm.earnify.entities.campaign.CampaignEntity
 * @see com.crm.earnify.entities.campaign.CampaignTaskEntity
 * @see com.crm.earnify.entities.campaign.CampaignTaskItemEntity
 */
@Entity
@Table(name = "campaign_task_type")
public class CampaignTaskTypeEntity extends EarnifyPersistableEntity<Long> {

    private static final Logger ELogger = LoggerFactory.getLogger(CampaignTaskTypeEntity.class);

    private Long id;

    private String campaignTaskTypeName;
    private String campaignTaskTypeCode;
    private String campaignTaskTypeDescription;

    @Override
    public Long getID() {
        return getId();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "campaign_task_type_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "campaign_task_type_name")
    public String getCampaignTaskTypeName() {
        return campaignTaskTypeName;
    }

    public void setCampaignTaskTypeName(String campaignTaskTypeName) {
        this.campaignTaskTypeName = campaignTaskTypeName;
    }

    @Column(name = "campaign_task_type_code")
    public String getCampaignTaskTypeCode() {
        return campaignTaskTypeCode;
    }

    public void setCampaignTaskTypeCode(String campaignTaskTypeCode) {
        this.campaignTaskTypeCode = campaignTaskTypeCode;
    }

    @Column(name = "campaign_task_type_description")
    public String getCampaignTaskTypeDescription() {
        return campaignTaskTypeDescription;
    }

    public void setCampaignTaskTypeDescription(String campaignTaskTypeDescription) {
        this.campaignTaskTypeDescription = campaignTaskTypeDescription;
    }


    @Override
    public String toString() {
        return "CampaignTaskType{" +
                "id=" + id +
                ", campaignTaskTypeName='" + campaignTaskTypeName + '\'' +
                ", campaignTaskTypeCode='" + campaignTaskTypeCode + '\'' +
                ", campaignTaskTypeDescription='" + campaignTaskTypeDescription + '\'' +
                '}';
    }
}
