package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Cart;
import com.example.ecommercemain.repository.CartRepository;
import com.example.ecommercemain.signup.CreateCart;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service @RequiredArgsConstructor
public class CartService {
    private final CartRepository cartRepository;
    public Cart createCart(CreateCart createCart){
        Cart cart= Cart.cartfrom(createCart);
        Cart save=cartRepository.save(cart); return save;}
    @Transactional public Cart getCart(Long id){
        return cartRepository.findById(id).get();}
}