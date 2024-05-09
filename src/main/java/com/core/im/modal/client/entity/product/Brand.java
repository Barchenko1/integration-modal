package com.core.im.modal.client.entity.product;

import com.core.im.modal.client.constant.BrandEnum;
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
@Table(name = "brand")
@Data
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    @Column(name = "name", nullable = false)
    @Setter(AccessLevel.NONE)
    private String name;

    @Transient
    private BrandEnum brandEnum;

    public void setBrandEnum(BrandEnum brandEnum) {
        this.brandEnum = brandEnum;
        this.name = brandEnum.getValue();
    }
}
