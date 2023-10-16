package com.example.ecommercemain.create_request_response;
import com.example.ecommercemain.domain.Basis;
import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CCARp extends Basis {@Id//CreateCustomerAccountResponse
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cName;
    private Long cPW;
    private Long cPhoneNumber;
    private Long cAccountNumber;
}