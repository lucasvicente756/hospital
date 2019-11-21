package br.com.hospital.controller;

import java.io.IOException;

import application.Main;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EditarFuncControl extends Main{

    @FXML
    private Button btnVoltar;

    @FXML
    private Button btnEntrar;

    @FXML
    void EntrarSistema(ActionEvent event) {
    	
    }

    @FXML
    void voltarTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
