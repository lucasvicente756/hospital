package br.com.hospital.model;


import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


public class Entrada {
	private int idEntrada;
	private LocalDate  dataEntrada;
	private LocalDate  dataSaida;
	private String statusEntrada = "";
	private String situacaoPaciente = "";
	public int getIdEntrada() {
		return idEntrada;
	}
	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}
	public LocalDate getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public LocalDate getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}
	public String getStatusEntrada() {
		return statusEntrada;
	}
	public void setStatusEntrada(String statusEntrada) {
		this.statusEntrada = statusEntrada;
	}
	public String getSituacaoPaciente() {
		return situacaoPaciente;
	}
	public void setSituacaoPaciente(String situacaoPaciente) {
		this.situacaoPaciente = situacaoPaciente;
	}
	

}
