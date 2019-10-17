package br.com.hospital.controller;

import java.io.IOException;
import java.sql.SQLException;

import application.Main;
import br.com.hospital.DAO.EnfermidadePessoalDAO;
import br.com.hospital.model.EnfermidadePessoal;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EnfermidadePessoalControl extends Main{

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextArea txtComentario;

    @FXML
    private TextField txtStatusEnfermidade;

    @FXML
    void salvarEnfermidade(ActionEvent event) throws SQLException, IOException {
    	String statusEnfermidade = txtStatusEnfermidade.getText();
    	String comentario = txtComentario.getText();
    	
    	EnfermidadePessoal e = new EnfermidadePessoal();
    	EnfermidadePessoalDAO ep = new EnfermidadePessoalDAO();
    	e.setStatusDeEnfermidade(statusEnfermidade);
    	e.setComentario(comentario);
    	ep.save(e);
    	 openpage(Rotas.DASH);
    }

    @FXML
    void voltarTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
