package com.luannp.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luannp.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
