package br.com.model;

public class Administrador extends Funcionario{
	
		int cadastrarFuncionario;

		public int getCadastrarFuncionario() {
			return cadastrarFuncionario;
		}

		public void setCadastrarFuncionario(int cadastrarFuncionario) {
			this.cadastrarFuncionario = cadastrarFuncionario;
		}

		public Administrador(int idFuncionario, String login, String senha, String statusDoUsuario,
				int cadastrarFuncionario) {
			super(idFuncionario, login, senha, statusDoUsuario);
			this.cadastrarFuncionario = cadastrarFuncionario;
		}
		
		
		
}
