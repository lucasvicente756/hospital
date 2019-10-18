package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Atendimento;

public class AtendimentoDAO {
	public void save(Atendimento a) throws SQLException  {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "INSERT INTO Atendimento VALUES(?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,a.getIdAtendimento());
		stmt.setString(2,a.getComentarioEnfermeiro());
		stmt.setString(3, a.getComentarioMedico());
		stmt.setString(4, a.getAltura());
		stmt.setString(5, a.getPeso());
		stmt.setDate(6, java.sql.Date.valueOf(a.getData()));
		stmt.setString(7, a.getDoenca());
		stmt.execute();
	}
}
