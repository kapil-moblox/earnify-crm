package com.crm.earnify.transformers.campaign;

import com.crm.earnify.entities.addunit.AddUnitMaster;
import com.crm.earnify.entities.campaign.CampaignEntity;
import com.crm.earnify.entities.clicktype.ClickTypeEntity;
import com.crm.earnify.entities.payouttype.PayoutTypeEntity;
import com.crm.earnify.exceptions.TransformerBasedException;
import com.crm.earnify.request.addunit.AddUnitModel;
import com.crm.earnify.request.campaign.CampaignModel;
import com.crm.earnify.request.clicktype.ClickTypeModel;
import com.crm.earnify.request.payout.PayoutModel;
import com.crm.earnify.template.AbstractTransformer;
import com.crm.earnify.template.Transformer;
import com.crm.earnify.transformers.addunit.AddUnitTransformer;
import com.crm.earnify.transformers.clicktype.ClickTypeTransformer;
import com.crm.earnify.transformers.payout.PayoutTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 *  @version     1.0, 28/2/16
 *  @author sandeepandey
 */

public class CampaignBasedTransformer extends AbstractTransformer<CampaignModel,CampaignEntity> {

    private static final Logger LOG = LoggerFactory.getLogger(CampaignBasedTransformer.class);

    @Override
    public CampaignEntity transform(CampaignModel p_candidate) throws TransformerBasedException {
        LOG.info("Trying to transform Campaign Model | Campaign Entity");


        Transformer<AddUnitModel,AddUnitMaster> l_add_unit_transformer = new AddUnitTransformer();
        Transformer<ClickTypeModel,ClickTypeEntity> l_click_type_transformer = new ClickTypeTransformer();
        Transformer<PayoutModel,PayoutTypeEntity> l_payout_transformer = new PayoutTransformer();

        CampaignEntity l_result_entity = new CampaignEntity();

        try {
            l_result_entity.setAddUnit(l_add_unit_transformer.transform(() -> {
                AddUnitModel l_result = new AddUnitModel();
                l_result.setCode(p_candidate.getAddUnitCode());
                return l_result;
            }));

            l_result_entity.setClickType(l_click_type_transformer.transform(() -> {
                ClickTypeModel l_model = new ClickTypeModel();
                l_model.setCode(p_candidate.getClickTypeCode());
                return l_model;
            }));

            l_result_entity.setPayoutType(l_payout_transformer.transform(() -> {
                PayoutModel l_model = new PayoutModel();
                l_model.setCode(p_candidate.getPayoutCode());
                return l_model;
            }));


            l_result_entity.setCampaignCode(p_candidate.getAppCode());
            l_result_entity.setCampaignDescription(p_candidate.getDescription());
            l_result_entity.setCampaignDisplayName(p_candidate.getDescription());
            l_result_entity.setCampaignExpiration(new Date());
            l_result_entity.setCampaignName(p_candidate.getCampaignName());
            l_result_entity.setCampaignTagLine(p_candidate.getTagLine());
            l_result_entity.setCampaignTotalValue(p_candidate.getTotalPayout());
            l_result_entity.setCtaURL(p_candidate.getCtaURL());
            l_result_entity.setAttachTask(null);
        } catch (Exception ex) {

        }
        return null;
    }
}
