package com.noWhat.noWhat.Services;

import com.noWhat.noWhat.Entities.Order;
import com.noWhat.noWhat.Entities.User;
import com.noWhat.noWhat.Repository.OrderRepository;
import com.noWhat.noWhat.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
