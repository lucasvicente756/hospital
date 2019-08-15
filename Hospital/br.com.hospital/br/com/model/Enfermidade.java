package br.com.model;

public class Enfermidade {
	
	int idEnfermidade;
	String nome;
	String tipo;
	String descricao;
	public int getIdEnfermidade() {
		return idEnfermidade;
	}
	public void setIdEnfermidade(int idEnfermidade) {
		this.idEnfermidade = idEnfermidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Enfermidade(int idEnfermidade, String nome, String tipo, String descricao) {
		super();
		this.idEnfermidade = idEnfermidade;
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
	}
	
}
