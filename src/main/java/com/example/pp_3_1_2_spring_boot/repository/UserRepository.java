package com.example.pp_3_1_2_spring_boot.repository;

import com.example.pp_3_1_2_spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
