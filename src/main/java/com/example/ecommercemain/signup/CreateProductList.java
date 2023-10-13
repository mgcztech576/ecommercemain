package com.example.ecommercemain.signup;
import com.example.ecommercemain.domain.Product;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
public class CreateProductList {@Id
@GeneratedValue
    private Long pID;//물품 id
    private Long companyName;//판매자 id
    private Long price;
    private Long remainCount;//남은 개수
    private String pName;
    private String detail;//상세 설명
    private String category;//분류
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