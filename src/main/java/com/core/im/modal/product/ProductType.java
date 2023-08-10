package com.core.im.modal.product;

import com.core.im.constant.BrandEnum;
import com.core.im.constant.ProductTypeEnum;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product_type")
@Data
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    @Column(name = "name", nullable = false)
    @Setter(AccessLevel.NONE)
    private String name;

    @Transient
    private ProductTypeEnum productType;

    public void setProductType(ProductTypeEnum productType) {
        this.productType = productType;
        this.name = productType.getValue();
    }
}
