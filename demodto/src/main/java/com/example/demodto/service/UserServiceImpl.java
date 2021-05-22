package com.example.demodto.service;

import com.example.demodto.entity.UserEntity;
import com.example.demodto.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepo.save(userEntity);
    }
}
