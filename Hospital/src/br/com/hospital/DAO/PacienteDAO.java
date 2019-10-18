package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Atendimento;
import br.com.hospital.model.Paciente;

public class PacienteDAO {
	public void save(Paciente p) throws SQLException  {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "INSERT INTO Paciente VALUES(?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,p.getIdPaciente());
		stmt.setString(2, p.getNome());
		stmt.setString(3, p.getCpf());
		stmt.setString(4, p.getIdade());
		stmt.setString(5, p.getTipoSanguineo());
		stmt.setString(6, p.getSexo());
		stmt.setString(7, p.getStatusPessoa());
		stmt.setString(8, p.getDoenca());
		stmt.setString(9, p.getHistorico());
		stmt.execute();
	}
}
