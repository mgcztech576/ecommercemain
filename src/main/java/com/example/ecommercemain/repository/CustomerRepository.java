package com.example.ecommercemain.repository;
import com.example.ecommercemain.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findByCName(String cName);
}