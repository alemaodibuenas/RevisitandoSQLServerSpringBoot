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
public class FuncionarioDepartamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FuncionarioDepartamentoID")	
	private Integer funcionarioDepartamentoID;
	
	@Column(name = "FuncionarioID")	
	private Integer funcionarioID;
	
	@Column(name = "DepartamentoID")
	private Integer departamentoID;
	
	@Column(name = "DataInicial", nullable = true)
	@Temporal(value = TemporalType.DATE)
	private Date dataInicial;
	
	@Column(name = "DataFinal", nullable = true)
	@Temporal(value = TemporalType.DATE)
	private Date dataFinal;

	public Integer getFuncionarioDepartamentoID() {
		return funcionarioDepartamentoID;
	}

	public void setFuncionarioDepartamentoID(Integer funcionarioDepartamentoID) {
		this.funcionarioDepartamentoID = funcionarioDepartamentoID;
	}

	public Integer getFuncionarioID() {
		return funcionarioID;
	}

	public void setFuncionarioID(Integer funcionarioID) {
		this.funcionarioID = funcionarioID;
	}

	public Integer getDepartamentoID() {
		return departamentoID;
	}

	public void setDepartamentoID(Integer departamentoID) {
		this.departamentoID = departamentoID;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public FuncionarioDepartamento(Integer funcionarioDepartamentoID, Integer funcionarioID, Integer departamentoID,
			Date dataInicial, Date dataFinal) {
		super();
		this.funcionarioDepartamentoID = funcionarioDepartamentoID;
		this.funcionarioID = funcionarioID;
		this.departamentoID = departamentoID;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	@Override
	public String toString() {
		return "FuncionarioDepartamento [funcionarioDepartamentoID=" + funcionarioDepartamentoID + ", funcionarioID="
				+ funcionarioID + ", departamentoID=" + departamentoID + ", dataInicial=" + dataInicial + ", dataFinal="
				+ dataFinal + "]";
	}
	
	public FuncionarioDepartamento() {}		

}
