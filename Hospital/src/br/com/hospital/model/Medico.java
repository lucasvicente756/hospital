package br.com.hospital.model;

public class Medico extends Funcionario {
	
	private int numerodeRegistro;
	private String especialidade;
	
	public int getNumerodeRegistro() {
		return numerodeRegistro;
	}
	public void setNumerodeRegistro(int numerodeRegistro) {
		this.numerodeRegistro = numerodeRegistro;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}