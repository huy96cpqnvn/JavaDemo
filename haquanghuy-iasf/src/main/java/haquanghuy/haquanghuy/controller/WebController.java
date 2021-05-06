package haquanghuy.haquanghuy.controller;

import haquanghuy.haquanghuy.entity.StudentEntity;
import haquanghuy.haquanghuy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class WebController {

    @Autowired
    StudentService studentService;

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        List<StudentEntity> students = studentService.getAllStudent();
        model.addAttribute("students", students);
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam Map<String, String> params) {
        model.addAllAttributes(params);
        return "index";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model, @PathVariable int id) {
        StudentEntity student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "detail";

    }

    @GetMapping("/create")
    public String create(Model model) {
        return "create";
    }

    @PostMapping("/create")
    public String create(Model model, @RequestParam Map<String, String> params) {
        String name = params.get("name");
        String code = params.get("code");
        String gender = params.get("gender");
        String email = params.get("email");
        String phone = params.get("phone");
        String birthday = params.get("birthday");
        String country = params.get("country");
        StudentEntity studentEntity = new StudentEntity(name,code,gender,email,phone,birthday,country);
        studentService.createStudent(studentEntity);
        return "index";
    }
}

