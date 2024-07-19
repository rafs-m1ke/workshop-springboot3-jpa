package com.rafsm1ke.api.repositories;

import com.rafsm1ke.api.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
