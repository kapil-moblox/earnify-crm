package com.crm.earnify.entities.campaign;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.crm.earnify.entities.app.AppEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class CampaignEntity extends EarnifyPersistableEntity<Long>{

    private static final Logger ELogger = LoggerFactory.getLogger(CampaignEntity.class);

    private Long id;
    private String campaignName;
    private String campaignCode;
    private String campaignDisplayName;
    private String campaignDescription;
    private Double campaignTotalValue;
    private Date campaignExpiration;
    private AppEntity campaignApp;


    @Override
    public Long getID() {
        return null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public String getCampaignDisplayName() {
        return campaignDisplayName;
    }

    public void setCampaignDisplayName(String campaignDisplayName) {
        this.campaignDisplayName = campaignDisplayName;
    }

    public String getCampaignDescription() {
        return campaignDescription;
    }

    public void setCampaignDescription(String campaignDescription) {
        this.campaignDescription = campaignDescription;
    }

    public Date getCampaignExpiration() {
        return campaignExpiration;
    }

    public void setCampaignExpiration(Date campaignExpiration) {
        this.campaignExpiration = campaignExpiration;
    }

    public AppEntity getCampaignApp() {
        return campaignApp;
    }

    public void setCampaignApp(AppEntity campaignApp) {
        this.campaignApp = campaignApp;
    }

    @Override
    public String toString() {
        return "CampaignEntity{" +
                "id=" + id +
                ", campaignName='" + campaignName + '\'' +
                ", campaignCode='" + campaignCode + '\'' +
                ", campaignDisplayName='" + campaignDisplayName + '\'' +
                ", campaignDescription='" + campaignDescription + '\'' +
                ", campaignExpiration=" + campaignExpiration +
                ", campaignApp=" + campaignApp +
                '}';
    }
}
