package com.example.userAuth.dtos;

import lombok.Data;

@Data
public class SignupResponseDto {
    private String email;
    private String username;
    private boolean status;
}
