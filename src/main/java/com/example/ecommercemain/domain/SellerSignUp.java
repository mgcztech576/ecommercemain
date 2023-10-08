package com.example.ecommercemain.domain;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
@Getter
public class SellerSignUp {@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sID;
    private String sName;
    private Long sPW;
    private Long sPhoneNumber;
    private Long companyName;
    private Long productName;
}
