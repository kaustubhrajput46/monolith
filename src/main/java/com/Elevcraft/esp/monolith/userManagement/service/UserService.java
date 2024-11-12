package com.Elevcraft.esp.monolith.userManagement.service;

import com.Elevcraft.esp.monolith.userManagement.entity.User;

import java.util.UUID;

public interface UserService {
    User createUser(User user);
    User updateUser(UUID id, User user);
    void deleteUser(UUID id);
    User getUserById(UUID id);
    Iterable<User> getAllUsers();
}
