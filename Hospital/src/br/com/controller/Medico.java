package br.com.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Medico {

    @FXML
    private TextField txtNumeroRegistro;

    @FXML
    private ChoiceBox<?> listEspecialidade;

    @FXML
    private Button btnEnviar;

    @FXML
    void enviar(ActionEvent event) {

    }
}