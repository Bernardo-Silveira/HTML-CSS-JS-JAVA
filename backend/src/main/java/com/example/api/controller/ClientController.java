package com.example.api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Client;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/clients")
@CrossOrigin
public class ClientController {

    @PostMapping
    public Client postMethodName(@RequestBody Client client) {
        System.out.println("Name: " + client.getName());
        System.out.println("Email: " + client.getEmail());

        return client;
    }
    
}