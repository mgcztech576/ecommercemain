package com.example.ecommercemain.internetcart;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@Builder @Entity
public class InternetCart { @Id
    @GeneratedValue
    private Long id;
    private Long userId;
    private Long productNumbers;//개수
    private Long productId;//판매자 id
}