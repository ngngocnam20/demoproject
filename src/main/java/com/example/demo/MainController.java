package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UserRepository repository;

    @GetMapping("")
    public String showHomePage(Model model)
    {
        List<User> listUsers = (List<User>) repository.findAll();
        model.addAttribute("listUsers",listUsers );
        return "index";
    }
}
