package com.crm.earnify.entities.user;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author sandeepandey
 * @version 1.0
 * @see com.crm.earnify.entities.EarnifyBaseEntity
 * @see com.crm.earnify.entities.EarnifyPersistableEntity
 *
 */
public class UserTypeEntity extends EarnifyPersistableEntity<Long> {

    private static final Logger ELogger = LoggerFactory.getLogger(UserTypeEntity.class);

    private Long id;
    private String userTypeCode;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_type_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "user_type_code")
    public String getUserTypeCode() {
        return userTypeCode;
    }

    public void setUserTypeCode(String userTypeCode) {
        this.userTypeCode = userTypeCode;
    }

    @Override
    public Long getID() {
        return null;
    }

    @Override
    public String toString() {
        return "UserTypeEntity{" +
                "id=" + id +
                ", userTypeCode='" + userTypeCode + '\'' +
                '}';
    }
}
