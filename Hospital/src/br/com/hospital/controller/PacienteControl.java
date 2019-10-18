package br.com.hospital.controller;

import java.io.IOException;
import java.sql.SQLException;

import application.Main;
import br.com.hospital.DAO.PacienteDAO;
import br.com.hospital.model.Paciente;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PacienteControl extends Main{

	@FXML
    private TextField txtNomePaciente;

    @FXML
    private Button btnEntrar;

    @FXML
    private TextField numCpf;

    @FXML
    private TextField txtSexo;

    @FXML
    private TextField txtTipoSanguineo;

    @FXML
    private TextField statusPaciente;

    @FXML
    private TextField txtDoenca;

    @FXML
    private TextField txtHistorico;

    @FXML
    private Button btnEntrar1;

    @FXML
    private TextField numIdade;


    @FXML
    void SalvarPaciente(ActionEvent event) throws SQLException, IOException {
    	Paciente p = new Paciente(); 
    	PacienteDAO  pDAO = new PacienteDAO();
		p.setNome(txtNomePaciente.getText());
    	p.setCpf(numCpf.getText());
    	p.setIdade(numIdade.getText());
    	p.setTipoSanguineo(txtTipoSanguineo.getText());
    	p.setSexo(txtSexo.getText());
    	p.setStatusPessoa(statusPaciente.getText());
    	p.setDoenca(txtDoenca.getText());
    	p.setHistorico(txtHistorico.getText());
    	
		pDAO.save(p);
        openpage(Rotas.DASH);
    }
    @FXML
    void voltaTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
