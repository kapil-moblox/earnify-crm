/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.transformers.campaign.task.executable;

import com.crm.earnify.entities.actiontype.ActionMaster;
import com.crm.earnify.entities.task.executable.ExecutableTaskEntity;
import com.crm.earnify.exceptions.TransformerBasedException;
import com.crm.earnify.request.action.ActionModel;
import com.crm.earnify.request.campaign.task.executable.ExecutableTaskModel;
import com.crm.earnify.template.Transformer;
import com.crm.earnify.transformers.ActionTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  @version     1.0, 29/2/16
 *  @author sandeepandey
 */

public class ExecutableTaskTransformer implements Transformer<ExecutableTaskModel,ExecutableTaskEntity> {

    private static final Logger LOG = LoggerFactory.getLogger(ExecutableTaskTransformer.class);

    @Override
    public ExecutableTaskEntity transform(ExecutableTaskModel p_candidate) throws TransformerBasedException {
        ExecutableTaskEntity l_task_entity = new ExecutableTaskEntity();
        Transformer<ActionModel,ActionMaster> l_transformer = new ActionTransformer();
        try {
            l_task_entity.setAttachAction(l_transformer.transform(() -> {
                ActionModel l_model = new ActionModel();
                l_model.setActionId(p_candidate.getActionId());
                return l_model;
            }));


            return l_task_entity;
        } catch (Exception ex) {
            LOG.error("Problem while transformation | Reason:",ex);
            throw new TransformerBasedException("Problem while transformation | Reason:",ex);
        }

    }
}
