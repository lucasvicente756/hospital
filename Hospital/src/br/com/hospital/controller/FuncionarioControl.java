package br.com.hospital.controller;

import java.io.IOException;
import java.sql.SQLException;
import application.Main;
import br.com.hospital.DAO.FuncionarioDAO;
import br.com.hospital.model.Funcionario;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FuncionarioControl extends Main{

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtSenha;

    @FXML
    private Button btnEntrar;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtStatus;

    @FXML
    void EntrarSistema(ActionEvent event) throws SQLException, IOException {
    	Funcionario f = new Funcionario(); 
		FuncionarioDAO fDAO = new FuncionarioDAO();
		f.setLogin(txtLogin.getText());
		f.setSenha(txtSenha.getText());
		f.setStatusUsuario(txtStatus.getText());
		fDAO.save(f);
		openpage(Rotas.DASH);
		
    }

    @FXML
    void voltarTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
