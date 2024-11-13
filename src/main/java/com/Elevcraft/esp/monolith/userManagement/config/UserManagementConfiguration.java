package com.Elevcraft.esp.monolith.userManagement.config;

import com.Elevcraft.esp.monolith.userManagement.registry.UserRegistry;
import com.Elevcraft.esp.monolith.userManagement.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserManagementConfiguration {

    @Bean
    public UserRegistry userRegistry(UserRepository userRepository) {
        return new UserRegistry(userRepository);
    }
}
