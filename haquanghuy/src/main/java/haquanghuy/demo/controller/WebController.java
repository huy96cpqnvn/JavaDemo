package haquanghuy.demo.controller;

import haquanghuy.demo.entity.MemberEntity;
import haquanghuy.demo.service.MemberService;
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
    MemberService memberService;

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        String message = "This is Dashboard";
        model.addAttribute("mes", message);
        return "index";
    }

    @GetMapping("/add")
    public String addMember(Model model) {
        MemberEntity member = new MemberEntity();
        model.addAttribute("member", member);
        return "add";
    }

    @PostMapping("/add")
    public String addMember(@ModelAttribute MemberEntity member, Model model) {
        memberService.addMember(member);
        return "redirect:/listmember";
    }

    @GetMapping("/listmember")
    public String listMember(Model model) {
        List<MemberEntity> members = memberService.getAllMember();
        model.addAttribute("members", members);
        return "listmember";
    }

    @GetMapping("/detail/{id}")
    public String getDetail(Model model, @PathVariable int id) {
        MemberEntity member = memberService.getMemberById(id);
        model.addAttribute("member", member);
        return "detail";
    }

    @GetMapping("edit/{id}")
    public String editMember(Model model, @PathVariable int id) {
        MemberEntity member = memberService.getMemberById(id);
        model.addAttribute("member", member);
        return "edit";
    }

    @PostMapping("edit/{id}")
    public String editMember(Model model,@ModelAttribute MemberEntity member) {
        memberService.editMember(member);
        return "redirect:/listmember";
    }

    @GetMapping("delete/{id}")
    public String delete(Model model, @PathVariable int id) {
        memberService.deleteMember(id);
        return "redirect:/listmember";
    }
}
