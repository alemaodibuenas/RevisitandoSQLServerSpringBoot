package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FuncionarioDepartamento;
import com.example.demo.repository.IFuncionarioDepartamentoRepository;

@RestController
@RequestMapping(path = "/api")
public class FuncionarioDepartamentoController {

	@Autowired
	private IFuncionarioDepartamentoRepository repo;

	@GetMapping(path = "/funcionariodepartamento")
	public List<FuncionarioDepartamento> getAll() {
		return this.repo.findAll();
	}

	@GetMapping(path = "/funcionariodepartamento/{id}")
	public FuncionarioDepartamento getById(@PathVariable int id) {
		return this.repo.findById(id).orElse(null);
	}

	@PostMapping(path = "/funcionariodepartamento")
	public FuncionarioDepartamento post(@RequestBody FuncionarioDepartamento func) {
		return this.repo.save(func);
	}

	@DeleteMapping(path = "/funcionariodepartamento/{id}")
	public void delete(@PathVariable int id) {
		if (this.repo.findById(id).orElse(null) != null) {
			this.repo.deleteById(id);
		}
	}

	@PutMapping(path = "/funcionariodepartamento")
	public FuncionarioDepartamento put(@RequestBody FuncionarioDepartamento func) {
		return this.repo.findById(func.getFuncionarioDepartamentoID()).map(cat -> {
			cat.setFuncionarioID(func.getFuncionarioID());
			cat.setDepartamentoID(func.getDepartamentoID());
			cat.setDataInicial(func.getDataInicial());
			cat.setDataFinal(func.getDataFinal());
			return this.repo.save(cat);
		}).orElse(null);
	}

}
