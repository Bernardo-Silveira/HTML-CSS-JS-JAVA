package com.example.api.controller;

import com.example.api.dto.ClientResponse;
import com.example.api.model.Client;
import com.example.api.service.ClientService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientResponse createClient(@Valid @RequestBody Client client) {
        Client savedClient = clientService.register(client);
        return new ClientResponse(
            savedClient.getId(),
            savedClient.getName(),
            savedClient.getEmail()
        );
    }
}