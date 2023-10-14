package com.example.ecommercemain.create_request_response;
import com.example.ecommercemain.domain.Basis;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CSARp extends Basis {@Id//CreateSellerAccountResponse
    @GeneratedValue
    private String sName;
    private Long sPW;
    private Long sPhoneNumber;
    private String companyName;
    private String productName;
}