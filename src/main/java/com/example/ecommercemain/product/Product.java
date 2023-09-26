package com.example.ecommercemain.product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@Builder @Entity
public class Product {@Id
@GeneratedValue
private Long id;
    private Long companyId;//판매자 id
    private String name;
    private Long price;
    private Long numbers;
}