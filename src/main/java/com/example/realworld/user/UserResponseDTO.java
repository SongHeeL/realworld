package com.example.realworld.user;

import lombok.Data;

@Data
public class UserResponseDTO {
    private ResponseDTO user;

    @Data
    public static class ResponseDTO {
        private long userID;
        private String username;
        private String email;
        private String password;
        private String bio;
        private String image;
    }
}
