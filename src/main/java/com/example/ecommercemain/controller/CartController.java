package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Cart;
import com.example.ecommercemain.loginnConfirm.ProductConfirm;
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
    @GetMapping("/cart/{cartID}")
    public Cart getCart(@PathVariable Long cartID){
        return cartService.getCart(cartID);}
    @PostMapping("/pConfirm")//장바구니가 있고, 장바구니에 특정 물품이 있는지 확인
    public String pConfirm(@RequestBody ProductConfirm confirm){
        return cartService.pconfirm(confirm);}
}