package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Cart;
import com.example.ecommercemain.service.CartService;
import com.example.ecommercemain.signup.CreateCart;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/create/cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;
    @PostMapping
    public Cart createCart(@RequestBody CreateCart createCart){
        Cart cart=cartService.createCart(createCart);return cart;}
    @GetMapping("/cart/{id}")
    public Cart getCart(@PathVariable Long id){
        return cartService.getCart(id);}
}