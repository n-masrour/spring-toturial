package com.tutorial.spring.repository;

import com.tutorial.spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}