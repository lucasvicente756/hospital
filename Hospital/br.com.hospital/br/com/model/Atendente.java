package br.com.model;

public class Atendente extends Funcionario {
	
	int cadastrarPaciente;

	public int getCadastrarPaciente() {
		return cadastrarPaciente;
	}

	public void setCadastrarPaciente(int cadastrarPaciente) {
		this.cadastrarPaciente = cadastrarPaciente;
	}

	public Atendente(int idFuncionario, String login, String senha, String statusDoUsuario, int cadastrarPaciente) {
		super(idFuncionario, login, senha, statusDoUsuario);
		this.cadastrarPaciente = cadastrarPaciente;
	}
	
	
	
}
