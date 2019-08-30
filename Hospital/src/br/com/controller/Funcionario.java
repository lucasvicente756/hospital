package br.com.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Funcionario {

    @FXML
    private TextField txtLogin;

    @FXML
    private Button btnEnviar;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private RadioButton chkStatusAtivo;

    @FXML
    private RadioButton chkStatusDesativo;

    @FXML
    void enviar(ActionEvent event) {

    }

    @FXML
    void limpar(ActionEvent event) {

    }

}