package com.example.journal.service;


import com.example.journal.entity.User;
import com.example.journal.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService  {
    @Autowired
    private UserRepository userRepository;

    public void saveEntry(User entry){
        userRepository.save(entry);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(ObjectId id){
        return userRepository.findById(id);
    }

    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

    public User updateById(ObjectId id, User newEntry){
        User oldEntry = userRepository.findById(id).orElse(null);
        if(oldEntry != null){
            oldEntry.setUsername(!newEntry.getUsername().isEmpty() ? newEntry.getUsername() : oldEntry.getUsername());
            oldEntry.setPassword(!newEntry.getPassword().isEmpty() ? newEntry.getPassword() : oldEntry.getPassword());
        }
        userRepository.save(oldEntry);
        return oldEntry; // returning after updation
    }

    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }
}