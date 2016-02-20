/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.transformers;

import com.crm.earnify.entities.org.OrganizationalEntity;
import com.crm.earnify.request.org.OrgModel;
import com.crm.earnify.template.AbstractTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */

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
        AppBasedTransformer l_app_transformer = new AppBasedTransformer();
        OrganizationalEntity l_result_entity = new OrganizationalEntity();


        l_result_entity.setDescription(p_candidate.getOrgDescription());
        l_result_entity.setOrgCode(p_candidate.getOrgCode());
        l_result_entity.setOrgName(p_candidate.getOrgName());
        l_result_entity.setLunchedApps(l_app_transformer.transform(p_candidate.getLaunchedApps()));
        return l_result_entity;
    }
}
