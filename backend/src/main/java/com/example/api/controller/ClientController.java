package com.example.api.controller;

<<<<<<< HEAD
import com.example.api.model.Client;
import com.example.api.repository.ClientRepository;

import org.springframework.web.bind.annotation.RestController;
=======
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Client;
import com.example.api.repository.ClientRepository;

>>>>>>> 984f4764b48fbc07fed2e1177b809cda2717b5df
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/clients")
@CrossOrigin
public class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        System.out.println("Name: " + client.getName());
        System.out.println("Email: " + client.getEmail());
<<<<<<< HEAD
        System.out.println("Password: " + client.getPassword());

        return clientRepository.save(client);
    }   
=======

        return clientRepository.save(client);
    }
    
>>>>>>> 984f4764b48fbc07fed2e1177b809cda2717b5df
}