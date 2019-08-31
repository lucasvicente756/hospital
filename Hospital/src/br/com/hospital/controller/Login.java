package br.com.hospital.controller;

import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {

    @FXML
    private PasswordField txtSenha;

    @FXML
    private TextField txtUsuario;
    
    @FXML
    private Button btnEntrar;

    @FXML
    void openPag1(ActionEvent event) {
		System.out.println(txtUsuario.getText());
		Alert msg = new Alert(Alert.AlertType.INFORMATION, "Usuário: "+ txtUsuario.getText());
		
		msg.show();
    }
    public void msgInfo(String msg) {
    	Alert msgg = new Alert(Alert.AlertType.INFORMATION);
    	msgg.setContentText("Minha msg aqui!");
    	msgg.setHeaderText("Header aqui!");
    	msgg.show();
    }
    
}
