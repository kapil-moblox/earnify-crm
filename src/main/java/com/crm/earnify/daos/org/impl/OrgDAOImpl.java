/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  

package com.crm.earnify.daos.org.impl;

import com.crm.earnify.daos.GenericEarnifyDaoImpl;
import com.crm.earnify.daos.org.IOrgDAO;
import com.crm.earnify.entities.org.OrganizationalEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */

@Repository("orgDAOImpl")
public class OrgDAOImpl extends GenericEarnifyDaoImpl<OrganizationalEntity,Long>
        implements IOrgDAO {

    private static final Logger ELogger = LoggerFactory.getLogger(OrgDAOImpl.class);


    //---------------------------------------------------------------------------------
    /**
     * Handy method to save|update organization
     * @param p_org_entity_to_save_or_update
     */
    @Override
    public void saveOrUpdateOrg(OrganizationalEntity p_org_entity_to_save_or_update) {
        currentSession().save(p_org_entity_to_save_or_update);
    }

    //----------------------------------------------------------------------------------
    /**
     * Handy method to check whether there is any
     * @param p_org_id
     */
    @Override
    public void isNewOrg(Long p_org_id) {
        //TODO
        // some implementation
    }

    //----------------------------------------------------------------------------------
    /**
     *
     * @param p_org_id_to_remove - Org Id which is to be remove
     */
    @Override
    public void removeOrg(Long p_org_id_to_remove) {
        currentSession().delete(p_org_id_to_remove);
    }

    //----------------------------------------------------------------------------------
}
