package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Product;
import com.example.ecommercemain.repository.ProductRepository;
import com.example.ecommercemain.signup.CreateProductList;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service @RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public Product createProduct(CreateProductList cpl){
        Product product=Product.pfrom(cpl);
        Product save=productRepository.save(product); return save;}
    @Transactional public Product getProduct(Long id){
        return productRepository.findById(id).get();}
}