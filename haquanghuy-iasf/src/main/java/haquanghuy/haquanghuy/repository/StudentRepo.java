package haquanghuy.haquanghuy.repository;

import haquanghuy.haquanghuy.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {
}
