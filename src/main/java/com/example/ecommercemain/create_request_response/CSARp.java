package com.example.ecommercemain.create_request_response;
import com.example.ecommercemain.domain.Basis;
import com.example.ecommercemain.domain.Seller;
import com.example.ecommercemain.signup.SellerSignUp;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
public class CSARp extends Basis {@Id//CreateSellerAccountResponse
    @GeneratedValue
    private Long sID;
    private Long sAccountNumber;
    private String sName;
    private Long sPW;
    private Long sPhoneNumber;
    private String companyName;
    private String productName;
    public static Seller sfrom(SellerSignUp seSignUp){
        Seller seller=Seller.builder().sID(seSignUp.getSID())
                .sAccountNumber(seSignUp.getSAccountNumber())
                .sPW(seSignUp.getSPW()).sName(seSignUp.getSName())
                .sPhoneNumber(seSignUp.getSPhoneNumber())
                .companyName(seSignUp.getCompanyName())
                .productName(seSignUp.getProductName())
                .build(); return seller;}
}