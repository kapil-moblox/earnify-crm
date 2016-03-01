package com.crm.earnify.entities.task;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.crm.earnify.entities.campaign.CampaignEntity;
import com.crm.earnify.entities.task.executable.ExecutableTaskEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author sandeepandey
 * @version 1.0
 * @see com.crm.earnify.entities.EarnifyBaseEntity
 * @see com.crm.earnify.entities.EarnifyPersistableEntity
 * @see com.crm.earnify.entities.campaign.CampaignEntity
 */
@Table(name = "campaign_task_master",catalog = "earnifydb")
@Entity
public class CampaignTaskEntity extends EarnifyPersistableEntity<Long> {

    private static final Logger ELogger = LoggerFactory.getLogger(CampaignTaskEntity.class);

    private Long id;

    private CampaignEntity attachCampaign;

    private String tagLine;

    private String instructions;

    private Long worth;

    private String payoutDes;

    private String disclaimer;

    private String ctaURL;

    private Collection<ExecutableTaskEntity> attachExecutableTasks;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "campaign_task_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "campaign_code")
    public CampaignEntity getAttachCampaign() {
        return attachCampaign;
    }

    public void setAttachCampaign(CampaignEntity attachCampaign) {
        this.attachCampaign = attachCampaign;
    }

    @Column(name = "campaign_task_tag_line")
    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    @Column(name = "campaign_task_instruction")
    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Column(name = "campaign_task_worth")
    public Long getWorth() {
        return worth;
    }

    public void setWorth(Long worth) {
        this.worth = worth;
    }

    @Column(name = "campaign_payout_desc")
    public String getPayoutDes() {
        return payoutDes;
    }

    public void setPayoutDes(String payoutDes) {
        this.payoutDes = payoutDes;
    }

    @Column(name = "campaign_disclaimer")
    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    @Column(name = "campaign_cta_url")
    public String getCtaURL() {
        return ctaURL;
    }

    public void setCtaURL(String ctaURL) {
        this.ctaURL = ctaURL;
    }

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "fromCampaignTask")
    public Collection<ExecutableTaskEntity> getAttachExecutableTasks() {
        return attachExecutableTasks;
    }

    public void setAttachExecutableTasks(Collection<ExecutableTaskEntity> attachExecutableTasks) {
        this.attachExecutableTasks = attachExecutableTasks;
    }

    @Override
    public Long fetchKey() {
        return null;
    }
}
