package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Customer;
import com.example.ecommercemain.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController @RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping("/create/customer")
    public String createCart(){
        customerService.createCustomer();return "done";}
    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return customerService.getCustomer(id);}
}