package com.core.im.tenant.modal.liked;

import com.core.im.tenant.modal.product.Product;
import com.core.im.tenant.modal.user.AppUser;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "liked")
@Data
public class Liked {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfCreate;
    @ManyToOne(fetch = FetchType.LAZY)
    private AppUser user;
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;
}
