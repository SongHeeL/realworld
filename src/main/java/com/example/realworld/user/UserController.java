package com.example.realworld.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity<UserCreateRequestDTO> addUser(@RequestBody @Valid UserCreateRequestDTO userCreateRequestDTO){
        userService.createUser(userCreateRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/user")
    public ResponseEntity<List<UserResponseDTO.ResponseDTO>> getUser(){
        List<UserResponseDTO.ResponseDTO> userResponseDTO = userService.getUser();
        return ResponseEntity.status(HttpStatus.OK).body(userResponseDTO);
    }

    @PutMapping("/user")
    public ResponseEntity<UserUpdateRequestDTO> updateUser(@RequestBody @Valid UserUpdateRequestDTO userUpdateRequestDTO){
        userService.updateUser(userUpdateRequestDTO);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
