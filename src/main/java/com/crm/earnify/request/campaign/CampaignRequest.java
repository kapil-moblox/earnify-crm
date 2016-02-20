/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.request.campaign;

import com.crm.earnify.base.json.JSONizable;
import com.crm.earnify.request.task.TaskRequest;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.List;

/**
 *  @version     1.0, 19/2/16
 *  @author sandeepandey
 */

public class CampaignRequest implements JSONizable<CampaignRequest> {

    private Long ordId;
    private Long appId;
    private Long adunitId;
    private Long clickTypeId;
    private String description;
    private Double totalPayout;
    private Long payoutTypeId;
    private String tagLine;
    private String payoutLine;
    private List<TaskRequest> attachedTaskRequests ;

    public Long getOrdId() {
        return ordId;
    }

    public void setOrdId(Long ordId) {
        this.ordId = ordId;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Long getAdunitId() {
        return adunitId;
    }

    public void setAdunitId(Long adunitId) {
        this.adunitId = adunitId;
    }

    public Long getClickTypeId() {
        return clickTypeId;
    }

    public void setClickTypeId(Long clickTypeId) {
        this.clickTypeId = clickTypeId;
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

    public Long getPayoutTypeId() {
        return payoutTypeId;
    }

    public void setPayoutTypeId(Long payoutTypeId) {
        this.payoutTypeId = payoutTypeId;
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

    public List<TaskRequest> getAttachedTaskRequests() {
        return attachedTaskRequests;
    }

    public void setAttachedTaskRequests(List<TaskRequest> attachedTaskRequests) {
        this.attachedTaskRequests = attachedTaskRequests;
    }

    @Override
    public String toJSONString(CampaignRequest p_candidate) {
        try {
            return new ObjectMapper().writeValueAsString(p_candidate);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String();
    }
}
