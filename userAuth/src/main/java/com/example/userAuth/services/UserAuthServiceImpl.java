package com.example.userAuth.services;

import com.example.userAuth.dtos.LoginRequestDto;
import com.example.userAuth.dtos.LoginResponseDto;
import com.example.userAuth.dtos.SignupRequestDto;
import com.example.userAuth.dtos.SignupResponseDto;
import org.springframework.stereotype.Service;

@Service
public class UserAuthServiceImpl implements UserAuthService {
    @Override
    public SignupResponseDto signup(SignupRequestDto signupRequestDto) {
        return null;
    }

    @Override
    public LoginResponseDto login(LoginRequestDto loginRequestDto) {
        return null;
    }

    @Override
    public boolean logout(String token) {
        return false;
    }
}
