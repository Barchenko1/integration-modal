package com.core.im.modal.review;

import com.core.im.modal.post.Comment;
import com.core.im.modal.product.Product;
import com.core.im.modal.product.Rating;
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
@Table(name = "review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    private String advantage;
    private String flaw;
    @ManyToMany
    @JoinTable(
            name = "review_rating",
            joinColumns = { @JoinColumn(name = "review_id") },
            inverseJoinColumns = { @JoinColumn(name = "rating_id") }
    )
    private List<Rating> ratings;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "reviews")
    private List<Product> products;
    @ManyToOne(fetch = FetchType.LAZY)
    private Comment postComment;
}
