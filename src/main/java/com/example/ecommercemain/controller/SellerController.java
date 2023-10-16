package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Seller;
import com.example.ecommercemain.loginnConfirm.SellerLoginRequest;
import com.example.ecommercemain.service.SellerService;
import com.example.ecommercemain.signup.SellerSignUp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/seller")
@RequiredArgsConstructor
public class SellerController {
    private final SellerService sellerService;
    @PostMapping("/create")
    public Seller createSeller(@RequestBody SellerSignUp seSignUp){
        Seller seller=sellerService
                .createSeller(seSignUp); return seller;}
    @GetMapping("/seller/{sID}")
    public Seller getSeller(@PathVariable Long sID){
    return sellerService.getSeller(sID);}
    @GetMapping("/provision")
    public String SellerProvision(){
        return "판매자로서의 회원 가입을 위해 정보를 제공하신다는 " +
                "약관에 동의하십니까? 원하시면 정보 제공을 요청합니다.";}
    @PostMapping("/sLogin")
    public String sLogin(@RequestBody SellerLoginRequest sLReq){
        return sellerService.sLogin(sLReq);}
    @PutMapping ("update/{sID}")
    public Seller updateSeller(@PathVariable Long sID, @RequestBody SellerSignUp seSignUp){
        Seller sUpdated=sellerService.updateSeller(sID,seSignUp); return sUpdated;}
    @DeleteMapping("delete/{sID}")
    public void deleteSeller(@PathVariable Long sID){
        sellerService.deleteSeller(sID);}
}