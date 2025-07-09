package com.example.userAuth.services;

import com.example.userAuth.dtos.LoginRequestDto;
import com.example.userAuth.dtos.LoginResponseDto;
import com.example.userAuth.dtos.SignupRequestDto;
import com.example.userAuth.dtos.SignupResponseDto;

public interface UserAuthService {
    SignupResponseDto signup(SignupRequestDto signupRequestDto);

    LoginResponseDto login(LoginRequestDto loginRequestDto);

    boolean logout(String token);
}
