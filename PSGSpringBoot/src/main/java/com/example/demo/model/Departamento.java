package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DepartamentoID")
	private Integer departamentoID;
	
	@Column(name = "Nome")
	private String nome;
	
	@Column(name = "Inclusao", nullable = true)
	@Temporal(value = TemporalType.DATE)
	private Date DataInsert;

	public Integer getDepartamentoID() {
		return departamentoID;
	}

	public void setDepartamentoID(Integer departamentoID) {
		this.departamentoID = departamentoID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInsert() {
		return DataInsert;
	}

	public void setDataInsert(Date dataInsert) {
		DataInsert = dataInsert;
	}

	public Departamento(Integer departamentoID, String nome, Date dataInsert) {
		super();
		this.departamentoID = departamentoID;
		this.nome = nome;
		DataInsert = dataInsert;
	}
	
	public Departamento() {}

	@Override
	public String toString() {
		return "Departamento [departamentoID=" + departamentoID + ", nome=" + nome + ", DataInsert=" + DataInsert + "]";
	}
	
}
