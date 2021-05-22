package com.example.demodto.controller;

import com.example.demodto.dto.MapperDto;
import com.example.demodto.dto.UserDto;
import com.example.demodto.entity.UserEntity;
import com.example.demodto.model.BaseResponse;
import com.example.demodto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    MapperDto mapperDto;

    @PostMapping
    private ResponseEntity createUser(@Valid @RequestBody UserDto userDto) {
        BaseResponse res = new BaseResponse();
        UserEntity userEntity = mapperDto.convertToEntity(userDto);
        res.data = userService.createUser(userEntity);
        return ResponseEntity.ok(res);
    }
}
