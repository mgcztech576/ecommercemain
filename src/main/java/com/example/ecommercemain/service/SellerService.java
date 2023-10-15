package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Seller;
import com.example.ecommercemain.errornexception.Error;
import com.example.ecommercemain.errornexception.Except;
import com.example.ecommercemain.loginnConfirm.SellerLoginRequest;
import com.example.ecommercemain.repository.SellerRepository;
import com.example.ecommercemain.signup.SellerSignUp;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Transactional
@Service @RequiredArgsConstructor
public class SellerService {
    private final SellerRepository sellerRepository;
    @Transactional public Seller getSeller(Long sID){
        return sellerRepository.findById(sID).get();}
    public Seller createSeller(SellerSignUp seSignUp){
        Seller seller= SellerSignUp.sfrom(seSignUp);
        Seller save=sellerRepository.save(seller); return save;}
    public String sLogin(SellerLoginRequest sLReq){
        Seller reqSeller= sellerRepository.findBysName(sLReq.getSName());
        if(reqSeller==null ||reqSeller.getSPW().longValue()!=sLReq.getSPW())
            throw new Except(Error.USER_NO, "Login Error");
        return "OK";}
    public Seller updateSeller(Long sID, SellerSignUp seSignUp){
        Seller saved=sellerRepository.findBysID(sID);
        saved.sUpdate(seSignUp); return saved;}
    public void deleteSeller(Long sID){
        sellerRepository.deleteBysID(sID);}
}