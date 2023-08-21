package com.core.im.tenant.modal.product;

import com.core.im.tenant.constant.ProductTypeEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AccessLevel;
import lombok.Data;
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
