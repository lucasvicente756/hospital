package br.com.hospital.model;

public class Administrador extends Gerente{
	
		public int cadastrarFuncionario() {
			return 0;
		}
		public Administrador(int idPessoa, String nome, String cpf, int idade, String tipoSanguineo, String sexo,
			String statusDePessoa, int idFuncionario, String login, String senha, String statusDoUsuario,
			String cargo) {
		super(idPessoa, nome, cpf, idade, tipoSanguineo, sexo, statusDePessoa, idFuncionario, login, senha, statusDoUsuario,
				cargo);
	}

		
		
		
		
		
}
