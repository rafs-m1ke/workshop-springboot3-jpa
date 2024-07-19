package com.rafsm1ke.api.repositories;

import com.rafsm1ke.api.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
