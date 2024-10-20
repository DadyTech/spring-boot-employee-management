package com.spring_boot_employee_management.employee_management.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "CARGOS")
public class Cargo extends  AbstractEntity<Long> {

    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionario;
    @Column(name = "nome",nullable = false,unique = true,length = 60)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
}
