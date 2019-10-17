package br.com.hospital.controller;

import java.io.IOException;

import application.Main;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AtendimentoControl extends Main{

    @FXML
    private Button salvar;

    @FXML
    private DatePicker Data;

    @FXML
    private TextField numAltura;

    @FXML
    private TextArea txtComentarioMedico;

    @FXML
    private TextArea txtComentarioEnfermeiro;

    @FXML
    private TextField txtDoenca;

    @FXML
    private Button voltaTela;

    @FXML
    private TextField numPeso;

    @FXML
    void salvarDados(ActionEvent event) {
    	
    }

    @FXML
    void voltaTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
