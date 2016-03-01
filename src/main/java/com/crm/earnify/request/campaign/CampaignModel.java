/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/
package com.crm.earnify.request.campaign;

import com.crm.earnify.base.json.JSONizable;
import com.crm.earnify.request.campaign.task.CampaignTaskModel;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.List;

/**
 * @author sandeepandey
 * @version 1.0, 19/2/16
 */

public class CampaignModel implements JSONizable {

    private String appCode;
    private String campaignCode;
    private String campaignName;
    private String addUnitCode;
    private String clickTypeCode;
    private String description;
    private Double totalPayout;
    private String payoutCode;
    private String tagLine;
    private String payoutLine;
    private String ctaURL;
    private List<CampaignTaskModel> attachedTaskModels;

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getAddUnitCode() {
        return addUnitCode;
    }

    public void setAddUnitCode(String addUnitCode) {
        this.addUnitCode = addUnitCode;
    }

    public String getClickTypeCode() {
        return clickTypeCode;
    }

    public void setClickTypeCode(String clickTypeCode) {
        this.clickTypeCode = clickTypeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getTotalPayout() {
        return totalPayout;
    }

    public void setTotalPayout(Double totalPayout) {
        this.totalPayout = totalPayout;
    }

    public String getPayoutCode() {
        return payoutCode;
    }

    public void setPayoutCode(String payoutCode) {
        this.payoutCode = payoutCode;
    }

    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    public String getPayoutLine() {
        return payoutLine;
    }

    public void setPayoutLine(String payoutLine) {
        this.payoutLine = payoutLine;
    }

    public List<CampaignTaskModel> getAttachedTaskModels() {
        return attachedTaskModels;
    }

    public void setAttachedTaskModels(List<CampaignTaskModel> attachedTaskModels) {
        this.attachedTaskModels = attachedTaskModels;
    }

    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCtaURL() {
        return ctaURL;
    }

    public void setCtaURL(String ctaURL) {
        this.ctaURL = ctaURL;
    }

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
