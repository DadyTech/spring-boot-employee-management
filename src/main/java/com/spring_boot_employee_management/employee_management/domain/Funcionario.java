package com.spring_boot_employee_management.employee_management.domain;

import com.sun.jdi.PrimitiveValue;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
@SuppressWarnings("serial")
@Entity
@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long>{
    @Column(nullable = false,unique = true)
    private  String nome;
    @Column(nullable = false,columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private BigDecimal salario;
    @Column( name = "data_Entrada",nullable = false,columnDefinition = "DATE")
    private LocalDate dataEntrada;
    @Column(name = "data_Saida", columnDefinition = "DATE")
    private LocalDate dataSaida;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;
    @ManyToOne
    @JoinColumn(name = "id_cargo")
    private  Cargo cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }
}
