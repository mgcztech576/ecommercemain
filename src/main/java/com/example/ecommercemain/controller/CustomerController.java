package com.example.ecommercemain.controller;
import com.example.ecommercemain.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController @RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping("/create/customer")
    public String createCart(){
        customerService.createCustomer();
        return "done";}
}