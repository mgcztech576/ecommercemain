package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Customer;
import com.example.ecommercemain.service.CustomerService;
//import com.example.ecommercemain.service.RedisTestService;
import com.example.ecommercemain.signup.CustomerSignUp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/create/customer")
@RequiredArgsConstructor
public class CustomerController {
    //private final RedisTestService redisTestService;
    private final CustomerService customerService;
    @PostMapping
    public Customer createCustomer(@RequestBody CustomerSignUp cSignUp) {
        Customer customer=customerService
                .createCustomer(cSignUp); return customer;}
//        Customer customer1=Customer.builder()
//                .cID(cSignUp.getCID())
//                .cPW(cSignUp.getCPW())
//                .cName(cSignUp.getCName())
//                .cPhoneNumber(cSignUp.getCPhoneNumber()).build();return customer1;}
    //@GetMapping("/get-lock")
    //public String getLock(){return redisTestService.getLock();}
    @GetMapping("/customer/{cID}")
    public Customer getCustomer(@PathVariable Long cID){
        return customerService.getCustomer(cID);}
}