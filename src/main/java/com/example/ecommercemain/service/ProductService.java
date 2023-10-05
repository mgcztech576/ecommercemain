package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Product;
import com.example.ecommercemain.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service @RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    @Transactional public void createProduct(){
        Product product=Product.builder().build();
        productRepository.save(product);}
}