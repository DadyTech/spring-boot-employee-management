package com.spring_boot_employee_management.employee_management.domain.dao;

import com.spring_boot_employee_management.employee_management.domain.Cargo;

import java.util.List;

public interface CargoDao {

    void save (Cargo cargo);
    void update(Cargo cargo);
    void delete (Long id);
    Cargo findById(Long id);
    List<Cargo> findAll();
}
