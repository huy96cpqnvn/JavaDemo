package haquanghuy.demo.controller;

import haquanghuy.demo.entity.EmployeeEntity;
import haquanghuy.demo.model.BaseResponse;
import haquanghuy.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public BaseResponse getEmployees(@RequestParam Map<String, String> params) {
        BaseResponse res = new BaseResponse();
        String id = params.get("id");
        if (id != null) {
            res.data = employeeService.getEmployeeById(Integer.parseInt(id));
        } else {
            res.data = employeeService.getAllEmployee();
        }
        return res;
    }

    @PostMapping
    public BaseResponse addEmployees(@RequestBody EmployeeEntity e) {
        BaseResponse res = new BaseResponse();
        res.data = employeeService.addEmployee(e);
        return res;
    }

    @PutMapping
    public BaseResponse updateEmployees(@RequestBody EmployeeEntity e) {
        BaseResponse res = new BaseResponse();
        res.data = employeeService.editEmployee(e);
        return res;
    }

    @DeleteMapping
    public BaseResponse deleteEmployee(@PathVariable int id) {
        BaseResponse res = new BaseResponse();
        employeeService.deleteEmployee(id);
       return res;
    }
}
