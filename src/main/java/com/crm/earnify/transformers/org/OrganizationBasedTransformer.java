/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.transformers.org;

import com.crm.earnify.entities.app.AppEntity;
import com.crm.earnify.entities.org.OrganizationalEntity;
import com.crm.earnify.exceptions.TransformerBasedException;
import com.crm.earnify.request.org.OrgModel;
import com.crm.earnify.template.AbstractTransformer;
import com.crm.earnify.transformers.app.AppBasedTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */

@Service("organizationBasedTransformer")
public class OrganizationBasedTransformer extends AbstractTransformer<OrgModel,OrganizationalEntity> {

    private static final Logger ELogger = LoggerFactory.getLogger(OrganizationBasedTransformer.class);

    //------------------------------------------------------------------------------------------------
    /**
     *
     * @param p_candidate - Candidate to be transform
     * @return
     */
    @Override
    public OrganizationalEntity transform(OrgModel p_candidate) {
        try {
            AppBasedTransformer l_app_transformer = new AppBasedTransformer();
            OrganizationalEntity l_result_entity = new OrganizationalEntity();
            l_result_entity.setDescription(p_candidate.getOrgDescription());
            l_result_entity.setOrgCode(p_candidate.getOrgCode());
            l_result_entity.setOrgName(p_candidate.getOrgName());
            Collection<AppEntity> l_app_entries = l_app_transformer.transform(p_candidate.getLaunchedApps());
            for(AppEntity l_entity : l_app_entries)
                l_entity.setFromOrganization(l_result_entity);
            l_result_entity.setLunchedApps(l_app_entries);
            return l_result_entity;

        } catch (TransformerBasedException|NullPointerException e) {
            ELogger.error("Problem while doing transform operation | Reason:",e);
            throw new TransformerBasedException("Problem while doing transform operation | Reason:",e);
        }
    }
}
