package com.noWhat.noWhat.services;

import com.noWhat.noWhat.entities.User;
import com.noWhat.noWhat.repository.UserRepository;
import com.noWhat.noWhat.services.Exceptions.DatabaseException;
import com.noWhat.noWhat.services.Exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        try{
            repository.deleteById(id);
        }catch(EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        }catch(DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User user) {
        try{
            User entity = repository.getReferenceById(id);
            entity.setName(user.getName());
            entity.setPassword(user.getPassword());
            entity.setEmail(user.getEmail());
            entity.setPhone(user.getPhone());
            return repository.save(entity);
        }catch(EntityNotFoundException e){
            throw new ResourceNotFoundException(id);
        }

    }
}
