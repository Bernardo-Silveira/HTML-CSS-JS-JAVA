package com.example.api.dto;

public record ClientResponse(
        Long id,
        String name,
        String email
) {
}