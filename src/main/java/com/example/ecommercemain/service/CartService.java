package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Cart;
import com.example.ecommercemain.repository.CartRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service @RequiredArgsConstructor
public class CartService {
    private final CartRepository cartRepository;
    @Transactional public void createCart(){
        Cart cart= Cart.builder().build();
        cartRepository.save(cart);}
    @Transactional public Cart getCart(Long id){
        return cartRepository.findById(id).get();}
}