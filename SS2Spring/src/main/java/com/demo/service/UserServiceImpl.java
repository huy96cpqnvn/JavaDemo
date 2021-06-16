package com.demo.service;

import com.demo.datasource.DataSource;
import com.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<User> listUser = DataSource.getListUser();

    @Override
    public List<User> getAllUser() {
        return listUser;
    }

    @Override
    public String createUser(User user) {
        if (user.getName() != null && user.getAddress() != null) {
            listUser.add(user);
            return "success";
        }
        return "fail";
    }

    @Override
    public String deleteUser(String username) {
        User user = findUserByUsername(username);
        if (user != null) {
            listUser.remove(user);
            return "Deleted user success";
        }
        return "user not found";
    }

    @Override
    public User findUserByUsername(String userName) {
        for (User user : listUser) {
            if (user.getName().equalsIgnoreCase(userName)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User updateUser(User user) {
        User userUpdate = findUserByUsername(user.getName());
        if (userUpdate != null) {
            userUpdate.setName(user.getName());
            userUpdate.setAddress(user.getAddress());
        }
        return userUpdate;
    }
}
