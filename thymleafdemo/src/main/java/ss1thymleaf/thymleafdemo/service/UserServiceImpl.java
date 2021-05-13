package ss1thymleaf.thymleafdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ss1thymleaf.thymleafdemo.entity.UserEntity;
import ss1thymleaf.thymleafdemo.repository.UserRepo;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserEntity addUser(UserEntity userEntity) {
        UserEntity user = userRepo.save(userEntity);
        return user;
    }

    @Override
    public List<UserEntity> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public UserEntity getUserById(int id) {
        return userRepo.findById(id).get();
    }

    @Override
    public UserEntity editUser(UserEntity userEntity) {
        UserEntity user = userRepo.save(userEntity);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        userRepo.deleteById(id);
    }
}
