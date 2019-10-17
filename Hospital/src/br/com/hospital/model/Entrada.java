package br.com.hospital.model;


import java.sql.Date;
import java.util.List;


public class Entrada {
	private int idEntrada;
	private Date dataEntrada;
	private Date dataSaida;
	private String statusEntrada;
	private String situacaoPaciente;
	public int getIdEntrada() {
		return idEntrada;
	}
	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
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
