package com.crm.earnify.entities.user.system;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.crm.earnify.entities.org.OrganizationalEntity;
import com.crm.earnify.entities.user.UserTypeEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;

/**
 * @author sandeepandey
 * @version 1.0
 * @see com.crm.earnify.entities.EarnifyBaseEntity
 */
public class SystemUserEntity extends EarnifyPersistableEntity<Long> {

    private static final Logger ELogger = LoggerFactory.getLogger(SystemUserEntity.class);

    private Long           id;
    private UserTypeEntity userType;
    private String userName;
    private String userCode;
    private OrganizationalEntity fromOrganization;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id",nullable = false,unique = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_type_id")
    public UserTypeEntity getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEntity userType) {
        this.userType = userType;
    }

    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "user_code")
    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "org_id")
    public OrganizationalEntity getFromOrganization() {
        return fromOrganization;
    }

    public void setFromOrganization(OrganizationalEntity fromOrganization) {
        this.fromOrganization = fromOrganization;
    }

    @Override
    public Long getID() {
        return null;
    }

    @Override
    public String toString() {
        return "SystemUserEntity{" +
                "id=" + id +
                ", userType=" + userType +
                ", userName='" + userName + '\'' +
                ", userCode='" + userCode + '\'' +
                ", fromOrganization=" + fromOrganization +
                '}';
    }
}
