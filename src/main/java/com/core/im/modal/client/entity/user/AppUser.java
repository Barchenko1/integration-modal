package com.core.im.modal.client.entity.user;

import com.core.im.tenant.modal.bucket.Bucket;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Data;

import lombok.AllArgsConstructor;
import lombok.Builder;
@Entity
@Table(name = "app_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    private String username;
    private String password;
    private String email;
    private long dateOfCreate;
    private boolean isActive;
    @ManyToOne(fetch = FetchType.LAZY)
    private UserRole role;
    @ManyToOne(fetch = FetchType.LAZY)
    private UserAddress userAddress;
    @ManyToOne(fetch = FetchType.LAZY)
    private UserDetail userDetail;
    @ManyToOne(fetch = FetchType.LAZY)
    private UserPayment userPayment;
}
