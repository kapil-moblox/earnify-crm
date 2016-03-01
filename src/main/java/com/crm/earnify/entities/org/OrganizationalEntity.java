package com.crm.earnify.entities.org;

import com.crm.earnify.entities.EarnifyPersistableEntity;
import com.crm.earnify.entities.app.AppEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "org_master",uniqueConstraints = {@UniqueConstraint(columnNames = "org_code")},catalog = "earnifydb")
public class OrganizationalEntity extends EarnifyPersistableEntity<Integer> {

    private static final Logger LOG = LoggerFactory.getLogger(OrganizationalEntity.class);
    private Long orgId;
    private String orgName;
    private String orgCode;
    private String description;
    private Collection<AppEntity> lunchedApps ;


    @Id
    @Column(name = "org_id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }


    @Column(name = "org_description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public Integer fetchKey() {
        return null;
    }

    @Column(name = "org_name")
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Column(name = "org_code",unique = true,nullable = false)
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


    public void setLunchedApps(Collection<AppEntity> lunchedApps) {
        this.lunchedApps = lunchedApps;
    }
}
