package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;

    @OneToMany
    @JoinColumn(name = "order")
    private List<OrderItem> orderItems;

    private Date orderDate;
    private int total;
    private int count;

    @Entity
    @Table(name ="order_item")
    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class OrderItem {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int itemId;

        @ManyToOne
        private Order order;
        @ManyToOne
        @JoinColumn(name = "id")
        private Product product;
        private int quantity;
    }
}
