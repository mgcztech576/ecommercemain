package com.example.ecommercemain.repository;
import com.example.ecommercemain.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findBycName(String cName);
    Customer findBycID(Long cID);
    void deleteBycID(Long cID);
}