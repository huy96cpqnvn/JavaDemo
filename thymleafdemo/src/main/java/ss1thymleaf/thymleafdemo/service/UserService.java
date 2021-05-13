package ss1thymleaf.thymleafdemo.service;

import ss1thymleaf.thymleafdemo.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity addUser(UserEntity userEntity);
    List<UserEntity> getAllUser();
    UserEntity getUserById(int id);
    UserEntity editUser(UserEntity userEntity);
    void deleteUser(int id);
}
