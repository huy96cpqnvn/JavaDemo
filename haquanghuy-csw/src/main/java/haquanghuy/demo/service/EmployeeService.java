package haquanghuy.demo.service;

import haquanghuy.demo.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity addEmployee(EmployeeEntity employeeEntity);
    List<EmployeeEntity> getAllEmployee();
    EmployeeEntity getEmployeeById(int id);
    EmployeeEntity editEmployee(EmployeeEntity employeeEntity);
    void deleteEmployee(int id);
}
