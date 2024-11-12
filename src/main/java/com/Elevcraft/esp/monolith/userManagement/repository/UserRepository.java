package com.Elevcraft.esp.monolith.userManagement.repository;

import com.Elevcraft.esp.monolith.userManagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
