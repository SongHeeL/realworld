package com.example.realworld.user;

import lombok.Builder;
import lombok.Getter;
import javax.validation.constraints.NotNull;

@Getter
public class UserCreateRequestDTO {
    private RequestDTO user;

    @Getter
    @Builder
    public static class RequestDTO{
        @NotNull(message = "사용자 이름은 필수 입력 값 입니다.")
        private String username;

        @NotNull(message = "이메일은 필수 입력 값 입니다.")
        private String email;

        @NotNull(message = "패스워드는는 필수 입력  입니다.")
        private String password;
    }
}
