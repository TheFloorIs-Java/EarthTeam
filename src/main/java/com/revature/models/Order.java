package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * represents an order. Contains inner class that represents a particular item within that order.
 * @author Matt Hill
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId")
    private List<OrderItem> orderItems;

    private Date orderDate;
    private int total;
    private int count;



    /**
     * inner class that represents a particular item within the order.
     * @author Matt Hill
     */
    @Entity
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Table(name = "order_items")
    public static class OrderItem {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @ManyToOne
        @JoinColumn(name = "product_id")
        private Product product;
        private int quantity;
    }
}
