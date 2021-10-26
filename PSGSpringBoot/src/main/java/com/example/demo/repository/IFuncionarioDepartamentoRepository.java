package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FuncionarioDepartamento;

public interface IFuncionarioDepartamentoRepository extends JpaRepository<FuncionarioDepartamento, Integer> {

}
