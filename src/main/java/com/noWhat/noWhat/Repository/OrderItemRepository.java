package com.noWhat.noWhat.Repository;

import com.noWhat.noWhat.Entities.OrderItem;
import com.noWhat.noWhat.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
