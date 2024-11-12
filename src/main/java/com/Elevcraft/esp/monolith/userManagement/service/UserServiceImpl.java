package com.Elevcraft.esp.monolith.userManagement.service;

import com.Elevcraft.esp.monolith.userManagement.entity.User;
import com.Elevcraft.esp.monolith.userManagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
        public User updateUser(UUID id, User user) {
                Optional<User> existingUser = this.userRepository.findById(id);
                if(existingUser.isPresent()) {
                        User userToUpdate = existingUser.get();
                        userToUpdate.setFirstName(user.getFirstName());
                        userToUpdate.setLastName(user.getLastName());
                        userToUpdate.setEmail(user.getEmail());
                        userToUpdate.setPassword(user.getPassword());
                        userToUpdate.setRoles(user.getRoles());
                        userToUpdate.setAddress(user.getAddress());
                        userToUpdate.setLastModifiedBy(user.getLastModifiedBy());
                        return this.userRepository.save(userToUpdate);
                } else {
                        throw new RuntimeException("User not found");
                }
        }

        // Delete user
        public void deleteUser(UUID id) {
                Optional<User> user = this.userRepository.findById(id);
                if(user.isPresent()) {
                        this.userRepository.delete(user.get());
                } else {
                        throw new RuntimeException("User not found");
                }
        }

        // Get user by id
        public User getUserById(UUID id) {
              Optional<User> user = this.userRepository.findById(id);
                if(user.isPresent()) {
                        return user.get();
                } else {
                        throw new RuntimeException("User not found");
                }
        }

        // Get all users
        public List<User> getAllUsers() {
                return this.userRepository.findAll();
        }
}
