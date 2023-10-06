package com.example.ecommercemain.domain;
import jakarta.persistence.*;
import lombok.*;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@Builder @Entity
public class Product {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long companyId;//판매자 id
    @Enumerated(EnumType.STRING)
    private String productName;
    private Long price;
    private Long numbers;//개수
}