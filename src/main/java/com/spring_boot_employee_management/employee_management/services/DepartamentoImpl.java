package com.spring_boot_employee_management.employee_management.services;

import com.spring_boot_employee_management.employee_management.domain.Departamento;
import com.spring_boot_employee_management.employee_management.domain.dao.DepartamentoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DepartamentoImpl implements  DepartamentoService{

     @Autowired
    private DepartamentoDao dao;

    @Override
    @Transactional(readOnly = false)
    public void salvar(Departamento departamento) {
        dao.save(departamento);

    }

    @Override
    @Transactional(readOnly = false)
    public void editar(Departamento departamento) {
         dao.update(departamento);
    }

    @Override
    @Transactional(readOnly = false)
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Departamento buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Departamento> buscarTodos() {
        return dao.findAll();
    }
}
