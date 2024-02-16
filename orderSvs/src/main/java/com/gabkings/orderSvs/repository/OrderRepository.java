package com.gabkings.orderSvs.repository;

import com.gabkings.orderSvs.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
