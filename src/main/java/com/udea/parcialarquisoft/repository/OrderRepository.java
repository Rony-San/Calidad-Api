package com.udea.parcialarquisoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.parcialarquisoft.model.order.Order;

@Repository

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
