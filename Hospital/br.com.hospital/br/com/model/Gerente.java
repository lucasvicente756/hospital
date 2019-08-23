package br.com.model;

public class Gerente extends Funcionario{
	
	private String cargo;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Gerente(int idPessoa, String nome, String cpf, int idade, String tipoSanguineo, String sexo,
			String statusDePessoa, int idFuncionario, String login, String senha, String statusDoUsuario,
			String cargo) {
		super(idPessoa, nome, cpf, idade, tipoSanguineo, sexo, statusDePessoa, idFuncionario, login, senha,
				statusDoUsuario);
		this.cargo = cargo;
	}
	
	
}
