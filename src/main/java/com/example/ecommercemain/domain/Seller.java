package com.example.ecommercemain.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor @Builder @Entity
public class Seller extends Basis {@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sID;
    private String sName;
    private Long sPW;
    private Long sPhoneNumber;
    private String companyName;
    private Long productName;
    public static Customer sfrom(SellerSignUp sform){
        return Customer.builder().sID(sform.getSID())
                .sPW(sform.getSPW()).sName(sform.getSName())
                .sPhoneNumber(sform.getSPhoneNumber())
                .companyName(sform.getCompanyName())
                .productName(sform.getProductName()).build();
    }
}