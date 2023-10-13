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
public class CCARp extends Basis {@Id//CreateCustomerAccountResponse
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cName;
    private Long cPW;
    private Long cPhoneNumber;
}