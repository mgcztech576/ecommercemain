package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Product;
import com.example.ecommercemain.service.ProductService;
import com.example.ecommercemain.signup.CreateProductList;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping("/create")
    public Product createProduct(@RequestBody CreateProductList cpl){
        Product product=productService.createProduct(cpl);return product;}
    @GetMapping("/get/{pID}")
    public Product getProduct(@PathVariable Long pID){
        return productService.getProduct(pID);}
//    @PostMapping("/pConfirm")
//    public String pConfirm(@RequestBody ProductConfirm confirm){
//        return productService.pconfirm(confirm);}
@PutMapping ("update/{pID}")
public Product updateCustomer(@PathVariable Long pID, @RequestBody CreateProductList cpl){
    Product pUpdated=productService.updateProduct(pID,cpl); return pUpdated;}
    @DeleteMapping("delete/{pID}")
    public void deleteProduct(@PathVariable Long pID){
        productService.deleteProduct(pID);}
}