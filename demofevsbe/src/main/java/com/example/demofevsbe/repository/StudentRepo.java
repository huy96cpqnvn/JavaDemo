package com.example.demofevsbe.repository;

import com.example.demofevsbe.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {
}
