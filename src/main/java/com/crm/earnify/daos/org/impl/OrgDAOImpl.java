/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  

package com.crm.earnify.daos.org.impl;

import com.crm.earnify.daos.GenericEarnifyDaoImpl;
import com.crm.earnify.daos.org.IOrgDAO;
import com.crm.earnify.entities.org.OrganizationalEntity;
import com.crm.earnify.exceptions.EarnifyBasedException;
import com.crm.earnify.exceptions.org.OrgByCodeNotFoundException;
import org.hibernate.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveOrUpdateOrg(OrganizationalEntity p_org_entity_to_save_or_update) {
        ELogger.info("Org DAO trying to persist organization into db with code (" + p_org_entity_to_save_or_update.
                getOrgCode() + ")");

        try {
            OrganizationalEntity l_load_entity = findByOrgCode(p_org_entity_to_save_or_update.getOrgCode());
            if(l_load_entity == null) {
                ELogger.info("Found new organization with code ("+p_org_entity_to_save_or_update.getOrgCode()+")");
                saveOrUpdate(p_org_entity_to_save_or_update);
            } else {
                ELogger.info("Found Duplication Organization with code ("+p_org_entity_to_save_or_update.getOrgCode()+")" +
                        " | Trying to update information .");
                removeOrg(l_load_entity.getOrgId());
                saveOrUpdateOrg(p_org_entity_to_save_or_update);
            }

        } catch (Exception ex) {
            ELogger.error("Problem while save|Update for Organization | Reason:",ex);
            throw new EarnifyBasedException("Problem while save|Update for Organization | Reason:",ex);
        }
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
    @Transactional(propagation = Propagation.REQUIRED)
    public void removeOrg(Long p_org_id_to_remove) {
        remove(find(p_org_id_to_remove));
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public OrganizationalEntity findByOrgCode(String p_org_code) {
        ELogger.info("Trying to find Organization by code ("+p_org_code+")");
        try {

            Query l_query = currentSession().createQuery("from OrganizationalEntity oe where oe.orgCode=:found_code");
            l_query.setParameter("found_code",p_org_code);
            return (OrganizationalEntity) l_query.uniqueResult();

        } catch (Exception ex) {
            ELogger.error("Unable to find Organization with code ("+p_org_code+") | Reason:",ex);
            throw new OrgByCodeNotFoundException("Unable to find Organization with code ("+p_org_code+") | Reason:",ex);
        }
    }


    //----------------------------------------------------------------------------------
}
