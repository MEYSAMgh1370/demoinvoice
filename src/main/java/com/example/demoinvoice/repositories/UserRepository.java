package com.example.demoinvoice.repositories;

import com.example.demoinvoice.models.authentication.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}