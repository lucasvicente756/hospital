package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Enfermidade;


public class EnfermidadeDAO {
	public void save(Enfermidade e) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "insert into Enfermidade VALUES(?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setString(1,e.getNome());
			stmt.setString(2,e.getTipo());
			stmt.setString(3,e.getDescricao());
			stmt.execute();
	}
}