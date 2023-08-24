package com.core.im.tenant.modal.user;

import com.core.im.tenant.modal.bucket.Bucket;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

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
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfCreate;
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
