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
    @GetMapping("/cart/{cartID}")
    public Cart getCart(@PathVariable Long cartID){
        return cartService.getCart(cartID);}
    @GetMapping("/provision")
    public String Provision(){
        return "회원 가입을 위해 정보를 제공하신다는 " +
                "약관에 동의하십니까? 원하시면 정보 제공을 요청합니다.";}
}