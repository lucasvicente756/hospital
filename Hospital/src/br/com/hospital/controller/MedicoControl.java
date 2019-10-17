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
    void SalvarMedico(ActionEvent event) throws SQLException, IOException {
    	String nome = txtNome.getText();
    	String cpf = numCpf.getText();
    	String idade = numIdade.getText();
    	String tipoSanguineo = txtTipoSanguineo.getText();
    	String sexo = txtSexo.getText();
    	String statusPessoa = statusCivil.getText();
    	String login = txtLogin.getText();
    	String senha = txtSenha.getText();
    	String statusUsuario = statusEnfermeiro.getText();
    	int numeroRegistro = Integer.parseInt(numRegistro.getText());
    	String especialidade = txtEspecialidade.getText();
    	Medico m = new Medico(); 
		MedicoDAO  mDAO = new MedicoDAO();
		m.setNome(nome);
    	m.setCpf(cpf);
    	m.setIdade(idade);
    	m.setTipoSanguineo(tipoSanguineo);
    	m.setSexo(sexo);
    	m.setStatusPessoa(statusPessoa);
    	m.setLogin(login);
    	m.setSenha(senha);
    	m.setStatusUsuario(statusUsuario);
		m.setEspecialidade(especialidade);
		m.setNumerodeRegistro(numeroRegistro);
		mDAO.save(m);
		 openpage(Rotas.DASH);
    }

    @FXML
    void voltaTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
