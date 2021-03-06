package com.crm.earnify.entities.app;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.crm.earnify.entities.campaign.CampaignEntity;
import com.crm.earnify.entities.org.OrganizationalEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author sandeepandey
 */
@Entity
@Table(name = "app_master",uniqueConstraints = {@UniqueConstraint(columnNames = "app_code")},catalog = "earnifydb")
public class AppEntity extends EarnifyPersistableEntity<Integer> {

    private Long appId;
    private String appName;
    private String appCode;
    private String appDescription;
    private String appImage;
    private String appCatageory;
    private String appRating;
    private String appSize;
    private String appGooglePlayURL;
    private String appWebsiteURL;
    private String appPromotionalBanner;
    private String appVersion;
    private String packageName;
    private String appDomain;
    private Date lastUpdatedOnGooglePlay;
    private OrganizationalEntity fromOrganization;
    private List<CampaignEntity> campaigns;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "app_id")
    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }


    @Column(name = "app_name")
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Column(name = "app_code",nullable = false,unique = true)
    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    @Column(name = "app_description")
    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    @Column(name = "app_image")
    public String getAppImage() {
        return appImage;
    }


    public void setAppImage(String appImage) {
        this.appImage = appImage;
    }

    @Column(name = "app_catageory")
    public String getAppCatageory() {
        return appCatageory;
    }

    public void setAppCatageory(String appCatageory) {
        this.appCatageory = appCatageory;
    }

    @Column(name = "app_rating")
    public String getAppRating() {
        return appRating;
    }

    public void setAppRating(String appRating) {
        this.appRating = appRating;
    }

    @Column(name = "app_size")
    public String getAppSize() {
        return appSize;
    }

    public void setAppSize(String appSize) {
        this.appSize = appSize;
    }

    @Column(name = "app_version")
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Column(name = "app_package_name")
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    @Column(name = "app_domain")
    public String getAppDomain() {
        return appDomain;
    }

    public void setAppDomain(String appDomain) {
        this.appDomain = appDomain;
    }

    @Column(name = "app_google_play_url")
    public String getAppGooglePlayURL() {
        return appGooglePlayURL;
    }

    public void setAppGooglePlayURL(String appGooglePlayURL) {
        this.appGooglePlayURL = appGooglePlayURL;
    }

    @Column(name = "app_website_url")
    public String getAppWebsiteURL() {
        return appWebsiteURL;
    }

    public void setAppWebsiteURL(String appWebsiteURL) {
        this.appWebsiteURL = appWebsiteURL;
    }

    @Column(name = "app_promotional_banner")
    public String getAppPromotionalBanner() {
        return appPromotionalBanner;
    }

    public void setAppPromotionalBanner(String appPromotionalBanner) {
        this.appPromotionalBanner = appPromotionalBanner;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update_on_google_play")
    public Date getLastUpdatedOnGooglePlay() {
        return lastUpdatedOnGooglePlay;
    }

    public void setLastUpdatedOnGooglePlay(Date lastUpdatedOnGooglePlay) {
        this.lastUpdatedOnGooglePlay = lastUpdatedOnGooglePlay;
    }

    @JoinColumn(name = "org_id",nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    public OrganizationalEntity getFromOrganization() {
        return fromOrganization;
    }

    public void setFromOrganization(OrganizationalEntity fromOrganization) {
        this.fromOrganization = fromOrganization;
    }

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "fromApp" )
    public List<CampaignEntity> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<CampaignEntity> campaigns) {
        this.campaigns = campaigns;
    }

    @Override
    public Integer fetchKey() {
        return null;
    }

}
