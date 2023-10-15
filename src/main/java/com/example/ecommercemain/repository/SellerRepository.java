package com.example.ecommercemain.repository;
import com.example.ecommercemain.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SellerRepository extends JpaRepository<Seller,Long> {
    Seller findBysName(String sName);
    Seller findBysID(Long sID);
    void deleteBysID(Long sID);
}