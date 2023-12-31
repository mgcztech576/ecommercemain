package com.example.ecommercemain.repository;
import com.example.ecommercemain.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findBypID(Long pID);
    void deleteBypID(Long pID);
}