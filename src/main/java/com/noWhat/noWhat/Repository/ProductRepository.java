package com.noWhat.noWhat.Repository;

import com.noWhat.noWhat.Entities.Category;
import com.noWhat.noWhat.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
