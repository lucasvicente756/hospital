package br.com.model;

public class Medico extends Funcionario{
	
	int numeroderesgistro;
	String especialdade;
	public int getNumeroderesgistro() {
		return numeroderesgistro;
	}
	public void setNumeroderesgistro(int numeroderesgistro) {
		this.numeroderesgistro = numeroderesgistro;
	}
	public String getEspecialdade() {
		return especialdade;
	}
	public void setEspecialdade(String especialdade) {
		this.especialdade = especialdade;
	}
	public Medico(int idFuncionario, String login, String senha, String statusDoUsuario, int numeroderesgistro,
			String especialdade) {
		super(idFuncionario, login, senha, statusDoUsuario);
		this.numeroderesgistro = numeroderesgistro;
		this.especialdade = especialdade;
	}
	
}
