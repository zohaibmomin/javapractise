package com.example.springSecurity.springSecurityAuth.models;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class JwtRequest {
    private String username;
    private String password;
}
