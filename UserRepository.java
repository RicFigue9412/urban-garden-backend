package com.example.urbangarden.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.urbangarden.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
