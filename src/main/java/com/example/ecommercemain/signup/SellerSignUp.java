package com.example.ecommercemain.signup;
import com.example.ecommercemain.domain.Customer;
import com.example.ecommercemain.domain.Seller;
import lombok.Getter;
@Getter
public class SellerSignUp {
    private Long sID;
    private String sName;
    private Long sPW;
    private Long sPhoneNumber;
    private String companyName;
    private String productName;
    public static Seller sfrom(SellerSignUp seSignUp){
        Seller seller=Seller.builder().sID(seSignUp.getSID())
                .sPW(seSignUp.getSPW()).sName(seSignUp.getSName())
                .sPhoneNumber(seSignUp.getSPhoneNumber())
                .companyName(seSignUp.getCompanyName())
                .productName(seSignUp.getProductName())
                .build(); return seller;}
}