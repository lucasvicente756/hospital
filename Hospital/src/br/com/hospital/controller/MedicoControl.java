package br.com.hospital.controller;

import java.io.IOException;
import java.sql.SQLException;

import application.Main;
import br.com.hospital.DAO.MedicoDAO;
import br.com.hospital.model.Medico;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MedicoControl extends Main{

    @FXML
    private TextField txtNome;

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
    private TextField txtEspecialidade;

    @FXML
    void salvarMedico(ActionEvent event) throws SQLException, IOException {
    	Medico m = new Medico(); 
		MedicoDAO  mDAO = new MedicoDAO();
		m.setNome(txtNome.getText());
    	m.setCpf(numCpf.getText());
    	m.setIdade(numIdade.getText());
    	m.setTipoSanguineo(txtTipoSanguineo.getText());
    	m.setSexo(txtSexo.getText());
    	m.setStatusPessoa(statusEnfermeiro.getText());
    	m.setLogin(txtLogin.getText());
    	m.setSenha(txtSenha.getText());
    	m.setStatusUsuario(statusCivil.getText());
		m.setEspecialidade(txtEspecialidade.getText());
		m.setNumerodeRegistro(Integer.parseInt(numRegistro.getText()));
		mDAO.save(m);
        openpage(Rotas.DASH);
    }

    @FXML
    void voltaTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
