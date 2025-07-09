package com.example.userAuth.dtos;

import lombok.Data;

@Data
public class LoginResponseDto {
    private String token;
    private String username;
}
