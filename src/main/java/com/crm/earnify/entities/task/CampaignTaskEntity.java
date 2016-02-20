package com.crm.earnify.entities.task;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.crm.earnify.entities.campaign.CampaignEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

/**
 * @author sandeepandey
 * @version 1.0
 * @see com.crm.earnify.entities.EarnifyBaseEntity
 * @see com.crm.earnify.entities.EarnifyPersistableEntity
 * @see com.crm.earnify.entities.campaign.CampaignEntity
 */
@Table(name = "campaign_tasks")
@Entity
public class CampaignTaskEntity extends EarnifyPersistableEntity<Long> {

    private static final Logger ELogger = LoggerFactory.getLogger(CampaignTaskEntity.class);

    private Long id;

    private CampaignEntity campaign;

    private String tagLine;

    private String instructions;

    private Long worth;

    private String payoutDes;

    private String disclaimer;

    private String ctaURL;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id") public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY) public CampaignEntity getCampaign() {
        return campaign;
    }

    public void setCampaign(CampaignEntity campaign) {
        this.campaign = campaign;
    }

    @Column(name = "tagline") public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    @Column(name = "instructions")
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Long getWorth() {
        return worth;
    }

    public void setWorth(Long worth) {
        this.worth = worth;
    }

    public String getPayoutDes() {
        return payoutDes;
    }

    public void setPayoutDes(String payoutDes) {
        this.payoutDes = payoutDes;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getCtaURL() {
        return ctaURL;
    }

    public void setCtaURL(String ctaURL) {
        this.ctaURL = ctaURL;
    }

    @Override
    public Long getID() {
        return null;
    }
}
