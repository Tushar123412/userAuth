package com.example.userAuth.controllers;

import com.example.userAuth.dtos.LoginRequestDto;
import com.example.userAuth.dtos.LoginResponseDto;
import com.example.userAuth.dtos.SignupRequestDto;
import com.example.userAuth.dtos.SignupResponseDto;
import com.example.userAuth.services.UserAuthService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserAuthController {
    private final UserAuthService userAuthService;

    public UserAuthController(UserAuthService userAuthService) {
        this.userAuthService = userAuthService;
    }

    @PostMapping("/signup")
    public SignupResponseDto signup(@RequestBody SignupRequestDto signupRequestDto) {
        userAuthService.signup(signupRequestDto);
        return null;
    }

    @PostMapping("/login")
    public LoginResponseDto login(@RequestBody LoginRequestDto loginRequestDto) {
        userAuthService.login(loginRequestDto);
        return null;
    }

    @PostMapping("/logout")
    public boolean logout(@RequestBody String token) {
        userAuthService.logout(token);
        return true;
    }
}
