/*  Copyright 2016 Jasper Infotech (P) Limited . All Rights Reserved.
 *  JASPER INFOTECH PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
*/  
package com.crm.earnify.daos.org;

import com.crm.earnify.daos.IGenericEarnifyDao;
import com.crm.earnify.entities.org.OrganizationalEntity;

/**
 *  @version     1.0, 20/2/16
 *  @author sandeepandey
 */

public interface IOrgDAO extends IGenericEarnifyDao<OrganizationalEntity,Long> {

    //------------------------------------------------------------------------------------

    /**
     * Handy method to perform Save|Update for an organization.
     * @param p_org_entity_to_save_or_update
     */
    public void saveOrUpdateOrg(OrganizationalEntity p_org_entity_to_save_or_update);

    //-------------------------------------------------------------------------------------

    /**
     * Handy method to check whether this Org is new or not.
     * @param p_org_id
     */
    public void isNewOrg(Long p_org_id);

    //-------------------------------------------------------------------------------------

    /**
     * Handy method for removing organization from our system.
     * @param p_org_id_to_remove - Org Id which is to be remove
     */
    public void removeOrg(Long p_org_id_to_remove);
}
