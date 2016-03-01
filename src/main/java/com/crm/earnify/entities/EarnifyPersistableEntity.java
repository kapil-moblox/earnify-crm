package com.crm.earnify.entities;

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


    //private RowAuditInfo auditInfo;


    public EarnifyPersistableEntity() {

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

        if (fetchKey() != null ? !fetchKey().equals(that.fetchKey()) : that.fetchKey() != null) {
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
        Optional<PK> idOpt = Optional.of(fetchKey());
        return idOpt.isPresent() ? idOpt.get().hashCode():0;
    }




    //-------------------------------------------------------------------------------

    /**
     *
     */
    public void assignID() {

    }

    //------------------------------------------------------------------------------

}
