package com.noWhat.noWhat.repository;

import com.noWhat.noWhat.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
