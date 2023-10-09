package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Customer;
import com.example.ecommercemain.service.CustomerService;
import com.example.ecommercemain.signup.CustomerSignUp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController @RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    @PostMapping("/create/customer")
    public Customer createCustomer(@RequestBody CustomerSignUp cSignUp){
        Customer customer1=Customer.builder().build();
        customerService.createCustomer();return customer1;}
    @GetMapping("/customer/{cID}")
    public Customer getCustomer(@PathVariable Long cID){
        return customerService.getCustomer(cID);}
}