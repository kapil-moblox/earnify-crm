/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.transformers;

import com.crm.earnify.entities.app.AppEntity;
import com.crm.earnify.request.app.AppModel;
import com.crm.earnify.template.AbstractTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */

public class AppBasedTransformer extends AbstractTransformer<AppModel,AppEntity> {

    private static final Logger ELogger = LoggerFactory.getLogger(AppBasedTransformer.class);

    @Override
    public AppEntity transform(AppModel p_candidate) {
        AppEntity l_app_entity = new AppEntity();
        l_app_entity.setAppCatageory(p_candidate.getAppCatageory());
        l_app_entity.setAppCode(p_candidate.getAppCode());
        l_app_entity.setAppDescription(p_candidate.getAppDescription());
        l_app_entity.setAppDomain(p_candidate.getAppDomain());
        l_app_entity.setAppGooglePlayURL(p_candidate.getAppGooglePlayURL());
        l_app_entity.setAppImage(p_candidate.getAppImage());
        l_app_entity.setAppName(p_candidate.getAppName());
        l_app_entity.setAppPromotionalBanner(p_candidate.getAppPromotionalBanner());
        l_app_entity.setAppRating(p_candidate.getAppRating());
        l_app_entity.setAppSize(p_candidate.getAppSize());
        l_app_entity.setAppVersion(p_candidate.getAppVersion());
        l_app_entity.setAppWebsiteURL(p_candidate.getAppWebsiteURL());
        l_app_entity.setLastUpdatedOnGooglePlay(p_candidate.getLastUpdatedOnGooglePlay());
        l_app_entity.setPackageName(p_candidate.getPackageName());
        return l_app_entity;
    }
}
