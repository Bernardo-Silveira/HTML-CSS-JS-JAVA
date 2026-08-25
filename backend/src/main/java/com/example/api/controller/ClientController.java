package com.example.api.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.api.model.Client;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @PostMapping
    public Client createClient(@RequestBody Client client) {

        System.out.println("Nome: " + client.getName());
        System.out.println("Email: " + client.getEmail());

        return client;
    }
}