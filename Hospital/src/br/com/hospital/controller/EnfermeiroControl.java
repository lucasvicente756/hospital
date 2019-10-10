package br.com.hospital.controller;

import java.io.IOException;

import application.Main;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EnfermeiroControl extends Main{

    @FXML
    private TextField txtNomeEnfermeiro;

    @FXML
    private Button btnEntrar;

    @FXML
    private TextField numCpf;

    @FXML
    private TextField txtSexo;

    @FXML
    private TextField txtTipoSanguineo;

    @FXML
    private TextField statusEnfermeiro;

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtSenha;

    @FXML
    private Button btnEntrar1;

    @FXML
    private TextField numIdade;

    @FXML
    private TextField statusCivil;

    @FXML
    private TextField numRegistro;

    @FXML
    void SalvarEnfermeiro(ActionEvent event) {

    }

    @FXML
    void voltaTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
