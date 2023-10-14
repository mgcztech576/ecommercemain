package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Product;
import com.example.ecommercemain.loginnConfirm.ProductConfirm;
import com.example.ecommercemain.repository.ProductRepository;
import com.example.ecommercemain.signup.CreateProductList;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service @RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    @Transactional public Product getProduct(Long pID){
        return productRepository.findById(pID).get();}
    public Product createProduct(CreateProductList cpl){
        Product product=CreateProductList.pfrom(cpl);
        Product save=productRepository.save(product); return save;}
    public String pconfirm(ProductConfirm confirm){// 물품 확인
        Product productConfirm= productRepository.findBypName(confirm.getPName());
        if(productConfirm.getPID().longValue()==confirm.getPID()){
            return "Success";} return "Fail";}
}