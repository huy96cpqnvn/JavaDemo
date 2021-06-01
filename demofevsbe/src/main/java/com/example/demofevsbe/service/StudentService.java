package com.example.demofevsbe.service;

import com.example.demofevsbe.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    StudentEntity addStudent(StudentEntity studentEntity);
    List<StudentEntity> getAllStudent();
    StudentEntity getStudentById(int id);
    StudentEntity editStudent(StudentEntity studentEntity);
    void deleteStudent(int id);
}
