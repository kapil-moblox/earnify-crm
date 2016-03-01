/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.request.app;

import com.crm.earnify.base.json.JSONizable;
import com.crm.earnify.request.campaign.CampaignModel;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */

public class AppModel implements JSONizable {

    private static final Logger ELogger = LoggerFactory.getLogger(AppModel.class);

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
    private Collection<CampaignModel> attachCampaigns;

    public Collection<CampaignModel> getAttachCampaigns() {
        if(attachCampaigns == null)
            attachCampaigns = new ArrayList<>();
        return attachCampaigns;
    }

    public void setAttachCampaigns(Collection<CampaignModel> attachCampaigns) {
        this.attachCampaigns = attachCampaigns;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public String getAppImage() {
        return appImage;
    }

    public void setAppImage(String appImage) {
        this.appImage = appImage;
    }

    public String getAppCatageory() {
        return appCatageory;
    }

    public void setAppCatageory(String appCatageory) {
        this.appCatageory = appCatageory;
    }

    public String getAppRating() {
        return appRating;
    }

    public void setAppRating(String appRating) {
        this.appRating = appRating;
    }

    public String getAppSize() {
        return appSize;
    }

    public void setAppSize(String appSize) {
        this.appSize = appSize;
    }

    public String getAppGooglePlayURL() {
        return appGooglePlayURL;
    }

    public void setAppGooglePlayURL(String appGooglePlayURL) {
        this.appGooglePlayURL = appGooglePlayURL;
    }

    public String getAppWebsiteURL() {
        return appWebsiteURL;
    }

    public void setAppWebsiteURL(String appWebsiteURL) {
        this.appWebsiteURL = appWebsiteURL;
    }

    public String getAppPromotionalBanner() {
        return appPromotionalBanner;
    }

    public void setAppPromotionalBanner(String appPromotionalBanner) {
        this.appPromotionalBanner = appPromotionalBanner;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getAppDomain() {
        return appDomain;
    }

    public void setAppDomain(String appDomain) {
        this.appDomain = appDomain;
    }

    public Date getLastUpdatedOnGooglePlay() {
        return lastUpdatedOnGooglePlay;
    }

    public void setLastUpdatedOnGooglePlay(Date lastUpdatedOnGooglePlay) {
        this.lastUpdatedOnGooglePlay = lastUpdatedOnGooglePlay;
    }

    //----------------------------------------------------------------------------------
    @Override
    public String toJSONString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String();
    }


}
