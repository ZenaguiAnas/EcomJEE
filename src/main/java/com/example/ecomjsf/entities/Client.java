package com.example.ecomjsf.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    public Client(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Client() {
    }

    public Long getClientId() {
        return id;
    }

    public void setClientId(Long id) {
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
}
