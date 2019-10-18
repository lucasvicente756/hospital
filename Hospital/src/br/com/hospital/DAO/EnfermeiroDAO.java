package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Enfermeiro;

public class EnfermeiroDAO {
	public void save(Enfermeiro e) throws SQLException  {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "INSERT INTO Enfermeiro VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,e.getIdFuncionario());
		stmt.setString(2,e.getNome());
		stmt.setString(3, e.getCpf());
		stmt.setString(4, e.getIdade());
		stmt.setString(5, e.getTipoSanguineo());
		stmt.setString(6, e.getSexo());
		stmt.setString(7, e.getStatusPessoa());
		stmt.setString(8, e.getLogin());
		stmt.setString(9, e.getSenha());
		stmt.setString(10, e.getStatusUsuario());
		stmt.setInt(11, e.getNumeroderegistro());
		stmt.execute();
	}
}
