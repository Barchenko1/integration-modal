package com.core.im.modal.order;

import com.core.im.modal.product.Product;
import com.core.im.modal.user.AppUser;
import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_item")
@Data
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
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