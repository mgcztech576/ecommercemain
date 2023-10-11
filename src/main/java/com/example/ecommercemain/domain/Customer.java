package com.example.ecommercemain.domain;
import com.example.ecommercemain.signup.CustomerSignUp;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter @Setter @NoArgsConstructor
@AllArgsConstructor
@Builder @Entity
@EntityListeners(AuditingEntityListener.class)
public class Customer extends Basis {@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cID;
    private Long cAccountNumber;//고객 계좌 번호
    private String cName;
    private Long cPW;
    private Long cPhoneNumber;
    public static Customer cfrom(CustomerSignUp cSignUp){
        Customer customer= Customer.builder().cID(cSignUp.getCID())
                .cAccountNumber(cSignUp.getCAccountNumber())
                .cPW(cSignUp.getCPW()).cName(cSignUp.getCName())
                .cPhoneNumber(cSignUp.getCPhoneNumber())
                .build();return customer;}
}