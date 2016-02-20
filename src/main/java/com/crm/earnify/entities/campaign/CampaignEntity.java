package com.crm.earnify.entities.campaign;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.crm.earnify.entities.addunit.AddUnitMaster;
import com.crm.earnify.entities.app.AppEntity;
import com.crm.earnify.entities.clicktype.ClickTypeEntity;
import com.crm.earnify.entities.payouttype.PayoutTypeEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.util.Date;

@Table(name = "campaign_master")
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
    private String campaignTagLine;
    private String ctaURL;
    private AddUnitMaster addUnit;
    private ClickTypeEntity clickType;
    private PayoutTypeEntity payoutType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "campaign_name")
    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    @Column(name = "campaign_code")
    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    @Column(name = "campaign_display_name")
    public String getCampaignDisplayName() {
        return campaignDisplayName;
    }

    public void setCampaignDisplayName(String campaignDisplayName) {
        this.campaignDisplayName = campaignDisplayName;
    }

    @Column(name = "campaign_description")
    public String getCampaignDescription() {
        return campaignDescription;
    }

    public void setCampaignDescription(String campaignDescription) {
        this.campaignDescription = campaignDescription;
    }

    @Column(name = "campaign_total_value")
    public Double getCampaignTotalValue() {
        return campaignTotalValue;
    }

    public void setCampaignTotalValue(Double campaignTotalValue) {
        this.campaignTotalValue = campaignTotalValue;
    }

    @Column(name = "campaign_expiration_date")
    public Date getCampaignExpiration() {
        return campaignExpiration;
    }

    public void setCampaignExpiration(Date campaignExpiration) {
        this.campaignExpiration = campaignExpiration;
    }

    @JoinColumn(name = "app_id")
    public AppEntity getCampaignApp() {
        return campaignApp;
    }

    public void setCampaignApp(AppEntity campaignApp) {
        this.campaignApp = campaignApp;
    }

    @Column(name = "campaign_tag_line")
    public String getCampaignTagLine() {
        return campaignTagLine;
    }

    public void setCampaignTagLine(String campaignTagLine) {
        this.campaignTagLine = campaignTagLine;
    }

    @Column(name = "campaign_cta_url")
    public String getCtaURL() {
        return ctaURL;
    }

    public void setCtaURL(String ctaURL) {
        this.ctaURL = ctaURL;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public AddUnitMaster getAddUnit() {
        return addUnit;
    }

    public void setAddUnit(AddUnitMaster addUnit) {
        this.addUnit = addUnit;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public ClickTypeEntity getClickType() {
        return clickType;
    }

    public void setClickType(ClickTypeEntity clickType) {
        this.clickType = clickType;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public PayoutTypeEntity getPayoutType() {
        return payoutType;
    }

    public void setPayoutType(PayoutTypeEntity payoutType) {
        this.payoutType = payoutType;
    }

    @Override
    public Long getID() {
        return getId();
    }
}
