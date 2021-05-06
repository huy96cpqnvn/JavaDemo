package haquanghuy.haquanghuy.service;

import haquanghuy.haquanghuy.entity.StudentEntity;
import haquanghuy.haquanghuy.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<StudentEntity> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public StudentEntity getStudentById(int id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public StudentEntity createStudent(StudentEntity p) {
        return studentRepo.save(p);
    }
}
