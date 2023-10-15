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
    private String cName;//고객 이름
    private Long cPW;
    private Long cPhoneNumber;
    public void cUpdate(CustomerSignUp cSignUp){
        this.cName=cSignUp.getCName();
        this.cPW=cSignUp.getCPW();
        this.cPhoneNumber=cSignUp.getCPhoneNumber();}
}