package com.example.demo.controller;

import com.example.demo.dto.ClientDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/clients")
@CrossOrigin(origins = "*")
public class ClientController {
    @PostMapping
    public ResponseEntity<String> cadastrar(@RequestBody ClientDTO dto) {
        // Lógica de persistência ou banco de dados aqui
        System.out.println("Received: " + dto.getName() + " - " + dto.getEmail());
        
        return ResponseEntity.ok("Client registered!");
    }
}