package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Customer;
import com.example.ecommercemain.domain.Product;
import com.example.ecommercemain.repository.ProductRepository;
import com.example.ecommercemain.signup.CreateProductList;
import com.example.ecommercemain.signup.CustomerSignUp;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Transactional
@Service @RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    @Transactional public Product getProduct(Long pID){
        return productRepository.findById(pID).get();}
    public Product createProduct(CreateProductList cpl){
        Product product=CreateProductList.pfrom(cpl);
        Product save=productRepository.save(product); return save;}
//    public String pconfirm(ProductConfirm confirm){// 물품 확인
//        Product productConfirm= productRepository.findBypName(confirm.getPName());
//        if(productConfirm.getPID().longValue()==confirm.getPID()){
//            return "Success";} return "Fail";}
public Product updateProduct(Long pID, CreateProductList cpl){
    Product saved=productRepository.findBypID(pID);
    saved.pUpdate(cpl); return saved;}
    public void deleteProduct(Long pID){
        productRepository.deleteBypID(pID);}
}