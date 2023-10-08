package com.example.ecommercemain.domain;
import jakarta.persistence.*;
import lombok.*;
@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@Builder @Entity
public class Customer extends Basis {@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cID;
    private String cName;
    private Long cPW;
    private Long cPhoneNumber;
    public static Customer cfrom(CSignUp cform){
        return Customer.builder().cID(cform.getCID())
                .cPW(cform.getCPW())
                .cName(cform.getCName())
                .cPhoneNumber(cform.getCPhoneNumber()).build();
    }
}