package com.example.ecommercemain.domain;
import com.example.ecommercemain.signup.SellerSignUp;
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
    private Long sAccountNumber;
    private String sName;
    private Long sPW;
    private Long sPhoneNumber;
    private String companyName;
    private String productName;
//    public static Seller sfrom(SellerSignUp seSignUp){
//        return Seller.builder().sID(seSignUp.getSID())
//                .sAccountNumber(seSignUp.getSAccountNumber())
//                .sPW(seSignUp.getSPW())
//                .sName(seSignUp.getSName())
//                .sPhoneNumber(seSignUp.getSPhoneNumber())
//                .companyName(seSignUp.getCompanyName())
//                .productName(seSignUp.getProductName()).build();}
}