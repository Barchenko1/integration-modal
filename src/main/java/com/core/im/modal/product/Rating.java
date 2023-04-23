package com.core.im.modal.product;

import com.core.im.constant.RatingEnum;
import com.core.im.modal.review.Review;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name = "rating")
@Data
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    private RatingEnum rating;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "ratings")
    private List<Review> reviews;
}
