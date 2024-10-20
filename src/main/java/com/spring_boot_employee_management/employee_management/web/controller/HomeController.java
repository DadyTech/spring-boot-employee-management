package com.spring_boot_employee_management.employee_management.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
     @GetMapping("/")
    public  String home(){
        return "/home";
    }
}
