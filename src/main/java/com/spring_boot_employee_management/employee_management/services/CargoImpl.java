package com.spring_boot_employee_management.employee_management.services;

import com.spring_boot_employee_management.employee_management.domain.Cargo;
import com.spring_boot_employee_management.employee_management.domain.dao.CargoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(readOnly = false)
public class CargoImpl implements CargoService{

    @Autowired
    private CargoDao cargoDao;



    @Override
    public void salvar(Cargo cargo) {
       cargoDao.save(cargo);
    }

    @Override
    public void editar(Cargo cargo) {
        cargoDao.update(cargo);
    }

    @Override
    public void excluir(Long id) {
       cargoDao.delete(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Cargo buscarPorId(Long id) {
        return cargoDao.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cargo> buscarTodos() {
        return cargoDao.findAll();
    }
}
