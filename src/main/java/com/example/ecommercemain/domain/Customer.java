package com.example.ecommercemain.domain;
import jakarta.persistence.*;
import lombok.*;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@Builder @Entity
public class Customer {@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cId;
    private String cName;
    private Long cPW;
    private Long cPhoneNumber;
}