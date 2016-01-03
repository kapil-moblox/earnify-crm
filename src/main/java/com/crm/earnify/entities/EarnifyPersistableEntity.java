package com.crm.earnify.entities;

import com.crm.earnify.entities.audit.RowAuditInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Optional;

/**
 *
 * @param <PK>
 * @author sandeepandey
 */
@MappedSuperclass
public abstract class EarnifyPersistableEntity<PK extends Serializable> implements EarnifyBaseEntity<PK>  {

    private static final Logger LOG = LoggerFactory.getLogger(EarnifyPersistableEntity.class);

    private RowAuditInfo auditInfo;

    public boolean isNew() {
        return getID() == null;
    }

    //--------------------------------------------------------------------------

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object  o) {
        if (this == o) return true;
        if (!(o instanceof EarnifyPersistableEntity)) return false;

        EarnifyPersistableEntity that = (EarnifyPersistableEntity) o;

        if (getID() != null ? !getID().equals(that.getID()) : that.getID() != null) {
            return false;
        }
        return true;
    }

    //-------------------------------------------------------------------------------

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        Optional<PK> idOpt = Optional.of(getID());
        return idOpt.isPresent() ? idOpt.get().hashCode():0;
    }


    //------------------------------------------------------------------

    /**
     *
     * @return
     */
    public RowAuditInfo getAuditInfo() {
        return auditInfo;
    }

    //-------------------------------------------------------------------

    /**
     *
     * @param auditInfo
     */
    public void setAuditInfo(RowAuditInfo auditInfo) {
        this.auditInfo = auditInfo;
    }


    //-------------------------------------------------------------------------------

    /**
     *
     */
    public void assignID() {

    }

    //------------------------------------------------------------------------------
}
