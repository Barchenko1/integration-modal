package com.core.im.modal.tenant.entity.productinfo;

import com.core.im.modal.client.entity.option.Option;
import com.core.im.modal.client.entity.post.Post;
import com.core.im.modal.client.entity.product.Brand;
import com.core.im.modal.client.entity.product.Category;
import com.core.im.modal.client.entity.product.Discount;
import com.core.im.modal.client.entity.product.ProductStatus;
import com.core.im.modal.client.entity.product.ProductType;
import com.core.im.modal.client.entity.review.Review;
import com.core.im.modal.tenant.entity.business.Shop;
import com.core.im.modal.tenant.entity.business.Store;
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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "product_info")
@Data
public class ProductInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    private String name;
    private long dateOfCreate;
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductType productType;
    @ManyToOne(fetch = FetchType.LAZY)
    private Brand brand;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductStatus status;
    @ManyToOne(fetch = FetchType.LAZY)
    private Discount discount;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "products")
    private List<Shop> shops;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "products")
    private List<Store> stores;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "product_option",
            joinColumns = {@JoinColumn(name = "product_id")},
            inverseJoinColumns = {@JoinColumn(name = "option_item_id")}
    )
    private List<Option> options;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "product_review",
            joinColumns = {@JoinColumn(name = "product_id")},
            inverseJoinColumns = {@JoinColumn(name = "review_id")}
    )
    private List<Review> reviews;
    @OneToMany(
            cascade = CascadeType.PERSIST,
            orphanRemoval = true
    )
    private List<Post> posts;
}
