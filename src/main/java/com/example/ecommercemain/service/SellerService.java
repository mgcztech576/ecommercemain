package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Seller;
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
        Seller seller= Seller.sfrom(seSignUp);
        Seller save=sellerRepository.save(seller); return save;}
}
