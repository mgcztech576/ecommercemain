package com.example.ecommercemain.service;
import com.example.ecommercemain.domain.Cart;
import com.example.ecommercemain.domain.Product;
import com.example.ecommercemain.loginnConfirm.ProductConfirm;
import com.example.ecommercemain.repository.CartRepository;
import com.example.ecommercemain.repository.ProductRepository;
import com.example.ecommercemain.signup.CreateCart;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service @RequiredArgsConstructor
public class CartService {
    private final CartRepository cartRepository;
    private final ProductRepository productRepository;
    public Cart createCart(CreateCart createCart){
        Cart cart= CreateCart.cartfrom(createCart);
        Cart save=cartRepository.save(cart); return save;}
    @Transactional public Cart getCart(Long id){
        return cartRepository.findById(id).get();}
    public String pconfirm(ProductConfirm confirm){// 물품 확인
        Product productConfirm= productRepository.findByPName(confirm.getPName());
        if(productConfirm.getPID().longValue()==confirm.getPID()){
            return "Success";} return "Fail";}
}