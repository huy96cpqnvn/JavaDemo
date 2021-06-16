package com.demo.controller;

import com.demo.model.BaseResponse;
import com.demo.model.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity getUser(@RequestParam Map<String, String> allParams){
        List<User> list = userService.getAllUser();
        BaseResponse res = new BaseResponse();
        Map data = new HashMap();
        data.put("users", list);
        res.data = data;
        return ResponseEntity.ok(res);
    }

    @GetMapping("/{userName}")
    public ResponseEntity findUserByUsername(@PathVariable String userName) {
        BaseResponse res = new BaseResponse();
        res.data = userService.findUserByUsername(userName);
        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody User user) {
        BaseResponse res = new BaseResponse();
        res.data = userService.createUser(user);
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{username}")
    public ResponseEntity deleteUser(@PathVariable String username) {
        BaseResponse res = new BaseResponse();
        res.data = userService.deleteUser(username);
        return ResponseEntity.ok(res);
    }

    @PutMapping
    public ResponseEntity updateUser(@RequestBody User user) {
        BaseResponse res = new BaseResponse();
        res.data = userService.updateUser(user);
        return ResponseEntity.ok(res);
    }
}
