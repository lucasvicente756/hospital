package br.com.model;


import java.sql.Date;
import java.util.List;


public class Entrada {
	
	int idEntrada;
	Date dataEntrada;
	Date dataSaida;
	String statusDeEntrada;
	List<Atendimento> SituacaoDoPaciente;
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
	public String getStatusDeEntrada() {
		return statusDeEntrada;
	}
	public void setStatusDeEntrada(String statusDeEntrada) {
		this.statusDeEntrada = statusDeEntrada;
	}
	public List<Atendimento> getSituacaoDoPaciente() {
		return SituacaoDoPaciente;
	}
	public void setSituacaoDoPaciente(List<Atendimento> situacaoDoPaciente) {
		SituacaoDoPaciente = situacaoDoPaciente;
	}
	public Entrada(int idEntrada, Date dataEntrada, Date dataSaida, String statusDeEntrada,
			List<Atendimento> situacaoDoPaciente) {
		super();
		this.idEntrada = idEntrada;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.statusDeEntrada = statusDeEntrada;
		SituacaoDoPaciente = situacaoDoPaciente;
	}

	
}
