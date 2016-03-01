/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.transformers.payout;

import com.crm.earnify.entities.payouttype.PayoutTypeEntity;
import com.crm.earnify.exceptions.TransformerBasedException;
import com.crm.earnify.request.payout.PayoutModel;
import com.crm.earnify.template.Transformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  @version     1.0, 29/2/16
 *  @author sandeepandey
 */

public class PayoutTransformer implements Transformer<PayoutModel,PayoutTypeEntity> {

    private static final Logger LOG = LoggerFactory.getLogger(PayoutTransformer.class);

    @Override
    public PayoutTypeEntity transform(PayoutModel p_candidate) throws TransformerBasedException {

        LOG.info("Going to start transform activity ->");
        PayoutTypeEntity l_result_entity = new PayoutTypeEntity();
        try {
            l_result_entity.setCode(p_candidate.getCode());
            l_result_entity.setDesc(p_candidate.getDesc());
            l_result_entity.setName(p_candidate.getName());
            return l_result_entity;
        } catch (Exception ex) {
            LOG.error("Problem while transformation | Reason:"+ex);
            throw new TransformerBasedException("Problem while transformation | Reason:"+ex);
        }
    }
}
