package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Customer;
import com.example.ecommercemain.repository.CustomerRepository;
import com.example.ecommercemain.signup.CustomerSignUp;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service @RequiredArgsConstructor
public class CustomerSignUpService {
    private final CustomerRepository customerRepository;
    public Customer signUp(CustomerSignUp cSignUp){
        return customerRepository.save(Customer.cfrom(cSignUp));}
}
