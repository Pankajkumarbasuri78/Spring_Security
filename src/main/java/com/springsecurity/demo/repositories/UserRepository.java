package com.springsecurity.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.demo.entities.User;

public interface UserRepository extends JpaRepository<User,String>{

    //Its implementation will be created by jpa
    public Optional<User> findByEmail(String email);
    
}
