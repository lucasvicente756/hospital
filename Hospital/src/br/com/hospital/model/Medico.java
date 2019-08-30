package br.com.hospital.model;

public class Medico extends Funcionario{
	
	private int numeroderesgistro;
	private String especialdade;
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
	public Medico(int idPessoa, String nome, String cpf, int idade, String tipoSanguineo, String sexo,
			String statusDePessoa, int idFuncionario, String login, String senha, String statusDoUsuario,
			int numeroderesgistro, String especialdade) {
		super(idPessoa, nome, cpf, idade, tipoSanguineo, sexo, statusDePessoa, idFuncionario, login, senha,
				statusDoUsuario);
		this.numeroderesgistro = numeroderesgistro;
		this.especialdade = especialdade;
	}
	
}
