package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Product;
import com.example.ecommercemain.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController @RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/create-product")
    public String createProduct(){
        productService.createProduct();return "done";}
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable Long id){
        return productService.getProduct(id);}
}