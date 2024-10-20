package com.spring_boot_employee_management.employee_management.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "CARGOS")
public class Cargo extends  AbstractEntity<Long> {
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
}
