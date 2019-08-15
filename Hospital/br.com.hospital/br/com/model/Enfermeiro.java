package br.com.model;

public class Enfermeiro extends Funcionario{
	
	int numeroResgitro;

	public int getNumeroResgitro() {
		return numeroResgitro;
	}

	public void setNumeroResgitro(int numeroResgitro) {
		this.numeroResgitro = numeroResgitro;
	}

	public Enfermeiro(int idFuncionario, String login, String senha, String statusDoUsuario, int numeroResgitro) {
		super(idFuncionario, login, senha, statusDoUsuario);
		this.numeroResgitro = numeroResgitro;
	}
	
	
}
