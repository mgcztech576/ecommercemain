package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Customer;
import com.example.ecommercemain.login.LoginRequest;
import com.example.ecommercemain.repository.CustomerRepository;
import com.example.ecommercemain.signup.CustomerSignUp;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service @RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    @Transactional public Customer getCustomer(Long cID){
        return customerRepository.findById(cID).get();}
    public Customer createCustomer(CustomerSignUp cSignUp) {
        Customer customer=CustomerSignUp.cfrom(cSignUp);
        Customer save=customerRepository.save(customer); return save;}
    public String login(LoginRequest req){
        Customer reqCustomer= customerRepository.findByCName(req.getCName());
        if(reqCustomer.getCPW().longValue()==Long.parseLong(req.getCPW())){
            return "Success";} return "Fail";}
}