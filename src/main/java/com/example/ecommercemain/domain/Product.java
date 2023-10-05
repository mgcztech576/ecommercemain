package com.example.ecommercemain.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@Builder @Entity
public class Product {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    private Long companyId;//판매자 id
    private String productName;
    private Long price;
    private Long numbers;//개수
}