package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Seller;
import com.example.ecommercemain.loginnConfirm.SellerLoginRequest;
import com.example.ecommercemain.repository.SellerRepository;
import com.example.ecommercemain.signup.SellerSignUp;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service @RequiredArgsConstructor
public class SellerService {
    private final SellerRepository sellerRepository;
    @Transactional public Seller getSeller(Long sID){
        return sellerRepository.findById(sID).get();}
    public Seller createSeller(SellerSignUp seSignUp){
        Seller seller= SellerSignUp.sfrom(seSignUp);
        Seller save=sellerRepository.save(seller); return save;}
    public String sLogin(SellerLoginRequest sLReq){
        Seller reqSeller= sellerRepository.findBySName(sLReq.getSName());
        if(reqSeller.getSPW().longValue()==sLReq.getSPW()){
            return "Success";} return "Fail";}
}