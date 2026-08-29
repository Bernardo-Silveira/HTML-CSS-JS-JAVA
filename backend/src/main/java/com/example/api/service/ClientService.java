package com.example.api.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.api.model.Client;
import com.example.api.repository.ClientRepository;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public ClientService(
            ClientRepository clientRepository,
            BCryptPasswordEncoder passwordEncoder) {

        this.clientRepository = clientRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Client register(Client client) {

        if (clientRepository.existsByEmail(client.getEmail())) {
            throw new IllegalArgumentException("Email already registered");
        }

        client.setPassword(
            passwordEncoder.encode(client.getPassword())
        );

        return clientRepository.save(client);
    }
}