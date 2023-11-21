package com.springsecurity.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.springsecurity.demo.models.User;

@Service
public class UserService {

    //whenever we create obj of UserService default contruster will run
    private List<User> store = new ArrayList<>();

    public UserService() {

        store.add(new User(UUID.randomUUID().toString(),"pankaj", "pankaj@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"arjo", "arjo@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"mohit", "mohit@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"tejas", "tejas@gmail.com"));
    }
    
    public List<User> getUsers()
    {
        return this.store;
    }
    
}
