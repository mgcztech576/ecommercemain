package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Seller;
import com.example.ecommercemain.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController @RequiredArgsConstructor
public class SellerController {
    private final SellerService sellerService;
    @GetMapping("/create/seller")
    public String createSeller(){
        sellerService.createSeller(); return "done";}
    @GetMapping("/seller/{sID}")
    public Seller getSeller(@PathVariable Long sID){
    return sellerService.getSeller(sID);}
}