/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.services.org.impl;

import com.crm.earnify.daos.IGenericEarnifyDao;
import com.crm.earnify.daos.org.IOrgDAO;
import com.crm.earnify.entities.org.OrganizationalEntity;
import com.crm.earnify.services.GenericEarnifyServiceImpl;
import com.crm.earnify.services.org.IOrgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */

@Service("orgServiceImpl")
public class OrgServiceImpl extends GenericEarnifyServiceImpl<OrganizationalEntity,Long> implements IOrgService {

    private static final Logger ELogger = LoggerFactory.getLogger(OrgServiceImpl.class);

    private IOrgDAO i_org_dao;

    //--------------------------------------------------------------------------------------------

    /**
     *
     * @param p_earnify_generic_dao
     */
    @Autowired
    public OrgServiceImpl(@Qualifier("orgDAOImpl") IGenericEarnifyDao<OrganizationalEntity, Long> p_earnify_generic_dao) {
        super(p_earnify_generic_dao);
        this.i_org_dao = (IOrgDAO) p_earnify_generic_dao;
    }

    //---------------------------------------------------------------------------------

    /**
     *
     * @param p_org_entity_to_save_or_update
     */
    @Override
    public void saveOrUpdateOrg(OrganizationalEntity p_org_entity_to_save_or_update) {
        this.i_org_dao.saveOrUpdateOrg(p_org_entity_to_save_or_update);
    }

    //----------------------------------------------------------------------------------

    /**
     *
     * @param p_org_id
     */
    @Override
    public void isNewOrg(Long p_org_id) {
        this.i_org_dao.isNewOrg(p_org_id);
    }

    //-----------------------------------------------------------------------------------

    /**
     *
     * @param p_org_id_to_remove - Org Id which is to be remove
     */
    @Override
    public void removeOrg(Long p_org_id_to_remove) {
        this.i_org_dao.removeOrg(p_org_id_to_remove);
    }

    //-------------------------------------------------------------------------------------
}
