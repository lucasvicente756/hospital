package br.com.hospital.model;

import java.sql.Date;
import java.util.List;

public class Atendimento {
	
	private int idAtendimento;
	private String comentarioEnfemeiro;
	private String cometarioMedico;
	private Float peso;
	private Float altura;
	private Date data;
	private List<EnfermidadePessoal> doenca;
	public int getIdAtendimento() {
		return idAtendimento;
	}
	public void setIdAtendimento(int idAtendimento) {
		this.idAtendimento = idAtendimento;
	}
	public String getComentarioEnfemeiro() {
		return comentarioEnfemeiro;
	}
	public void setComentarioEnfemeiro(String comentarioEnfemeiro) {
		this.comentarioEnfemeiro = comentarioEnfemeiro;
	}
	public String getCometarioMedico() {
		return cometarioMedico;
	}
	public void setCometarioMedico(String comtarioMedico) {
		this.cometarioMedico = comtarioMedico;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public Float getAltura() {
		return altura;
	}
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public List<EnfermidadePessoal> getDoenca() {
		return doenca;
	}
	public void setDoenca(List<EnfermidadePessoal> doenca) {
		this.doenca = doenca;
	}
	public Atendimento(int idAtendimento, String comentarioEnfemeiro, String comtarioMedico, Float peso, Float altura,
			Date data, List<EnfermidadePessoal> doenca) {
		super();
		this.idAtendimento = idAtendimento;
		this.comentarioEnfemeiro = comentarioEnfemeiro;
		this.cometarioMedico = comtarioMedico;
		this.peso = peso;
		this.altura = altura;
		this.data = data;
		this.doenca = doenca;
	}
	
	
	
}
