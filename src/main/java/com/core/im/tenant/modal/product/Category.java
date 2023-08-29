package com.core.im.tenant.modal.product;

import com.core.im.tenant.constant.CategoryEnum;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    @Column(name = "name", nullable = false)
    @Setter(AccessLevel.NONE)
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category parent;
    @OneToMany(mappedBy = "parent", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<Category> childCategoryList;

    @Transient
    private CategoryEnum categoryEnum;

    public void setCategoryEnum(CategoryEnum categoryEnum) {
        this.categoryEnum = categoryEnum;
        this.name = categoryEnum.getValue();
    }
}
