package com.noWhat.noWhat.repository;

import com.noWhat.noWhat.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
