package com.core.im.modal.product;

import com.core.im.constant.RatingEnum;
import com.core.im.modal.review.Review;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "rating")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    private RatingEnum rating;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "ratings")
    private List<Review> reviews;
}
