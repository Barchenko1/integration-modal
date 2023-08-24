package com.core.im.tenant.modal.order;

import com.core.im.tenant.modal.product.Product;
import com.core.im.tenant.modal.user.AppUser;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "order_item")
@Data
public class OrderItem {
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
    @ManyToOne(fetch = FetchType.LAZY)
    private OrderAddress orderAddress;
    @ManyToOne(fetch = FetchType.LAZY)
    private OrderDetail orderDetails;
    @ManyToOne(fetch = FetchType.LAZY)
    private OrderStatus orderStatus;
}
