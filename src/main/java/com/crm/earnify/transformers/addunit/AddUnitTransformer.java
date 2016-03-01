/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/
package com.crm.earnify.transformers.addunit;

import com.crm.earnify.entities.addunit.AddUnitMaster;
import com.crm.earnify.exceptions.TransformerBasedException;
import com.crm.earnify.request.addunit.AddUnitModel;
import com.crm.earnify.template.AbstractTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sandeepandey
 * @version 1.0, 28/2/16
 */

public class AddUnitTransformer extends AbstractTransformer<AddUnitModel, AddUnitMaster> {
    private static final Logger LOG = LoggerFactory.getLogger(AddUnitTransformer.class);

    //----------------------------------------------------------------------------------------

    /**
     * @param p_candidate - Candidate to be transform
     * @return
     * @throws TransformerBasedException
     */
    @Override
    public AddUnitMaster transform(AddUnitModel p_candidate) throws TransformerBasedException {
        LOG.info("Trying to transform AddUnitModel | AddUnitMaster ");
        AddUnitMaster l_result = new AddUnitMaster();
        try {
            l_result.setCode(p_candidate.getCode());
            l_result.setDesc(p_candidate.getDescription());
            l_result.setName(p_candidate.getName());
            return l_result;
        } catch (NullPointerException npe) {
            LOG.error("Add Unit Model is not valid | Reason:" + npe);
            throw new TransformerBasedException("Add Unit Model is not valid | Reason:" + npe);
        } catch (Exception ex) {
            LOG.error("Problem while transformation | Reason:", ex);
            throw new TransformerBasedException("Problem while transformation | Reason:", ex);
        }
    }

}
