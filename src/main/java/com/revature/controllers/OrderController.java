package com.revature.controllers;

import com.revature.annotations.Authorized;
import com.revature.dtos.ProductInfo;
import com.revature.models.Order;
import com.revature.models.Product;
import com.revature.services.OrderService;
import com.revature.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/order")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:3000"}, allowCredentials = "true")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {this.orderService = orderService;}


    /**
     * Returns all orders from the database
     *
     * @Author Matt Hill
     * @return list of all orders
     */
    @GetMapping("/")
    public ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.ok(orderService.findAll());
    }

    /**
     * Returns all orders for a particular user from the database
     *
     * @param userId the id of the user
     * @Author Matt Hill
     * @return list of all orders for user with userId
     */
    @GetMapping("/{userId}")
    public ResponseEntity<List<Order>> getOrdersByUserId(@PathVariable("userId") int userId) {
        return ResponseEntity.ok(orderService.findByUserId(userId));
    }

    /**
     * Posts an order to the database
     *
     * @param order the order to post
     * @Author Matt Hill
     * @return the order that was successfully posted
     */
    @PostMapping
    public ResponseEntity<Order> postOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.saveOrder(order));
    }


}
