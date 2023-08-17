package com.example.payment.controller;

import com.example.payment.model.dto.user.RequestCreateUserDTO;
import com.example.payment.model.dto.user.ResponseUserDTO;
import com.example.payment.model.entity.User;
import com.example.payment.service.UserService;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    @PostMapping
    public ResponseUserDTO create(@Valid @RequestBody RequestCreateUserDTO user) {
        return userService.create(user);
    }
    @GetMapping
    public List<ResponseUserDTO> getAll() {
        return userService.getAll();
    }
}
