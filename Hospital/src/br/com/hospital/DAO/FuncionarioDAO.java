package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Funcionario;

public class FuncionarioDAO {
	public void save(Funcionario f) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "insert into Enfermidade VALUES(?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1, f.getIdFuncionario());
			stmt.setString(2,f.getLogin());
			stmt.setString(3,f.getSenha());
			stmt.setString(4,f.getStatusUsuario());
			stmt.execute();
}
}
