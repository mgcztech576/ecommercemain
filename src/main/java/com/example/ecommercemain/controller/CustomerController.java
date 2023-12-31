package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Customer;
import com.example.ecommercemain.loginnConfirm.CustomerLoginRequest;
import com.example.ecommercemain.service.CustomerService;
//import com.example.ecommercemain.service.RedisTestService;
import com.example.ecommercemain.signup.CustomerSignUp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    //private final RedisTestService redisTestService;
    private final CustomerService customerService;
    @PostMapping("/create")
    public Customer createCustomer(@RequestBody CustomerSignUp cSignUp) {
        Customer customer=customerService
                .createCustomer(cSignUp); return customer;}
    //@GetMapping("/get-lock")
    //public String getLock(){return redisTestService.getLock();}
    @GetMapping("/get/{cID}")
    public Customer getCustomer(@PathVariable Long cID){
        return customerService.getCustomer(cID);}
    @GetMapping("/provision")
    public String CustomerProvision(){
        return "고객으로서의 회원 가입을 위해 정보를 제공하신다는 " +
                "약관에 동의하십니까? 원하시면 정보 제공을 요청합니다.";}
    @PostMapping("/cLogin")
    public String cLogin(@RequestBody CustomerLoginRequest cLReq){
        return customerService.cLogin(cLReq);}
    @PutMapping ("/update/{cID}")
    public Customer updateCustomer(@PathVariable Long cID, @RequestBody CustomerSignUp cSignUp){
        Customer cUpdated=customerService.updateCustomer(cID,cSignUp); return cUpdated;}
    @DeleteMapping("/delete/{cID}")
    public void deleteCustomer(@PathVariable Long cID){
        customerService.deleteCustomer(cID);}
}