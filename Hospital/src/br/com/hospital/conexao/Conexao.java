package br.com.hospital.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
    public String status = "n�o conectado";

	public String user ="root";
	 Connection conn = null;
	 String pwd = "";
	 String driverName = "com.mysql.jdbc.Driver";
	 String server ="localhost";
	 String bdName = "hospitallucas";
		 String url ="jdbc:mysql://" + server + ":3306/" + bdName;   
	
public Connection getConnection() {
	try {
		Class.forName(this.driverName);
		this.conn = DriverManager.getConnection(url,user,pwd);
		if(conn != null) {
			this.status = "DADOS FORAM SALVOS!";
		}else	{
			this.status="Banco n�o esta conectado";
		}
		
		
	}catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	return this.conn;
	
}
public String getStatus() {
	return this.status;
}

public boolean closeConnection ()throws SQLException {
	this.conn.close();
	return false;
}

public void resetConnection() {
	try {
		this.closeConnection();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	this.getConnection();
}

}