package com.core.im.modal.product;

import com.core.im.constant.BrandEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Setter;

@Entity
@Table(name = "brand")
@Setter
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    private String name;

    @Transient
    private BrandEnum brandEnum;

    public void setBrandEnum(BrandEnum brandEnum) {
        this.brandEnum = brandEnum;
        this.name = brandEnum.getValue();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
