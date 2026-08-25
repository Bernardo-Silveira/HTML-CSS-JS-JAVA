package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api.model.Client;
import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByIdClient(Long id);

    Client findByNameAndEmailClient(String name, String email);

    List<Client> findByNameAndEmailClientsContainingIgnoreCase(String name, String email);
}