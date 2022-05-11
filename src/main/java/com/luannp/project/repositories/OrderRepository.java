package com.luannp.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luannp.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
