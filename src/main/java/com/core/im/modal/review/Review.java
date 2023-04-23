package com.core.im.modal.review;

import com.core.im.modal.post.Comment;
import com.core.im.modal.product.Product;
import com.core.im.modal.product.Rating;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
