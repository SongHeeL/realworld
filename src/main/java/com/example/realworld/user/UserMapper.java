package com.example.realworld.user;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper {
    void createUser(UserDao userDao);
    void updateUser(UserDao userDao);
    List<UserResponseDTO.ResponseDTO> getUser();
}
