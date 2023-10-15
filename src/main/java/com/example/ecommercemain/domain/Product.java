package com.example.ecommercemain.domain;
import com.example.ecommercemain.signup.CreateProductList;
import com.example.ecommercemain.signup.CustomerSignUp;
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
    public void pUpdate(CreateProductList cpl){
        this.companyName=cpl.getCompanyName();
        this.price=cpl.getPrice();
        this.remainCount=cpl.getRemainCount();
        this.pName=cpl.getPName();
        this.detail=cpl.getDetail();
        this.category=cpl.getCategory();}
}