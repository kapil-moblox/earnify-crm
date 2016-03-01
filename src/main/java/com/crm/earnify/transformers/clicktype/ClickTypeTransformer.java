/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.transformers.clicktype;

import com.crm.earnify.entities.clicktype.ClickTypeEntity;
import com.crm.earnify.exceptions.TransformerBasedException;
import com.crm.earnify.request.clicktype.ClickTypeModel;
import com.crm.earnify.template.Transformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  @version     1.0, 29/2/16
 *  @author sandeepandey
 */

public class ClickTypeTransformer implements Transformer<ClickTypeModel,ClickTypeEntity> {

    private static final Logger LOG = LoggerFactory.getLogger(ClickTypeTransformer.class);

    @Override
    public ClickTypeEntity transform(ClickTypeModel p_candidate) throws TransformerBasedException {

        ClickTypeEntity l_result_entity = new ClickTypeEntity();
        try {
            l_result_entity.setCode(p_candidate.getCode());
            l_result_entity.setDesc(p_candidate.getDesc());
            l_result_entity.setName(p_candidate.getName());

        } catch (NullPointerException npe) {
            LOG.error("Click Type Model is Null | Unable to transform:"+npe);
            throw new TransformerBasedException("Click Type Model is Null | Unable to transform:"+npe);
        } catch (Exception ex) {
            LOG.error("Problem while transformation | Reason:",ex);
            throw new TransformerBasedException("Problem while transformation | Reason:",ex);
        }
        return l_result_entity;
    }
}
