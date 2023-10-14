package com.example.ecommercemain.repository;
import com.example.ecommercemain.domain.Cart;
import com.example.ecommercemain.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
    Product findBypName(String pName);
}