package com.example.ecommercemain.signup;
import com.example.ecommercemain.domain.Customer;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerSignUp{@Id//고객용
    @GeneratedValue
    private String cName;
    private Long cPW;
    private Long cPhoneNumber;
    private Long cAccountNumber;
    public static Customer cfrom(CustomerSignUp cSignUp){
        Customer customer=Customer.builder()
                .cPW(cSignUp.getCPW()).cName(cSignUp.getCName())
                .cPhoneNumber(cSignUp.getCPhoneNumber())
                .cAccountNumber(cSignUp.getCAccountNumber())
                .build(); return customer;}
}