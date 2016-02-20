/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.request.org;

import com.crm.earnify.base.json.JSONizable;
import com.crm.earnify.request.app.AppModel;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.Collection;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */

public class OrgModel implements JSONizable {

    private String orgName;

    private String orgCode;

    private String orgDescription;

    private Collection<AppModel> launchedApps;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgDescription() {
        return orgDescription;
    }

    public void setOrgDescription(String orgDescription) {
        this.orgDescription = orgDescription;
    }

    public Collection<AppModel> getLaunchedApps() {
        return launchedApps;
    }

    public void setLaunchedApps(Collection<AppModel> launchedApps) {
        this.launchedApps = launchedApps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrgModel)) return false;

        OrgModel orgModel = (OrgModel) o;

        if (launchedApps != null ? !launchedApps.equals(orgModel.launchedApps) : orgModel.launchedApps != null)
            return false;
        if (orgCode != null ? !orgCode.equals(orgModel.orgCode) : orgModel.orgCode != null) return false;
        if (orgDescription != null ? !orgDescription.equals(orgModel.orgDescription) : orgModel.orgDescription != null)
            return false;
        if (orgName != null ? !orgName.equals(orgModel.orgName) : orgModel.orgName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orgName != null ? orgName.hashCode() : 0;
        result = 31 * result + (orgCode != null ? orgCode.hashCode() : 0);
        result = 31 * result + (orgDescription != null ? orgDescription.hashCode() : 0);
        result = 31 * result + (launchedApps != null ? launchedApps.hashCode() : 0);
        return result;
    }

    @Override
    public String toJSONString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
