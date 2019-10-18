package br.com.hospital.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class Atendimento {
	private int idAtendimento;
	private String comentarioEnfermeiro;
	private String comentarioMedico;
	private String doenca;
	private LocalDate data;
	private String peso;
	private String altura;
	
	public void setIdAtendimento(int idAtendimento) {
		this.idAtendimento = idAtendimento;
	}
	public int getIdAtendimento() {
		return this.idAtendimento;
	}
	public void setComentarioEnfermeiro(String comentarioEnfermeiro) {
		this.comentarioEnfermeiro = comentarioEnfermeiro;
	}
	public String getComentarioEnfermeiro() {
		return this.comentarioEnfermeiro;
	}
	public void setComentarioMedico(String comentarioMedico) {
		this.comentarioMedico = comentarioMedico;
	}
	public String getComentarioMedico() {
		return this.comentarioMedico;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getPeso() {
		return this.peso;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getAltura() {
		return this.altura;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalDate getData() {
		return this.data;
	}
	public void setDoenca(String  doenca) {
		this.doenca = doenca;
	}
	public String  getDoenca() {
		return this.doenca;
	}
	
}
