package br.com.hospital.controller;

import java.io.IOException;
import java.sql.SQLException;
import application.Main;
import br.com.hospital.DAO.GerenteDAO;
import br.com.hospital.model.Gerente;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GerenteControl extends Main{

    @FXML
    private TextField nomeGerente;

    @FXML
    private Button btnEntrar;

    @FXML
    private TextField numCpf;

    @FXML
    private TextField txtSexo;

    @FXML
    private TextField txtTipoSanguineo;

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtSenha;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField numIdade;

    @FXML
    private TextField statusFuncionario;

    @FXML
    private TextField statusCivil;

    @FXML
    private TextField txtCargo;

    @FXML
    void SalvarGerente(ActionEvent event) throws IOException, SQLException {
    	Gerente g = new Gerente(); 
    	GerenteDAO  gDAO = new GerenteDAO();
		g.setNome(nomeGerente.getText());
    	g.setCpf(numCpf.getText());
    	g.setIdade(numIdade.getText());
    	g.setTipoSanguineo(txtTipoSanguineo.getText());
    	g.setSexo(txtSexo.getText());
    	g.setStatusPessoa(statusFuncionario.getText());
    	g.setLogin(txtLogin.getText());
    	g.setSenha(txtSenha.getText());
    	g.setStatusUsuario(statusCivil.getText());
		g.setCargo(txtCargo.getText());
		gDAO.save(g);
		openpage(Rotas.DASH);
    }

    @FXML
    void voltaTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
