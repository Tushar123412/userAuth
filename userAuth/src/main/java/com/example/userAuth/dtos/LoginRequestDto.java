package com.example.userAuth.dtos;

import lombok.Data;

@Data
public class LoginRequestDto {
    private String username;
    private String password;
}
