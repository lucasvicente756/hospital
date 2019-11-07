package br.com.hospital.model;

public class EnfermidadePessoal {
	private int idenfermidadePessoal;
	private String  comentario = "";
	private String  statusdeEnfermidade = "";
	
	public void setIdEnfermidadePessoal(int idenfermidadePessoal) {
		this.idenfermidadePessoal = idenfermidadePessoal;
	}
	public int getIdEnfermidadePessoal() {
		return this. idenfermidadePessoal;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getComentario() {
		return this.comentario;
	}
	public void setStatusDeEnfermidade(String statusDeEnfermidade) {
		this.statusdeEnfermidade = statusDeEnfermidade;
	}
	public String getStatusDeEnfermidade() {
		return this.statusdeEnfermidade;
	}
	
}
