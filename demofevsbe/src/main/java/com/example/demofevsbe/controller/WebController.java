package com.example.demofevsbe.controller;

import com.example.demofevsbe.entity.StudentEntity;
import com.example.demofevsbe.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    StudentService studentService;

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        String message = "This is Dashboard";
        model.addAttribute("mes", message);
        return "index";
    }

    @GetMapping("/addstudent")
    public String addStudent(Model model) {
        StudentEntity student = new StudentEntity();
//        List<CategoryEntity> categories = categoryService.getAllCategory();
        model.addAttribute("student", student);
//        model.addAttribute("categories", categories);
        return "addstudent";
    }

    @PostMapping("/addstudent")
    public String addStudent(@ModelAttribute StudentEntity student, Model model) {
        studentService.addStudent(student);
        return "redirect:/liststudent";
    }

    @GetMapping("/liststudent")
    public String listStudent(Model model) {
        List<StudentEntity> students = studentService.getAllStudent();
        model.addAttribute("students", students);
        return "liststudent";
    }

    @GetMapping("/detail/{id}")
    public String getDetail(Model model, @PathVariable int id) {
        StudentEntity student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "detail";
    }

    @GetMapping("edit/{id}")
    public String editStudent(Model model, @PathVariable int id) {
        StudentEntity student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "edit";
    }

    @PostMapping("edit/{id}")
    public String editStudent(Model model,@ModelAttribute StudentEntity student) {
        studentService.editStudent(student);
        return "redirect:/liststudent";
    }

    @GetMapping("delete/{id}")
    public String delete(Model model, @PathVariable int id) {
        studentService.deleteStudent(id);
        return "redirect:/liststudent";
    }

    @GetMapping("/error")
    public String error() {
        return "404";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
