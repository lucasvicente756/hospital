package br.com.model;

import java.util.List;

public class Paciente {
	
		int idPaciente;
		List<EnfermidadePessoal> doenca;
		List<Entrada> historico;
		public int getIdPaciente() {
			return idPaciente;
		}
		public void setIdPaciente(int idPaciente) {
			this.idPaciente = idPaciente;
		}
		public List<EnfermidadePessoal> getDoenca() {
			return doenca;
		}
		public void setDoenca(List<EnfermidadePessoal> doenca) {
			this.doenca = doenca;
		}
		public List<Entrada> getHistorico() {
			return historico;
		}
		public void setHistorico(List<Entrada> historico) {
			this.historico = historico;
		}
		public Paciente(int idPaciente, List<EnfermidadePessoal> doenca, List<Entrada> historico) {
			super();
			this.idPaciente = idPaciente;
			this.doenca = doenca;
			this.historico = historico;
		}
		
		
}
