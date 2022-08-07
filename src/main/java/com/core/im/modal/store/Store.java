package com.core.im.modal.store;

import com.core.im.modal.product.Product;
import com.core.im.modal.shop.Shop;
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

import java.util.List;

@Entity
@Table(name = "store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private StoreAddress storeAddress;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "store_product",
            joinColumns = { @JoinColumn(name = "store_id") },
            inverseJoinColumns = { @JoinColumn(name = "product_id") }
    )
    private List<Product> products;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "store_shop",
            joinColumns = { @JoinColumn(name = "store_id") },
            inverseJoinColumns = { @JoinColumn(name = "shop_id") }
    )
    private List<Shop> shops;
}
