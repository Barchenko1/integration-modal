package com.core.im.modal.product;

import com.core.im.constant.BrandEnum;
import com.core.im.constant.ProductTypeEnum;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product_type")
@Data
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    private String name;

    @Transient
    private ProductTypeEnum productType;

    public void setProductType(ProductTypeEnum productType) {
        this.productType = productType;
        this.name = productType.getValue();
    }
}
