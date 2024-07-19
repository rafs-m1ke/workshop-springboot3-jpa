package com.rafsm1ke.api.repositories;

import com.rafsm1ke.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
