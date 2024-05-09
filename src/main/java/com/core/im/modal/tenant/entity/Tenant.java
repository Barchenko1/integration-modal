package com.core.im.modal.tenant.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tenant")
@Data
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    private String name;
    private long dateOfCreate;
    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinTable(
            name = "tenant_has_org",
            joinColumns = { @JoinColumn(name = "tenant_id") },
            inverseJoinColumns = { @JoinColumn(name = "org_id") }
    )
    private List<Organization> organizationList;
    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    )
    @JoinTable(
            name = "tenant_has_tenantconfiguration",
            joinColumns = { @JoinColumn(name = "tenant_id") },
            inverseJoinColumns = { @JoinColumn(name = "tenantconfiguration_id") }
    )
    private List<TenantConfiguration> tenantConfigurationList;


}
