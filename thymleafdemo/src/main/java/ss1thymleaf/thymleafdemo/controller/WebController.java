package ss1thymleaf.thymleafdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ss1thymleaf.thymleafdemo.entity.UserEntity;
import ss1thymleaf.thymleafdemo.service.UserService;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    UserService userService;

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        String message = "Hello Spring Boot + JSP";
        model.addAttribute("mes", message);
        return "index";
    }

    @GetMapping("/adduser")
    public String addUser(Model model) {
        UserEntity user = new UserEntity();
        model.addAttribute("user", user);
        return "adduser";
    }

    @PostMapping("/adduser")
    public String addUser(@ModelAttribute UserEntity user, Model model) {
        userService.addUser(user);
        return "redirect:/listuser";
    }

    @GetMapping("/listuser")
    public String listUser(Model model) {
        List<UserEntity> users = userService.getAllUser();
        model.addAttribute("users", users);
        return "listuser";
    }

    @GetMapping("/detail/{id}")
    public String getDetail(Model model, @PathVariable int id) {
        UserEntity user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "detail";
    }

    @GetMapping("edit/{id}")
    public String editUser(Model model, @PathVariable int id) {
        UserEntity user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "edit";
    }

    @PostMapping("edit/{id}")
    public String editUser(Model model,@ModelAttribute UserEntity user) {
        userService.editUser(user);
        return "redirect:/listuser";
    }

    @GetMapping("delete/{id}")
    public String delete(Model model, @PathVariable int id) {
        userService.deleteUser(id);
        return "redirect:/listuser";
    }
}
