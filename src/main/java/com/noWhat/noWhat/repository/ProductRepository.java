package com.noWhat.noWhat.repository;

import com.noWhat.noWhat.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
