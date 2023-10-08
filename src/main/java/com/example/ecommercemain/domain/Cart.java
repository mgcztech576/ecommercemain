package com.example.ecommercemain.domain;
import jakarta.persistence.*;
import lombok.*;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@Builder @Entity(name = "cart")
public class Cart extends Basis{ @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cID;
    private String cartProductName;
    private Long numbers;//개수
    private Long productId;//판매자 id
}