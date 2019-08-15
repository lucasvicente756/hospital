package br.com.model;

public class EnfermidadePessoal {
	
		int idEnfermidadePessoal;
		String cometario;
		String statusDeEnfermidade;
		public int getIdEnfermidadePessoal() {
			return idEnfermidadePessoal;
		}
		public void setIdEnfermidadePessoal(int idEnfermidadePessoal) {
			this.idEnfermidadePessoal = idEnfermidadePessoal;
		}
		public String getCometario() {
			return cometario;
		}
		public void setCometario(String cometario) {
			this.cometario = cometario;
		}
		public String getStatusDeEnfermidade() {
			return statusDeEnfermidade;
		}
		public void setStatusDeEnfermidade(String statusDeEnfermidade) {
			this.statusDeEnfermidade = statusDeEnfermidade;
		}
		public EnfermidadePessoal(int idEnfermidadePessoal, String cometario, String statusDeEnfermidade) {
			super();
			this.idEnfermidadePessoal = idEnfermidadePessoal;
			this.cometario = cometario;
			this.statusDeEnfermidade = statusDeEnfermidade;
		}
		
}
