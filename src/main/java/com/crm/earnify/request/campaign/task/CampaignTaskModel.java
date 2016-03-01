/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.request.campaign.task;

import com.crm.earnify.base.json.JSONizable;
import com.crm.earnify.request.campaign.task.executable.ExecutableTaskModel;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.Collection;

/**
 *  @version     1.0, 29/2/16
 *  @author sandeepandey
 */

public class CampaignTaskModel implements JSONizable {

    private String tagLine;

    private String instructions;

    private Long    worth;

    private String  payoutDes;

    private String  disclaimer;

    private String ctaURL;

    private String callbackURL;

    private Collection<ExecutableTaskModel> attachedTaskModels;
    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

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

    public String getCallbackURL() {
        return callbackURL;
    }

    public void setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
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
