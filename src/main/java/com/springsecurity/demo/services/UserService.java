package com.springsecurity.demo.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.UUID;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springsecurity.demo.entities.User;
import com.springsecurity.demo.repositories.UserRepository;

@Service
public class UserService {

    //whenever we create obj of UserService default contruster will run
    //private List<User> store = new ArrayList<>();

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // public UserService() {

    //     store.add(new User(UUID.randomUUID().toString(),"pankaj", "pankaj@gmail.com"));
    //     store.add(new User(UUID.randomUUID().toString(),"arjo", "arjo@gmail.com"));
    //     store.add(new User(UUID.randomUUID().toString(),"mohit", "mohit@gmail.com"));
    //     store.add(new User(UUID.randomUUID().toString(),"tejas", "tejas@gmail.com"));
    // }
    
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }
    public User createUser(User user)
    {
        user.setUserId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    
}
