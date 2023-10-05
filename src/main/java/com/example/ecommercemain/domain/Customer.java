package com.example.ecommercemain.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@Builder @Entity
public class Customer {@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long pw;
    private Long phoneNumber;
}