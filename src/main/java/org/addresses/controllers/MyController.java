package org.addresses.controllers;

import org.addresses.models.Employee;
import org.addresses.services.EmployeeService;
import org.addresses.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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
