package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Gerente;


public class GerenteDAO {
	public void save(Gerente g) throws SQLException  {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "INSERT INTO Gerente VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,g.getIdFuncionario());
		stmt.setString(2,g.getNome());
		stmt.setString(3, g.getCpf());
		stmt.setString(4, g.getIdade());
		stmt.setString(5, g.getTipoSanguineo());
		stmt.setString(6, g.getSexo());
		stmt.setString(7, g.getStatusPessoa());
		stmt.setString(8, g.getLogin());
		stmt.setString(9, g.getSenha());
		stmt.setString(10, g.getStatusUsuario());
		stmt.setString(11, g.getCargo());
		stmt.execute();
	}
}
