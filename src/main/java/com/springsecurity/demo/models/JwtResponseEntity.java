package com.springsecurity.demo.models;
//Create JWTRequest and JWTResponse to receive request data and send Login success response.
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtResponseEntity {

    private String jwtToken;

    private String username;

    
}
