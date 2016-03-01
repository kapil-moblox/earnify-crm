package com.crm.earnify.transformers;

import com.crm.earnify.entities.actiontype.ActionMaster;
import com.crm.earnify.exceptions.TransformerBasedException;
import com.crm.earnify.request.action.ActionModel;
import com.crm.earnify.template.Transformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  @version     1.0, 29/2/16
 *  @author sandeepandey
 */

public class ActionTransformer implements Transformer<ActionModel,ActionMaster> {
    private static final Logger LOG = LoggerFactory.getLogger(ActionTransformer.class);

    @Override
    public ActionMaster transform(ActionModel p_candidate) throws TransformerBasedException {
        ActionMaster l_result = new ActionMaster();
        l_result.setActionClass(p_candidate.getActionClass());
        l_result.setActionName(p_candidate.getActionClass());
        l_result.setId(p_candidate.getActionId());
        return l_result;
    }
}
