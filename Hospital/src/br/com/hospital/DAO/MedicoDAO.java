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
		String sqlInsere = "INSERT INTO Medico VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setString(1,m.getNome());
		stmt.setString(2, m.getCpf());
		stmt.setInt(3, m.getIdade());
		stmt.setString(4, m.getTipoSanguineo());
		stmt.setString(5, m.getSexo());
		stmt.setString(6, m.getStatusPessoa());
		stmt.setString(7, m.getLogin());
		stmt.setString(8, m.getSenha());
		stmt.setString(9, m.getStatusDeUsuario());
		stmt.setInt(10, m.getNumeroderegistro());
		stmt.setString(11, m.getEspecialidade());

		stmt.execute();
		
	}
	public void removeById(int id) throws SQLException {
		Conexao conn = new  Conexao();
		Connection conexao =  conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "DELETE from medico where id =(?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1,id);
		stmt.execute();
		
	}
	public void select(Medico m) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "SELECT * FROM Medico ";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		
		ResultSet rs = stmt.executeQuery();
		
		List<Medico> medicos = new ArrayList<Medico>();
		
		while(rs.next()) {
			Medico med = new Medico();
			med.setNome(rs.getString("nome"));
			med.setCpf(rs.getString("cpf"));
			med.setIdade(rs.getInt("idade"));
			med.setTipoSanguineo(rs.getString("tipoSanguineo"));
			med.setSexo(rs.getString("sexo"));
			med.setStatusPessoa(rs.getString("statusPessoa"));
			med.setLogin(rs.getString("login"));
			med.setSenha(rs.getString("senha"));
			med.setStatusDeUsuario(rs.getString("statusUsuario"));
			med.setNumeroderegistro(rs.getInt("numeroRegistro"));
			med.setEspecialidade(rs.getString("especialidade"));
			medicos.add(med);
		}
		
		
	}
	public void update(Medico m) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "UPDATE Medico SET(?,?,?,?,?,?,?,?,?,?,?) where id=(?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setString(1,m.getNome());
		stmt.setString(2, m.getCpf());
		stmt.setInt(3, m.getIdade());
		stmt.setString(4, m.getTipoSanguineo());
		stmt.setString(5, m.getSexo());
		stmt.setString(6, m.getStatusPessoa());
		stmt.setString(7, m.getLogin());
		stmt.setString(8, m.getSenha());
		stmt.setString(9, m.getStatusDeUsuario());
		stmt.setInt(10, m.getNumeroderegistro());
		stmt.setString(11, m.getEspecialidade());
		stmt.execute();
	}
}
