package com.spring_boot_employee_management.employee_management.domain.dao;

import com.spring_boot_employee_management.employee_management.domain.Funcionario;

import java.util.List;

public interface FuncionarioDao {

    void save(Funcionario funcionario);
    void update(Funcionario funcionario);
    void delete (Long id);
    Funcionario findById (Long id);
    List<Funcionario> findAll();

}
