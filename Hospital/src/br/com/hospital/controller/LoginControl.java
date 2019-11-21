package br.com.hospital.controller;

import java.io.IOException;

import com.mysql.jdbc.Connection;

import application.Main;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControl extends Main{

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private Button btnEntrar;

    @FXML
    void EntrarSistema(ActionEvent event) throws IOException {
    	String login = txtLogin.getText();
    	String senha = txtSenha.getText();
       if(login.equals("lucas") && senha.equals("123")) {
    	   openpage(Rotas.DASH);
    	}else {
    		System.out.println("Login invalido");
    		txtLogin.setText("");
    		txtSenha.setText("");
    	}
    	
    }
}


