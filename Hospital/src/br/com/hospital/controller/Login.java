package br.com.hospital.controller;

import java.io.IOException;

import application.Main;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Login extends Main{

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtSenha;

    @FXML
    private Button btnEntrar;

    @FXML
    void EntrarSistema(ActionEvent event) throws IOException {
    	
    	String Login = txtLogin.getText();
    	String Senha = txtSenha.getText();
    	System.out.println(txtLogin.getText());
    	openpage(Rotas.DASH);
    	}
    	
    }


