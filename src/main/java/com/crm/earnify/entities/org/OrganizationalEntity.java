package com.crm.earnify.entities.org;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.crm.earnify.entities.app.AppEntity;
import com.crm.earnify.entities.user.system.SystemUserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "organization_master")
public class OrganizationalEntity extends EarnifyPersistableEntity<Integer> {

    private static final Logger LOG = LoggerFactory.getLogger(OrganizationalEntity.class);
    private Integer id;
    private String orgName;
    private String orgCode;
    private String description;
    private Collection<AppEntity> lunchedApps ;
    private Collection<SystemUserEntity> attachSystemUsers;
    @Id
    @Column(name = "org_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public Integer getID() {
        return null;
    }

    @Column(name = "org_name")
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Column(name = "org_code")
    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "fromOrganization",cascade = CascadeType.ALL)
    public Collection<AppEntity> getLunchedApps() {
        return lunchedApps;
    }

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "fromOrganization",cascade = CascadeType.ALL)
    public Collection<SystemUserEntity> getAttachSystemUsers() {
        return attachSystemUsers;
    }

    public void setAttachSystemUsers(Collection<SystemUserEntity> attachSystemUsers) {
        this.attachSystemUsers = attachSystemUsers;
    }

    public void setLunchedApps(Collection<AppEntity> lunchedApps) {
        this.lunchedApps = lunchedApps;
    }

    @Override
    public String toString() {
        return "OrganizationalEntity{" +
                "id=" + id +
                ", orgName='" + orgName + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", description='" + description + '\'' +
                ", lunchedApps=" + lunchedApps +
                ", attachSystemUsers=" + attachSystemUsers +
                '}';
    }
}
