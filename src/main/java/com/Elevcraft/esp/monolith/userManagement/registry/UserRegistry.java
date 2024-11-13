package com.Elevcraft.esp.monolith.userManagement.registry;

import com.Elevcraft.esp.monolith.userManagement.entity.User;
import com.Elevcraft.esp.monolith.userManagement.repository.UserRepository;
import com.Elevcraft.esp.monolith.userManagement.service.CreateUserRequest;
import com.Elevcraft.esp.monolith.userManagement.service.UpdateUserRequest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UserRegistry {
    private final UserRepository userRepository;


    public UserRegistry(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(CreateUserRequest createUserRequest) {
        User userToCreate = new User();
        userToCreate.setFirstName(createUserRequest.getFirstName());
        userToCreate.setLastName(createUserRequest.getLastName());
        userToCreate.setEmail(createUserRequest.getEmail());
        userToCreate.setPassword(createUserRequest.getPassword());
        userToCreate.setRoles(createUserRequest.getRoles());
        userToCreate.setAddress(createUserRequest.getAddress());
        userToCreate.setCreatedOn(LocalDateTime.now());
        //TODO: Change this to the actual user
        userToCreate.setCreatedBy("ADMIN");
        userToCreate.setLastModifiedOn(LocalDateTime.now());
        userToCreate.setLastModifiedBy("ADMIN");
        return this.userRepository.save(userToCreate);
    }

    public Optional<User> findById(UUID id) {
        return this.userRepository.findById(id);
    }

    public User updatUser(UpdateUserRequest updateUserRequest, User existingUser) {
        existingUser.setFirstName(updateUserRequest.getFirstName());
        existingUser.setLastName(updateUserRequest.getLastName());
        existingUser.setAddress(updateUserRequest.getAddress());
        //TODO: Change this to the actual user
        existingUser.setLastModifiedBy("ADMIN");
        existingUser.setLastModifiedOn(LocalDateTime.now());

        return this.userRepository.save(existingUser);
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public void delete(User user) {
        this.userRepository.delete(user);
    }
}
