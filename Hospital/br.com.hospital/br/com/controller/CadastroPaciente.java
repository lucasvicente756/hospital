package br.com.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

public class CadastroPaciente {

    @FXML
    private TextField txtLogin;

    @FXML
    private Button btnEnviar;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private RadioButton chkSexoF;

    @FXML
    private RadioButton chkStatusAtivo;

    @FXML
    private SplitMenuButton cboTipo;

    @FXML
    private TextField txtNome;

    @FXML
    private RadioButton chkSexoM;

    @FXML
    private TextField txtCpf;

    @FXML
    private RadioButton chkStatusDesativo;

    @FXML
    private DatePicker cboDatanasc;

    @FXML
    void enviar(ActionEvent event) {

    }

    @FXML
    void limpar(ActionEvent event) {

    }

}
