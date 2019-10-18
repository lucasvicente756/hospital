package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Entrada;

public class EntradaDAO {
	public void save(Entrada e) throws SQLException  {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "INSERT INTO Entrada VALUES(?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,e.getIdEntrada());
		stmt.setDate(2, java.sql.Date.valueOf(e.getDataEntrada()));
		stmt.setDate(3, java.sql.Date.valueOf(e.getDataSaida()));
		stmt.setString(4, e.getSituacaoPaciente());
		stmt.setString(5, e.getStatusEntrada());
		stmt.execute();
	}
}
