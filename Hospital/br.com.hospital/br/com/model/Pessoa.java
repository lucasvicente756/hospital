package br.com.model;

public class Pessoa {

	private int idPessoa;
	private String nome;
	private String cpf;
	private int idade;
	private String tipoSanguineo;
	private String sexo;
	private String statusDePessoa;
	
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getStatusDePessoa() {
		return statusDePessoa;
	}
	public void setStatusDePessoa(String statusDePessoa) {
		this.statusDePessoa = statusDePessoa;
	}
	public Pessoa(int idPessoa, String nome, String cpf, int idade, String tipoSanguineo, String sexo,
			String statusDePessoa) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.tipoSanguineo = tipoSanguineo;
		this.sexo = sexo;
		this.statusDePessoa = statusDePessoa;
	}
	
	
}


