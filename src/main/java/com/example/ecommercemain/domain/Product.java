package com.example.ecommercemain.domain;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@Builder @Entity
@EntityListeners(AuditingEntityListener.class)
public class Product extends Basis {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pID;//물품 id
    private Long companyName;//회사 이름
    private Long price;
    private Long remainCount;//남은 개수
    private String pName; //물품 이름
    private String detail;//상세 설명
    private String category;//범주
}