package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Customer;
import com.example.ecommercemain.repository.CustomerRepository;
import com.example.ecommercemain.signup.CustomerSignUp;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service @RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    //@Transactional public createCustomer(CustomerSignUp cSignUp){
        //Customer customer=Customer.builder().build();
       // Customer save= customerRepository.save(customer); return save;}
    @Transactional public Customer getCustomer(Long cID){
        return customerRepository.findById(cID).get();}
    public Customer createCustomer(CustomerSignUp cSignUp) {
        Customer customer=Customer.cfrom(cSignUp);
//        Customer customer=Customer.builder()
//                .cID(cSignUp.getCID())
//                .cPW(cSignUp.getCPW())
//                .cName(cSignUp.getCName())
//                .cPhoneNumber(cSignUp.getCPhoneNumber()).build();
        Customer save=customerRepository.save(customer); return save;}
}