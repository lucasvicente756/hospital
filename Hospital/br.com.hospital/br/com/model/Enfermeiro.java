package br.com.model;

public class Enfermeiro extends Funcionario{
	
	private int numeroResgitro;

	public int getNumeroResgitro() {
		return numeroResgitro;
	}

	public void setNumeroResgitro(int numeroResgitro) {
		this.numeroResgitro = numeroResgitro;
	}

	public Enfermeiro(int idPessoa, String nome, String cpf, int idade, String tipoSanguineo, String sexo,
			String statusDePessoa, int idFuncionario, String login, String senha, String statusDoUsuario,
			int numeroResgitro) {
		super(idPessoa, nome, cpf, idade, tipoSanguineo, sexo, statusDePessoa, idFuncionario, login, senha,
				statusDoUsuario);
		this.numeroResgitro = numeroResgitro;
	}


	
}
