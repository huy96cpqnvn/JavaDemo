package haquanghuy.haquanghuy.service;

import haquanghuy.haquanghuy.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> getAllStudent();
    StudentEntity getStudentById(int id);
    StudentEntity createStudent(StudentEntity p);
}
