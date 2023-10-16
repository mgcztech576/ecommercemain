package com.example.ecommercemain.controller;
import com.example.ecommercemain.domain.Cart;
import com.example.ecommercemain.service.CartService;
import com.example.ecommercemain.signup.CreateCart;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;
    @PostMapping("/create")
    public Cart createCart(@RequestBody CreateCart createCart){
        Cart cart=cartService.createCart(createCart);return cart;}
    @GetMapping("/get/{cartID}")
    public Cart getCart(@PathVariable Long cartID){
        return cartService.getCart(cartID);}
//    @PostMapping("/pConfirm")//장바구니가 있고, 장바구니에 특정 물품이 있는지 확인
//    public String pConfirm(@RequestBody ProductConfirm confirm){
//        return cartService.pconfirm(confirm);}
    @PutMapping ("/update/{cartID}")
    public Cart updateCart(@PathVariable Long cartID, @RequestBody CreateCart createCart){
    Cart cartUpdated=cartService.updateCart(cartID,createCart); return cartUpdated;}
    @DeleteMapping("/delete/{cartID}")
    public void deleteCart(@PathVariable Long cartID){
        cartService.deleteCart(cartID);}
}