package br.com.model;

public class Gerente extends Funcionario{
	
	String cargo;
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Gerente(int idFuncionario, String login, String senha, String statusDoUsuario, String cargo) {
		super(idFuncionario, login, senha, statusDoUsuario);
		this.cargo = cargo;
	}
	
}
