package com.core.im.modal.product;

import com.core.im.constant.RateEnum;
import com.core.im.modal.review.Review;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "rating")
@Data
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    @Column(name = "rating", nullable = false)
    @Setter(AccessLevel.NONE)
    private int ratingValue;
    @Transient
    private RateEnum ratingEnum;

    public void setRating(RateEnum ratingEnum) {
        this.ratingEnum = ratingEnum;
        this.ratingValue = ratingEnum.getValue();
    }

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "ratings")
    private List<Review> reviews;
}
