package com.core.im.modal.tenant.entity.business;

import com.core.im.modal.tenant.entity.productinfo.ProductInfo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "store")
@Data
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    private BusinessAddress businessAddress;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "store_product",
            joinColumns = { @JoinColumn(name = "store_id") },
            inverseJoinColumns = { @JoinColumn(name = "product_id") }
    )
    private List<ProductInfo> productInfos;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "store_shop",
            joinColumns = { @JoinColumn(name = "store_id") },
            inverseJoinColumns = { @JoinColumn(name = "shop_id") }
    )
    private List<Shop> shops;
}
