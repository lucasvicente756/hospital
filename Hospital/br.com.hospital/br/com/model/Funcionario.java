package br.com.model;

public class Funcionario {
	
	int idFuncionario;
	String login;
	String senha;
	String statusDoUsuario;
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
	public Funcionario(int idFuncionario, String login, String senha, String statusDoUsuario) {
		super();
		this.idFuncionario = idFuncionario;
		this.login = login;
		this.senha = senha;
		this.statusDoUsuario = statusDoUsuario;
	}
	

}
