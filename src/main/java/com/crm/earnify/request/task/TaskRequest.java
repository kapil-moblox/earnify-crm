/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.request.task;

import com.crm.earnify.request.task.executable.ExecutableTaskRequest;

import java.io.Serializable;
import java.util.List;

/**
 *  @version     1.0, 19/2/16
 *  @author sandeepandey
 */

public class TaskRequest implements Serializable {

    private String tagLine;
    private String payoutLine;
    private String instructions;
    private Double payout;
    private String disclaimer;
    private String ctaURL;
    private String callbackURL;
    private List<ExecutableTaskRequest> executableTaskRequests;


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

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public Double getPayout() {
        return payout;
    }

    public void setPayout(Double payout) {
        this.payout = payout;
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

    public List<ExecutableTaskRequest> getExecutableTaskRequests() {
        return executableTaskRequests;
    }

    public void setExecutableTaskRequests(List<ExecutableTaskRequest> executableTaskRequests) {
        this.executableTaskRequests = executableTaskRequests;
    }
}
