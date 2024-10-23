package com.spring_boot_employee_management.employee_management.services;

import com.spring_boot_employee_management.employee_management.domain.Funcionario;
import com.spring_boot_employee_management.employee_management.domain.dao.FuncionarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(readOnly = true)
public class FuncionarioImpl implements  FuncionarioService{

    @Autowired
    private FuncionarioDao funcionarioDao;


    @Override
    @Transactional(readOnly = false)
    public void salvar(Funcionario funcionario) {
       funcionarioDao.save(funcionario);
    }

    @Override
    @Transactional(readOnly = false)
    public void editar(Funcionario funcionario) {
       funcionarioDao.update(funcionario);
    }

    @Override
    @Transactional(readOnly = false)
    public void excluir(Long id) {
       funcionarioDao.delete(id);
    }

    @Override
    public Funcionario buscarPorId(Long id) {
        return funcionarioDao.findById(id);
    }

    @Override
    public List<Funcionario> buscarTodos() {
        return funcionarioDao.findAll();
    }
}
