package br.com.hospital.controller;

import java.io.IOException;
import java.sql.SQLException;

import application.Main;
import br.com.hospital.DAO.EnfermeiroDAO;
import br.com.hospital.DAO.MedicoDAO;
import br.com.hospital.model.Enfermeiro;
import br.com.hospital.model.Medico;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EnfermeiroControl extends Main{

    @FXML
    private TextField txtNomeEnfermeiro;

    @FXML
    private Button btnEntrar;

    @FXML
    private TextField numCpf;

    @FXML
    private TextField txtSexo;

    @FXML
    private TextField txtTipoSanguineo;

    @FXML
    private TextField statusEnfermeiro;

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtSenha;

    @FXML
    private Button btnEntrar1;

    @FXML
    private TextField numIdade;

    @FXML
    private TextField statusCivil;

    @FXML
    private TextField numRegistro;

    @FXML
    void SalvarEnfermeiro(ActionEvent event) throws SQLException, IOException {
    	Enfermeiro e = new Enfermeiro(); 
    	EnfermeiroDAO  eDAO = new EnfermeiroDAO();
		e.setNome(txtNomeEnfermeiro.getText());
    	e.setCpf(numCpf.getText());
    	e.setIdade(numIdade.getText());
    	e.setTipoSanguineo(txtTipoSanguineo.getText());
    	e.setSexo(txtSexo.getText());
    	e.setStatusPessoa(statusEnfermeiro.getText());
    	e.setLogin(txtLogin.getText());
    	e.setSenha(txtSenha.getText());
    	e.setStatusUsuario(statusCivil.getText());
		e.setNumeroderegistro(Integer.parseInt(numRegistro.getText()));
		eDAO.save(e);
        openpage(Rotas.DASH);
    }

    @FXML
    void voltaTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
