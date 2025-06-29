package com.example.userAuth.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User extends BaseModel{
    private String username;
    private String password;
    private String email;
    @Enumerated(EnumType.STRING)
    private List<Role> roles;
}

