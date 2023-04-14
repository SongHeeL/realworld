package com.example.realworld.user;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDao {
    private Long userId;
    private String username;
    private String email;
    private String password;
    private String bio;
    private String image;
}
