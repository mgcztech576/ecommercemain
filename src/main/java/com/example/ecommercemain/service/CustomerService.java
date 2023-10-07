package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Customer;
import com.example.ecommercemain.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service @RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    @Transactional public void createCustomer(){
        Customer customer=Customer.builder().build();
        customerRepository.save(customer);}
    @Transactional public Customer getCustomer(Long id){
        return customerRepository.findById(id).get();}
}