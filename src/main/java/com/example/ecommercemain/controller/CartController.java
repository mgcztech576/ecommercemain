package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Cart;
import com.example.ecommercemain.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController @RequiredArgsConstructor
public class CartController {
    private final CartService cartService;
    @GetMapping("/create/cart") public String createCart(){
        cartService.createCart();return "done";}
    @GetMapping("/cart/{id}")
    public Cart getCart(@PathVariable Long id){
        return cartService.getCart(id);}
}