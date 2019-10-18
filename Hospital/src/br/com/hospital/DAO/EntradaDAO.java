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
		String sqlInsere = "INSERT INTO Entrada VALUES(?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setDate(1, java.sql.Date.valueOf(e.getDataEntrada()));
		stmt.setDate(1, java.sql.Date.valueOf(e.getDataSaida()));
		stmt.setString(2, e.getDoenca());
		stmt.execute();
	}
}
