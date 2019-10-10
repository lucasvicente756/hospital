package br.com.hospital.controller;

import java.io.IOException;

import application.Main;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AdministradorControl extends Main{

    @FXML
    private Button btnVoltar;

    @FXML
    private Button addFuncionario;

    @FXML
    private Button removeFuncionario;

    @FXML
    private Button alteraFuncionario;

    @FXML
    void addFuncionario(ActionEvent event) throws IOException {
    	openpage(Rotas.FUNCIONARIO);
    }

    @FXML
    void alteraDados(ActionEvent event) {

    }

    @FXML
    void removeDados(ActionEvent event) {

    }

    @FXML
    void voltaTelaLogin(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
