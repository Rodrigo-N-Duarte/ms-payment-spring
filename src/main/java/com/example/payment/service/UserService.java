package com.example.payment.service;

import com.example.payment.model.dto.user.RequestCreateUserDTO;
import com.example.payment.model.dto.user.ResponseUserDTO;
import com.example.payment.model.entity.User;
import com.example.payment.repository.UserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class UserService {
    private final ModelMapper mapper;
    private final UserRepository userRepository;

    public ResponseUserDTO create(RequestCreateUserDTO body) {
        var user = mapper.map(body, User.class);
        userRepository.save(user);
        return mapper.map(user, ResponseUserDTO.class);
    }

    public List<ResponseUserDTO> getAll() {
        var users = userRepository.findAll();
        var usersDtos = new ArrayList<ResponseUserDTO>();
        users.forEach(user -> {
            usersDtos.add(mapper.map(user, ResponseUserDTO.class));
        });
        return usersDtos;
    }
}
