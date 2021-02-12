package org.info.controllers;

import org.info.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    private final EmployeeService employeeService;

    @Autowired
    public MyController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/showEmployees")
    public String findHouses(Model model) {
        model.addAttribute("employees", employeeService.findAll());
        return "showEmployees";
    }
}
