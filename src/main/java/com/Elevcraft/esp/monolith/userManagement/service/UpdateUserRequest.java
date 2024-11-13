package com.Elevcraft.esp.monolith.userManagement.service;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class UpdateUserRequest {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

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

    public @NotNull @Valid String getAddress() {
        return address;
    }

    public void setAddress(@NotNull @Valid String address) {
        this.address = address;
    }
}
