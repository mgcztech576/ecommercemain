package com.example.ecommercemain.signup;
import com.example.ecommercemain.domain.Seller;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SellerSignUp { @Id//판매자용
    @GeneratedValue
    private String sName;
    private Long sPW;
    private Long sPhoneNumber;
    private String companyName;
    private String pName;
    public static Seller sfrom(SellerSignUp seSignUp){
        Seller seller=Seller.builder()
                .sPW(seSignUp.getSPW()).sName(seSignUp.getSName())
                .sPhoneNumber(seSignUp.getSPhoneNumber())
                .companyName(seSignUp.getCompanyName())
                .pName(seSignUp.getPName())
                .build(); return seller;}
}