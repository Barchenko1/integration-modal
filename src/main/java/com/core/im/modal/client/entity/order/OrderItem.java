package com.core.im.modal.client.entity.order;

import com.core.im.modal.client.entity.payment.Payment;
import com.core.im.modal.client.entity.product.Product;
import com.core.im.modal.client.entity.user.AppUser;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "order_item")
@Data
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    private long dateOfCreate;
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
    @ManyToOne(fetch = FetchType.LAZY)
    private Payment payment;
}
