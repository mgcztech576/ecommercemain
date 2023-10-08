package com.example.ecommercemain.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor @Builder @Entity
public class Seller {@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sID;
    private String sName;
    private Long sPW;
    private Long sPhoneNumber;
    private Long productName;}