package com.example.authapi.domain.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
