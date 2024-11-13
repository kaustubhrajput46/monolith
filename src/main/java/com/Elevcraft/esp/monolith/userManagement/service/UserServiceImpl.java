package com.Elevcraft.esp.monolith.userManagement.service;

import com.Elevcraft.esp.monolith.userManagement.entity.User;
import com.Elevcraft.esp.monolith.userManagement.registry.UserRegistry;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
        private final UserRegistry userRegistry;

        public UserServiceImpl(UserRegistry userRegistry) {
                this.userRegistry = userRegistry;
        }

        // Create user
        public User createUser(CreateUserRequest createUserRequest) {
                return this.userRegistry.save(createUserRequest);
        }

        // Update user
        public User updateUser(UUID id, UpdateUserRequest updateUserRequest) {
                Optional<User> existingUser = this.userRegistry.findById(id);
                if(existingUser.isPresent()) {
                        return this.userRegistry.updatUser(updateUserRequest, existingUser.get());
                } else {
                        throw new RuntimeException("User not found");
                }
        }

        // Delete user
        public void deleteUser(UUID id) {
                Optional<User> user = this.userRegistry.findById(id);
                if(user.isPresent()) {
                        this.userRegistry.delete(user.get());
                } else {
                        throw new RuntimeException("User not found");
                }
        }

        // Get user by id
        public User getUserById(UUID id) {
              Optional<User> user = this.userRegistry.findById(id);
                if(user.isPresent()) {
                        return user.get();
                } else {
                        throw new RuntimeException("User not found");
                }
        }

        // Get all users
        public List<User> getAllUsers() {
                return this.userRegistry.findAll();
        }
}
