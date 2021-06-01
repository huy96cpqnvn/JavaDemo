package com.example.demofevsbe.service;

import com.example.demofevsbe.entity.StudentEntity;
import com.example.demofevsbe.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public StudentEntity addStudent(StudentEntity studentEntity) {
        StudentEntity student = studentRepo.save(studentEntity);
        return student;
    }

    @Override
    public List<StudentEntity> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public StudentEntity getStudentById(int id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public StudentEntity editStudent(StudentEntity studentEntity) {
        StudentEntity student = studentRepo.save(studentEntity);
        return student;
    }

    @Override
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }
}
