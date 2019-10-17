package br.com.hospital.controller;

import java.io.IOException;
import java.sql.SQLException;

import application.Main;
import br.com.hospital.DAO.EnfermidadeDAO;
import br.com.hospital.model.Enfermidade;
import br.com.hospital.util.Rotas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EnfermidadeControl extends Main {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTipo;

    @FXML
    private Button btnEntrar;

    @FXML
    private TextArea txtDescricao;

    @FXML
    private Button btnVoltar;

    @FXML
    void EntrarSistema(ActionEvent event) throws SQLException, IOException {
    	String tipo = txtTipo.getText();
    	String nome = txtNome.getText();
    	String descricao = txtDescricao.getText();
    	Enfermidade e = new Enfermidade();
    	EnfermidadeDAO salvar = new EnfermidadeDAO();
    	
    	e.setTipo(tipo);
    	e.setNome(nome);
    	e.setDescricao(descricao);
        salvar.save(e);
        openpage(Rotas.DASH);
    }

    @FXML
    void voltaTela(ActionEvent event) throws IOException {
    	openpage(Rotas.DASH);
    }

}
