package com.spring_boot_employee_management.employee_management.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @GetMapping("/cadastrar")
    public String cadastrar (){
        return "/funcionario/cadastro";
    }
    @RequestMapping("/listar")
    public String listar (){
        return ("/funcionario/lista");
    }
}
