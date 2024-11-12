package com.Elevcraft.esp.monolith.userManagement.service;

import com.Elevcraft.esp.monolith.userManagement.entity.User;
import com.Elevcraft.esp.monolith.userManagement.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
        private final UserRepository userRepository;

        public UserServiceImpl(UserRepository userRepository) {
                this.userRepository = userRepository;
        }

        // Create user
        public User createUser(User user) {
                return this.userRepository.save(user);
        }

        // Update user
        public void updateUser() {

        }

        // Delete user
        public void deleteUser() {

        }

        // Get user by id
        public void getUserById() {

        }

        // Get all users
        public Iterable<User> getAllUsers() {
                return this.userRepository.findAll();
        }
}
