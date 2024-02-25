package com.noWhat.noWhat.Repository;

import com.noWhat.noWhat.Entities.Order;
import com.noWhat.noWhat.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
