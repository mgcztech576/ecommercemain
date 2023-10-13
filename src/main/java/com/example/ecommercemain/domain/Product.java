package com.example.ecommercemain.domain;
import com.example.ecommercemain.signup.CreateProductList;
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
    private Long companyID;//판매자 id
    private Long price;
    private Long remainCount;//남은 개수
    private String productName;
    private String detail;//상세 설명
    private String category;//분류
//    public static Product pfrom(CreateProductList cpl){
//        Product product= Product.builder().pID(cpl.getPID())
//                .companyID(cpl.getCompanyID())
//                .price(cpl.getPrice())
//                .remainCount(cpl.getRemainCount())
//                .productName(cpl.getProductName())
//                .detail(cpl.getDetail())
//                .category(cpl.getCategory())
//                .build();return product;}
}