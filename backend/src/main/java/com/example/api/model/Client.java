package com.example.api.model;

<<<<<<< HEAD
import jakarta.persistence.*;

@Entity
@Table
=======
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
>>>>>>> 984f4764b48fbc07fed2e1177b809cda2717b5df
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
<<<<<<< HEAD
    private String password;
=======
>>>>>>> 984f4764b48fbc07fed2e1177b809cda2717b5df

    public Client() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
<<<<<<< HEAD

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
=======
>>>>>>> 984f4764b48fbc07fed2e1177b809cda2717b5df
}