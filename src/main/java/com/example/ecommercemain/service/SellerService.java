package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Seller;
import com.example.ecommercemain.repository.SellerRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
@Service @RequiredArgsConstructor
public class SellerService {
    private final SellerRepository sellerRepository;
    @Transactional public void createSeller(){
        Seller seller= Seller.builder().build();
        sellerRepository.save(seller);}
    @Transactional public Seller getSeller(Long sID){
        return sellerRepository.findById(sID).get();}
}
