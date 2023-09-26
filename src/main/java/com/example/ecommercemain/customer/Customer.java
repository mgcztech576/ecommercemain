package com.example.ecommercemain.customer;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@Builder @Entity
public class Customer {@Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long pw;
}