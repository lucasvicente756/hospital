package br.com.hospital.controller;

import java.io.IOException;
import java.sql.SQLException;

import application.Main;
import br.com.hospital.DAO.AtendimentoDAO;
import br.com.hospital.DAO.EntradaDAO;
import br.com.hospital.model.Atendimento;
import br.com.hospital.model.Entrada;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class EntradaControl extends Main{

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    private DatePicker dateEntrada;

    @FXML
    private DatePicker dateSaida;

    @FXML
    private TextField StatusEntrada;

    @FXML
    private TextField statusPaciente;

    @FXML
    void salvarEntrada(ActionEvent event) throws SQLException, IOException {
    	Entrada e = new Entrada(); 
    	EntradaDAO  eDAO = new EntradaDAO();
    	e.setDataEntrada(dateEntrada.getValue());
    	e.setDataSaida(dateSaida.getValue());
    	e.setSituacaoPaciente(StatusEntrada.getText());
    	e.setStatusEntrada(statusPaciente.getText());
		eDAO.save(e);
        openpage(Rotas.DASH);
    }

    @FXML
    void voltarTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
