package com.example.ecommercemain.create_request_response;
import com.example.ecommercemain.domain.Basis;
import com.example.ecommercemain.domain.Customer;
import com.example.ecommercemain.signup.CustomerSignUp;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
public class CCARp extends Basis {@Id//CreateCustomerAccountResponse
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cID;
    private Long cAccountNumber;
    private String cName;
    private Long cPW;
    private Long cPhoneNumber;
    public static Customer cfrom(CustomerSignUp cSignUp){
        Customer customer=Customer.builder().cID(cSignUp.getCID())
                .cAccountNumber(cSignUp.getCAccountNumber())
                .cPW(cSignUp.getCPW()).cName(cSignUp.getCName())
                .cPhoneNumber(cSignUp.getCPhoneNumber())
                .build(); return customer;}
}