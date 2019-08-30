package br.com.hospital.model;

public class Funcionario extends Pessoa{
	
	private int idFuncionario;
	private String login;
	private String senha;
	private String statusDoUsuario;
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getStatusDoUsuario() {
		return statusDoUsuario;
	}
	public void setStatusDoUsuario(String statusDoUsuario) {
		this.statusDoUsuario = statusDoUsuario;
	}
	public Funcionario(int idPessoa, String nome, String cpf, int idade, String tipoSanguineo, String sexo,
			String statusDePessoa, int idFuncionario, String login, String senha, String statusDoUsuario) {
		super(idPessoa, nome, cpf, idade, tipoSanguineo, sexo, statusDePessoa);
		this.idFuncionario = idFuncionario;
		this.login = login;
		this.senha = senha;
		this.statusDoUsuario = statusDoUsuario;
	}
	
}
