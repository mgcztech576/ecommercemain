package com.example.ecommercemain.signup;
import com.example.ecommercemain.domain.Customer;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerSignUp{//고객용
    private String cName;
    private Long cPW;
    private Long cPhoneNumber;
    public static Customer cfrom(CustomerSignUp cSignUp){
        Customer customer=Customer.builder()
                .cPW(cSignUp.getCPW()).cName(cSignUp.getCName())
                .cPhoneNumber(cSignUp.getCPhoneNumber())
                .build(); return customer;}
}