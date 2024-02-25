package com.noWhat.noWhat.Repository;

import com.noWhat.noWhat.Entities.Category;
import com.noWhat.noWhat.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
