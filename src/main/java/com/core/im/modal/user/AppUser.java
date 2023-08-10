package com.core.im.modal.user;

import com.core.im.modal.bucket.Bucket;
import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "app_user")
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    private String username;
    private String password;
    private String email;
    @ManyToOne(fetch = FetchType.LAZY)
    private UserRole role;
    @ManyToOne(fetch = FetchType.LAZY)
    private UserAddress userAddress;
    @ManyToOne(fetch = FetchType.LAZY)
    private UserDetail userDetail;
    @ManyToOne(fetch = FetchType.LAZY)
    private UserPayment userPayment;
    @OneToOne(fetch = FetchType.LAZY)
    private Bucket bucket;
}
