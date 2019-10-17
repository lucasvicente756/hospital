package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.EnfermidadePessoal;
import br.com.hospital.model.Medico;

public class EnfermidadePessoalDAO {
	
public void save(EnfermidadePessoal ep) throws SQLException {

	Conexao conn = new  Conexao();
	Connection conexao =  conn.getConnection();
	System.out.println(conn.getStatus());
	String sqlInsere = "INSERT INTO EnfermidadePessoal VALUES(?,?,?)";
	PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
	stmt.setInt(1,ep.getIdEnfermidadePessoal());
	stmt.setString(2,ep.getComentario());
	stmt.setString(3,ep.getStatusDeEnfermidade());
	stmt.execute();	
	}
}