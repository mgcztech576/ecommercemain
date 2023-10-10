package com.example.ecommercemain.signup;
import com.example.ecommercemain.domain.Customer;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)
public class CustomerSignUp {@Id//고객용
    @GeneratedValue
    private Long cID;
    private String cName;
    private Long cPW;
    private Long cPhoneNumber;
    public static Customer cfrom(CustomerSignUp cSignUp){
        Customer customer=Customer.builder().cID(cSignUp.getCID())
                .cPW(cSignUp.getCPW()).cName(cSignUp.getCName())
                .cPhoneNumber(cSignUp.getCPhoneNumber()).build(); return customer;}
}