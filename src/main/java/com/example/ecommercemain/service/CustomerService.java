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
    @Transactional public void createCustomer(){
        Customer customer=Customer.builder().build();
        customerRepository.save(customer);}
    @Transactional public Customer getCustomer(Long cID){
        return customerRepository.findById(cID).get();}
    public Customer createCustomer2(CustomerSignUp cSignUp) {
        Customer from=Customer.cfrom(cSignUp);
        Customer save=customerRepository.save(from); return save;}
}