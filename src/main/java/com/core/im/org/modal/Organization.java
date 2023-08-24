package com.core.im.org.modal;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "org")
@Data
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    private String clientName;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfCreate;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "org_has_user",
            joinColumns = { @JoinColumn(name = "org_id") },
            inverseJoinColumns = { @JoinColumn(name = "user_id") }
    )
    private List<OrgUser> orgUserList;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "org_has_tenant",
            joinColumns = { @JoinColumn(name = "org_id") },
            inverseJoinColumns = { @JoinColumn(name = "tenant_id") }
    )
    private List<Tenant> tenantList;
}
