package com.demo.service;

import com.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAllUser() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new User("Fpt " + i, "123" + i));
        }
        return list;
    }
}
