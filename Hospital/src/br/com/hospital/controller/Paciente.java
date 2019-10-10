package br.com.hospital.controller;

import java.io.IOException;

import application.Main;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class Paciente extends Main{

    @FXML
    private TextField txtNomePaciente;

    @FXML
    private Button btnEntrar;

    @FXML
    private TextField numCpf;

    @FXML
    private DatePicker nascPaciente;

    @FXML
    private TextField txtSenho;

    @FXML
    private TextField txtTipoSanguineo;

    @FXML
    private TextField statusPaciente;

    @FXML
    private TextField txtDoenca;

    @FXML
    private TextField txtHistorico;

    @FXML
    void SalvarPaciente(ActionEvent event) {

    }
    @FXML
    void voltaTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
