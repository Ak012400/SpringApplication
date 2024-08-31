package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Service
@Entity
public class Student {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    
    
    
}

