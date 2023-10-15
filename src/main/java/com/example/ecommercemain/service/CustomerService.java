package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Customer;
import com.example.ecommercemain.domain.Seller;
import com.example.ecommercemain.errornexception.Error;
import com.example.ecommercemain.errornexception.Except;
import com.example.ecommercemain.loginnConfirm.CustomerLoginRequest;
import com.example.ecommercemain.loginnConfirm.SellerLoginRequest;
import com.example.ecommercemain.repository.CustomerRepository;
import com.example.ecommercemain.signup.CustomerSignUp;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Transactional
@Service @RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    @Transactional public Customer getCustomer(Long cID){
        return customerRepository.findById(cID).get();}
    public Customer createCustomer(CustomerSignUp cSignUp) {
        Customer customer=CustomerSignUp.cfrom(cSignUp);
        Customer save=customerRepository.save(customer); return save;}
public String cLogin(CustomerLoginRequest cLReq){
    Customer reqCustomer= customerRepository.findBycName(cLReq.getCName());
    if(reqCustomer==null ||reqCustomer.getCPW().longValue()!=cLReq.getCPW())
        throw new Except(Error.USER_NO, "Login Error");
    return "OK";}
    public Customer updateCustomer(Long cID, CustomerSignUp cSignUp){
        Customer saved=customerRepository.findBycID(cID);
        saved.cUpdate(cSignUp); return saved;}
    public void deleteCustomer(Long cID){
        customerRepository.deleteBycID(cID);}
}