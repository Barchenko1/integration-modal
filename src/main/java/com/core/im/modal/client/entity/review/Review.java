package com.core.im.modal.client.entity.review;

import com.core.im.modal.client.entity.product.Product;
import com.core.im.modal.client.entity.product.Rating;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "review")
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    private String advantage;
    private String flaw;
    private String message;
    private long dateOfCreate;
    @ManyToMany
    @JoinTable(
            name = "review_rating",
            joinColumns = { @JoinColumn(name = "review_id") },
            inverseJoinColumns = { @JoinColumn(name = "rating_id") }
    )
    private List<Rating> ratings;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "reviews")
    private List<Product> products;
}
