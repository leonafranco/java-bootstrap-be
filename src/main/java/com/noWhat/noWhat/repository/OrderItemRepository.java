package com.noWhat.noWhat.repository;

import com.noWhat.noWhat.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
