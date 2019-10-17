package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Medico;

public class MedicoDAO {
	public void save(Medico m) throws SQLException  {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "INSERT INTO Medico VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,m.getIdFuncionario());
		stmt.setString(2,m.getNome());
		stmt.setString(3, m.getCpf());
		stmt.setString(4, m.getIdade());
		stmt.setString(5, m.getTipoSanguineo());
		stmt.setString(6, m.getSexo());
		stmt.setString(7, m.getStatusPessoa());
		stmt.setString(8, m.getLogin());
		stmt.setString(9, m.getSenha());
		stmt.setString(10, m.getStatusUsuario());
		stmt.setInt(11, m.getNumerodeRegistro());
		stmt.setString(12, m.getEspecialidade());
		stmt.execute();
		
	}
}
