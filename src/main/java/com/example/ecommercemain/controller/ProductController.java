package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Customer;
import com.example.ecommercemain.domain.Product;
import com.example.ecommercemain.service.ProductService;
import com.example.ecommercemain.signup.CreateProductList;
import com.example.ecommercemain.signup.CustomerSignUp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/create/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping
    public Product createProduct(@RequestBody CreateProductList cpl){
        Product product=productService.createProduct(cpl);return product;}
    @GetMapping("/product/{pID}")
    public Product getProduct(@PathVariable Long pID){
        return productService.getProduct(pID);}
//    @PostMapping("/pConfirm")
//    public String pConfirm(@RequestBody ProductConfirm confirm){
//        return productService.pconfirm(confirm);}
@PutMapping ("/{pID}")
public Product updateCustomer(@PathVariable Long pID, @RequestBody CreateProductList cpl){
    Product pUpdated=productService.updateProduct(pID,cpl); return pUpdated;}
    @DeleteMapping("/{pID}")
    public void deleteProduct(@PathVariable Long pID){
        productService.deleteProduct(pID);}

}