package com.springsecurity.demo.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtRequestEntity {
    
    private String email;
    private String password;
}
