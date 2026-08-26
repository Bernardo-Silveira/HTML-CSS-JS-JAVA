package com.example.api.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.api.model.Client;
import com.example.api.repository.ClientRepository;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client register(Client client) {
        String passwordHash = passwordEncoder.encode(client.getPassword());

        client.setPassword(passwordHash);
        return clientRepository.save(client);
    }
}
