package com.calorigo.service;

import com.calorigo.model.Order;
import java.util.List;
import java.util.Optional;

public interface OrderService {
    Order placeOrder(Order order);
    List<Order> getAllOrders();
    Optional<Order> getOrderById(Long id);
    List<Order> getOrdersByUser(Long userId);
    void cancelOrder(Long id);
}

