package com.spring_boot_employee_management.employee_management.domain.dao;

import com.spring_boot_employee_management.employee_management.domain.Departamento;

import java.util.List;

public interface DepartamentoDao  {

    void save(Departamento departamento);
    void update(Departamento departamento);
    void delete(Long id);
    Departamento findById(Long id);
    List<Departamento> findAll();
}
