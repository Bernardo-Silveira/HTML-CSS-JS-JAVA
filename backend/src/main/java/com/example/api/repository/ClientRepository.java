package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}