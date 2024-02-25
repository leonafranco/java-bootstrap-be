package com.noWhat.noWhat.Repository;

import com.noWhat.noWhat.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
