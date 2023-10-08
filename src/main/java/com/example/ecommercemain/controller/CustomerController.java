package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Customer;
import com.example.ecommercemain.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController @RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping("/create/customer")
    public String createCart(){
        customerService.createCustomer();return "done";}
    //@PostMapping("/customers")
    //public String createCart(@RequestBody Customer customer){
    //    customerService.createCustomer(customer);return "done";}
    @GetMapping("/customer/{cID}")
    public Customer getCustomer(@PathVariable Long cID){
        return customerService.getCustomer(cID);}
}