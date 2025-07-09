package com.example.userAuth.dtos;

import lombok.Data;

@Data
public class SignupRequestDto {
    private String email;
    private String username;
    private String password;
    private String phoneNumber;

}

