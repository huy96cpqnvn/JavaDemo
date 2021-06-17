package haquanghuy.demo.service;

import haquanghuy.demo.entity.EmployeeEntity;
import haquanghuy.demo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public EmployeeEntity addEmployee(EmployeeEntity employeeEntity) {
        EmployeeEntity employee = employeeRepo.save(employeeEntity);
        return employee;
    }

    @Override
    public List<EmployeeEntity> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public EmployeeEntity getEmployeeById(int id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public EmployeeEntity editEmployee(EmployeeEntity employeeEntity) {
        EmployeeEntity employee = employeeRepo.save(employeeEntity);
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
}
