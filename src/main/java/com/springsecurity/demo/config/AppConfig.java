package com.springsecurity.demo.config;
//we will configure our user name and password(other than application.properties)


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class AppConfig {
    
    // @Bean
    // public UserDetailsService userDetailsService(){

    //     UserDetails user = User.builder().
    //                        username("pankaj").
    //                        password(passwordEncoder().encode("pankaj123")).
    //                        roles("ADMIN").
    //                        build();
    //     UserDetails user1 = User.builder().
    //                         username("abc").
    //                         password(passwordEncoder().encode("abc")).
    //                         roles("ADMIN").
    //                         build();
    //     //UserDetails user = User.builder().username("pankaj").password("pankaj123").roles("ADMIN").build();
    //     return new InMemoryUserDetailsManager(user,user1);
    // }

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}

//now we will make UserDetailsService as customs means user name pass ab humlog
//database me store karenge
//JWT authentication