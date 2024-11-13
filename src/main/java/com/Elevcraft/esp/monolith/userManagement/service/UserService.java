package com.Elevcraft.esp.monolith.userManagement.service;

import com.Elevcraft.esp.monolith.userManagement.entity.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    User createUser(CreateUserRequest createUserRequest);
    User updateUser(UUID id, UpdateUserRequest updateUserRequest);
    void deleteUser(UUID id);
    User getUserById(UUID id);
    List<User> getAllUsers();
}
