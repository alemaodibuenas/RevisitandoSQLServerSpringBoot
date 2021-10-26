package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Funcionario;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Integer> {
	
	List<Funcionario> findByChave(Long chave);
	
	@Query(value = "select Max(FuncionarioID) from Funcionario", nativeQuery  = true)
	Integer findByFuncionarioIDMAX();
	
	@Query(value = "select Nome from Funcionario where FuncionarioID between (10001) and (10099)", nativeQuery  = true)
	List<String> teste();	
}
