package com.example.realworld.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;
    public void createUser(UserCreateRequestDTO userCreateRequestDTO){
        UserDao userDao = UserDao.builder()
                .username(userCreateRequestDTO.getUser().getUsername())
                .email(userCreateRequestDTO.getUser().getEmail())
                .password(userCreateRequestDTO.getUser().getPassword())
                .build();
        userMapper.createUser(userDao);
    }

    public void updateUser(UserUpdateRequestDTO userUpdateRequestDTO) {
        UserDao userDao = UserDao.builder()
                .username(userUpdateRequestDTO.getUser().getUsername())
                .email(userUpdateRequestDTO.getUser().getEmail())
                .password(userUpdateRequestDTO.getUser().getPassword())
                .bio(userUpdateRequestDTO.getUser().getBio())
                .image(userUpdateRequestDTO.getUser().getImage())
                .build();
        userMapper.updateUser(userDao);
    }

    public List<UserResponseDTO.ResponseDTO> getUser() {
        return userMapper.getUser();
    }
}
