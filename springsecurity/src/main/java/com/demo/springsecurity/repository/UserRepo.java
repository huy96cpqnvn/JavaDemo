package com.demo.springsecurity.repository;

import com.demo.springsecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
}
