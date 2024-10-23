package com.spring_boot_employee_management.employee_management.services;

import com.spring_boot_employee_management.employee_management.domain.Cargo;

import java.util.List;

public interface CargoService {

    void salvar(Cargo cargo);
    void editar(Cargo cargo);
    void excluir(Long id);
    Cargo buscarPorId(Long id);
    List<Cargo> buscarTodos();
}
