package com.Elevcraft.esp.monolith.userManagement.service;

import com.Elevcraft.esp.monolith.userManagement.entity.User;

public interface UserService {
    User createUser(User user);
    void updateUser();
    void deleteUser();
    void getUserById();
    Iterable<User> getAllUsers();
}
