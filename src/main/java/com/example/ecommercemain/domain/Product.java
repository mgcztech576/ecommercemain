package com.example.ecommercemain.domain;
import jakarta.persistence.*;
import lombok.*;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@Builder @Entity
public class Product extends Basis {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pID;//물품 id
    private Long companyID;//판매자 id
    private Long price;
    private Long count;//개수
    private String productName;
    private String detail;//상세 설명
    private String category;//분류
}