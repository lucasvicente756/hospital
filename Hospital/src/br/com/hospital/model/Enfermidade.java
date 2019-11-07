package br.com.hospital.model;

public class Enfermidade {
	private int idEnfermidade;
	private String descricao = "";
	private String nome = "";
	private String tipo = "";

	public void setIdEnfermidade(int idEnfermidade) {
		this.idEnfermidade = idEnfermidade;
	}
	public int getIdEnfermidade() {
		return this.idEnfermidade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return this. tipo;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return this.descricao;
	}

}