package com.spring_boot_employee_management.employee_management.services;

import com.spring_boot_employee_management.employee_management.domain.Cargo;
import com.spring_boot_employee_management.employee_management.domain.Funcionario;

import java.util.List;

public interface FuncionarioService {

    void salvar(Funcionario funcionario);
    void editar(Funcionario funcionario);
    void excluir(Long id);
    Funcionario buscarPorId(Long id);
    List<Funcionario> buscarTodos();
}
