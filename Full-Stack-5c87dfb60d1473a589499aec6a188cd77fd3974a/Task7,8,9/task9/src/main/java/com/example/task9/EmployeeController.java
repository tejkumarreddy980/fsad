package com.example.task9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository repo;

    // Home page
    @GetMapping("/")
    public String home() {
        return "home";
    }

    // MVC flow
    @GetMapping("/employee")
    public String getEmployee(@RequestParam int id, Model model) {

        Employee emp = repo.findById(id);

        if (emp == null) {
            model.addAttribute("error", "Employee not found for ID: " + id);
        } else {
            model.addAttribute("emp", emp);
        }

        return "employee";
    }
}