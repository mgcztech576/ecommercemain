package com.example.ecommercemain.signup;
import com.example.ecommercemain.domain.Product;
import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateProductList {@Id
    @GeneratedValue
    private String companyName;//회사 이름
    private Long price;
    private Long remainCount;//남은 개수
    private String pName;//물품 이름
    private String detail;//상세 설명
    private String category;//범름
    public static Product pfrom(CreateProductList cpl){
        Product product= Product.builder()
                .companyName(cpl.getCompanyName())
                .price(cpl.getPrice())
                .remainCount(cpl.getRemainCount())
                .pName(cpl.getPName())
                .detail(cpl.getDetail())
                .category(cpl.getCategory())
                .build();return product;}
}