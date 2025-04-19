package com.restaurante_rio.resto.repository;

import com.restaurante_rio.resto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> finalByEmail(String email);
}
