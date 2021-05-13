package ss1thymleaf.thymleafdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ss1thymleaf.thymleafdemo.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {
}
