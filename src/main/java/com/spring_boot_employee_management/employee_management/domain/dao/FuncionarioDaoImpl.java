package com.spring_boot_employee_management.employee_management.domain.dao;

import com.spring_boot_employee_management.employee_management.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario,Long> implements FuncionarioDao {
}
