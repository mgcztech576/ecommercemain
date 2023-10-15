package com.example.ecommercemain.domain;
import com.example.ecommercemain.signup.SellerSignUp;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor @Builder @Entity
@EntityListeners(AuditingEntityListener.class)
public class Seller extends Basis {@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sID;
    private Long sAccountNumber;
    private String sName;//판매자 이름
    private Long sPW;
    private Long sPhoneNumber;
    private String companyName;
    private String pName;//물품 이름
    public void sUpdate(SellerSignUp seSignUp){
        this.sName=seSignUp.getSName();
        this.sPW=seSignUp.getSPW();
        this.sPhoneNumber=seSignUp.getSPhoneNumber();
        this.companyName=seSignUp.getCompanyName();
        this.pName=seSignUp.getPName();
    }
//    public static Seller sfrom(SellerSignUp seSignUp){
//        return Seller.builder().sID(seSignUp.getSID())
//                .sAccountNumber(seSignUp.getSAccountNumber())
//                .sPW(seSignUp.getSPW())
//                .sName(seSignUp.getSName())
//                .sPhoneNumber(seSignUp.getSPhoneNumber())
//                .companyName(seSignUp.getCompanyName())
//                .productName(seSignUp.getProductName()).build();}
}