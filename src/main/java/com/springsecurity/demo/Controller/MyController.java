package com.springsecurity.demo.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.demo.models.User;
import com.springsecurity.demo.services.UserService;

@RestController
@RequestMapping("/home")
public class MyController {

    @Autowired
    private UserService userService;

    //http://localhost:8081/home/users

    @GetMapping("/users")
    public List<User> getUser() {

        System.out.println("getting users");
        return this.userService.getUsers();
    }

    //get logged user Principal is interface 
    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal)
    {
        return principal.getName();
    }
}
