package br.com.model;

import java.util.List;

public class Paciente extends Pessoa{
	
		private int idPaciente;
		private List<EnfermidadePessoal> doenca;
		private List<Entrada> historico;
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
		public Paciente(int idPessoa, String nome, String cpf, int idade, String tipoSanguineo, String sexo,
				String statusDePessoa, int idPaciente, List<EnfermidadePessoal> doenca, List<Entrada> historico) {
			super(idPessoa, nome, cpf, idade, tipoSanguineo, sexo, statusDePessoa);
			this.idPaciente = idPaciente;
			this.doenca = doenca;
			this.historico = historico;
		}
}
