package br.com.hospital.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import application.Main;
import br.com.hospital.DAO.AtendimentoDAO;
import br.com.hospital.model.Atendimento;
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
    private DatePicker txtData;

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
    void salvarDados(ActionEvent event) throws SQLException, IOException {
    	Atendimento a = new Atendimento(); 
    	AtendimentoDAO  aDAO = new AtendimentoDAO();
    	a.setComentarioEnfermeiro(txtComentarioEnfermeiro.getText());
		a.setComentarioMedico(txtComentarioMedico.getText());
		a.setAltura(Float.parseFloat(numAltura.getText()));
    	a.setPeso(Float.parseFloat(numPeso.getText()));
    	a.setData(txtData.getValue());
    	a.setDoenca(txtDoenca.getText());
		aDAO.save(a);
        openpage(Rotas.DASH);
    }

    @FXML
    void voltaTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
