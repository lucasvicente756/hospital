package br.com.hospital.controller;

import java.awt.TextField;
import java.io.IOException;

import application.Main;
import br.com.hospital.DAO.EnfermidadeDAO;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class EnfermidadeControl extends Main{

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTipo;

    @FXML
    private Button btnEntrar;

    @FXML
    private TextArea txtDescricao;

    @FXML
    private Button btnVoltar;

    @FXML
    void EntrarSistema(ActionEvent event) {
    }
   


    @FXML
    void voltaTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
