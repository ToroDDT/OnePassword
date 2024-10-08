package com.example.SpringBootSecurityAPI.Models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AccountDTO {

    @NotNull(message = "Email is required.")
    @Size(min = 1, message = "Email is required.")
    @Email(message = "Email is not well formatted.")
    private String email;

    @NotNull(message = "Password is required.")
    @Size(min = 6, message = "Password should be at least 6 characters.")
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
