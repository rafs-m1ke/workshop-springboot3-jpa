package com.rafsm1ke.api.repositories;

import com.rafsm1ke.api.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
