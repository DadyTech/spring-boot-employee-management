package com.spring_boot_employee_management.employee_management.services;

import com.spring_boot_employee_management.employee_management.domain.Cargo;
import com.spring_boot_employee_management.employee_management.domain.Departamento;

import java.util.List;

public interface DepartamentoService {


    void salvar(Departamento departamento);
    void editar(Departamento departamento);
    void excluir(Long id);
    Departamento buscarPorId(Long id);
    List<Departamento> buscarTodos();
}
