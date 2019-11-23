package br.com.hospital.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hospital.conexao.Conexao;
import br.com.hospital.model.Funcionario;

public class FuncionarioDAO {
	public void save(Funcionario f) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		System.out.println(conn.getStatus());
		String sqlInsere = "insert into Funcionario VALUES(?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			stmt.setInt(1, f.getIdFuncionario());
			stmt.setString(2,f.getLogin());
			stmt.setString(3,f.getSenha());
			stmt.setString(4,f.getStatusUsuario());
			stmt.execute();
			stmt.close();
}
	public List<Funcionario> select() {
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		try {

			Conexao conn = new Conexao();
			Connection conexao = conn.getConnection();
			System.out.println(conn.getStatus());
			String sqlInsere = "select * from Funcionario";
			PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				Funcionario fun = new Funcionario();
				
				fun.setLogin(rs.getString("login"));
				fun.setSenha(rs.getString("senha"));
				fun.setStatusUsuario(rs.getString("statususuario"));
				funcionarios.add(fun);
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return funcionarios;
	}
	
	public void remove(Funcionario f) throws SQLException {
		Conexao conn = new Conexao();
		Connection conexao = conn.getConnection();
		String sqlInsere = "DELETE from Funcionario where id =(?)";
		PreparedStatement stmt = conexao.prepareStatement(sqlInsere);
		stmt.setInt(1, f.getIdFuncionario());
		System.out.println(f.getIdFuncionario());
		stmt.execute();

	}
}
