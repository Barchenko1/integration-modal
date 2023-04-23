package com.core.im.modal.option;

import com.core.im.modal.product.Product;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name = "option_item")
@Data
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Product> products;
    @ManyToOne(fetch = FetchType.LAZY)
    private OptionGroup optionGroup;
}
