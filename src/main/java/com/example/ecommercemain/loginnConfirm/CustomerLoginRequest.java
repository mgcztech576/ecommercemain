package com.example.ecommercemain.loginnConfirm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerLoginRequest {
    private String cName;
    private Long cPW;
}