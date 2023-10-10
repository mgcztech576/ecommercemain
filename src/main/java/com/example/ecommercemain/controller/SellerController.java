package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Seller;
import com.example.ecommercemain.service.SellerService;
import com.example.ecommercemain.signup.SellerSignUp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/create/seller")
@RequiredArgsConstructor
public class SellerController {
    private final SellerService sellerService;
    @PostMapping
    public Seller createSeller(@RequestBody SellerSignUp seSignUp){
        Seller seller=sellerService
                .createSeller(seSignUp); return seller;}
    @GetMapping("/seller/{sID}")
    public Seller getSeller(@PathVariable Long sID){
    return sellerService.getSeller(sID);}
}