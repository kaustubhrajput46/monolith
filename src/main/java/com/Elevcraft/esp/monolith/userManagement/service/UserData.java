package com.Elevcraft.esp.monolith.userManagement.service;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@Schema(description = "User data")
public class UserData {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    private String roles;

    @NotNull
    @Valid
    private String address;

    public @NotNull String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotNull String firstName) {
        this.firstName = firstName;
    }

    public @NotNull String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull String lastName) {
        this.lastName = lastName;
    }

    public @NotNull String getEmail() {
        return email;
    }

    public void setEmail(@NotNull String email) {
        this.email = email;
    }

    public @NotNull String getPassword() {
        return password;
    }

    public void setPassword(@NotNull String password) {
        this.password = password;
    }

    public @NotNull String getRoles() {
        return roles;
    }

    public void setRoles(@NotNull String roles) {
        this.roles = roles;
    }

    public @NotNull @Valid String getAddress() {
        return address;
    }

    public void setAddress(@NotNull @Valid String address) {
        this.address = address;
    }

}
