package com.revature.services;

import com.revature.models.Order;
import com.revature.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    /**
     * Finds all orders with a particular userId on the database
     *
     * @param userId the id of the user
     * @return list of all orders for the user
     */
    public List<Order> findByUserId(int userId) {
        return orderRepository.findOrderByUserId(userId);
    }

    /**
     * Saves an order object to the database
     *
     * @param order the order to save
     * @return the order that was successfully saved
     */
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    /**
     * Finds all orders on the database
     *
     * @return a list of all orders
     */
    public List<Order> findAll() {
        return orderRepository.findAll();
    }
}
